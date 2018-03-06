package com.malicn.server.cache.sys;

import com.malicn.server.serbean.FindVehicle;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * 附近车辆（随机数）
 * Created by xieqiujin on 2017/5/2.
 */
@Repository
public class FindVehicleNumDao{

    private static final String FIND_VEHICLE_NUM_TIME = "FIND_VEHICLE_NUM_TIME_";
    @Resource(name="jdkTemplate")
    private RedisTemplate redisTemplate;

    /**
     * 将附近找到车辆数量放到redis中
     * @param orderId   订单ID
     */
    public void saveFindVehicleNumTime(Long orderId, Integer findVehicleNum) {
        BoundValueOperations<String,FindVehicle> bvo = redisTemplate.boundValueOps(FIND_VEHICLE_NUM_TIME + orderId);
        FindVehicle findVehicle = new FindVehicle();
        findVehicle.setFindVehicleNum(findVehicleNum);
        findVehicle.setUpFindVehicleNumTime(System.currentTimeMillis() / 1000);
        bvo.set(findVehicle);
        bvo.expire(30, TimeUnit.MINUTES);
    }

    /**
     * 获取上次存入时间
     * @param orderId   订单ID
     */
    public FindVehicle getFindVehicleNumTime(Long orderId) {
        BoundValueOperations<String,FindVehicle> bvo = redisTemplate.boundValueOps(FIND_VEHICLE_NUM_TIME + orderId);
        FindVehicle findVehicle =  bvo.get();
        return findVehicle;
    }
}
