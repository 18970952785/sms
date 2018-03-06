package com.malicn.server.cache.order;

import com.malicn.server.cache.Cache;
import com.malicn.server.dao.order.OrderTrackDao;
import com.malicn.server.dao.order.OrderTrackModelDao;
import com.malicn.server.domain.BasePo;
import com.malicn.server.domain.order.OrderTrackModel;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yanghuoyun on 2017/4/10.
 */
@Repository
public class TrackModelCache implements Cache{

    private static final String PRE = "ORDER_TRACK_MODEL_";

    @Resource
    private OrderTrackModelDao orderTrackModelDao;

    @Resource(name="jdkTemplate")
    private RedisTemplate redisTemplate;

    @Override
    public void load() {

        redisTemplate.delete(redisTemplate.keys(PRE+"*"));
        List<OrderTrackModel> ownerList = orderTrackModelDao.getAll(OrderTrackModel.TYPE_OWNER);
        for (int i = 0; i < ownerList.size(); i++){
            OrderTrackModel otm = ownerList.get(i);
            insert(otm);
        }
        redisTemplate.opsForList().rightPushAll(PRE + OrderTrackModel.TYPE_OWNER + "_LIST", ownerList);

        List<OrderTrackModel> driverList = orderTrackModelDao.getAll(OrderTrackModel.TYPE_CARRIER);
        for (int i = 0; i < driverList.size(); i++){
            OrderTrackModel otm = driverList.get(i);
            insert(otm);
        }
        redisTemplate.opsForList().rightPushAll(PRE + OrderTrackModel.TYPE_CARRIER + "_LIST", driverList);
    }

    @Override
    public void insert(BasePo bo) {
        OrderTrackModel otm = (OrderTrackModel) bo;
        BoundValueOperations<String, BasePo> bvo = redisTemplate.boundValueOps(PRE + otm.getId());
        bvo.set(bo);
    }

    @Override
    public void update(BasePo bo) {
//        insert(bo);
    }

    @Override
    public void delete(String key) {
 //       redisTemplate.delete(PRE + key);
    }

    @Override
    public BasePo get(String key) {
        BoundValueOperations<String, OrderTrackModel> bvo = redisTemplate.boundValueOps(PRE + key);
        return bvo.get();
    }

    public List<OrderTrackModel> getAll(){
        List<OrderTrackModel> list = redisTemplate.opsForList().range(PRE + "LIST",0,-1);
        return list;
    }

    public List<OrderTrackModel> getByType(int type) {

        List<OrderTrackModel> list = redisTemplate.opsForList().range(PRE + type + "_LIST",0,-1);
        return list;
    }
}