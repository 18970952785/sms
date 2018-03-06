package com.malicn.server.cache.sys;

import com.malicn.server.domain.storage.Storage;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户历史冷库操作
 * Created by xieqiujin on 2017/4/27.
 */
@Repository
public class HistoryStorageDao{

    @Resource(name="jdkTemplate")
    private RedisTemplate redisTemplate;

    private static final String HISTORY_STORAGE_ = "HISTORY_STORAGE_";
    /**
     * 保存城市冷库
     * @param storage     冷库对象
     * @param userId        用户ID
     * @param regionId      城市ID
     * @param type          类型  1出发地   2到达地
     */
    public void saveHistoryStorage(Storage storage, Long userId, Integer regionId, Integer type) {
        //把用户ID、收货/发货、城市ID合成为一个Key
        String key = userId + "_" + type + "_"+regionId;
        ListOperations<String, Storage> list = redisTemplate.opsForList();
      //  List<storage> storageList = list.range(HISTORY_STORAGE_ + key, 0, -1);
        for(int i = 0; i < list.size(HISTORY_STORAGE_ + key); i++) {
            //如果redis中的冷库和准备添加的相同，将redis中的删除
            Storage sr = list.index(HISTORY_STORAGE_+key,i);
            if(sr==null){
                continue;
            }
            if(sr.getId().longValue() == storage.getId().longValue()) {
                list.remove(HISTORY_STORAGE_ + key, i,sr);
            }
        }
        //如果已经有四个历史记录了从右边删掉一个，因为是从左边插进去，右边是最早的
        if(list.size(HISTORY_STORAGE_ + key) == 4){
            list.rightPop(HISTORY_STORAGE_ + key);
        }
        list.leftPush(HISTORY_STORAGE_ + key,storage);
    }


    /**
     * 获取历史冷库
     * @param userId    用户ID
     * @param regionId  城市ID
     * @param type      类型  1出发地  2到达地
     * @return          历史冷库Set
     */
    public List<Storage> getHistoryStorage(Long userId, Integer regionId, Integer type) {
        //把用户ID、收货/发货、城市ID合成为一个Key
        String key = userId + "_" + type + "_" + regionId;
        List<Storage> storageList = redisTemplate.opsForList().range(HISTORY_STORAGE_ + key, 0, -1);
        return storageList;
    }
}
