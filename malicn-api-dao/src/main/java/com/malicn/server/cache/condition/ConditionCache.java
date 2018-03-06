package com.malicn.server.cache.condition;

import com.google.common.collect.Lists;
import com.malicn.server.cache.Cache;
import com.malicn.server.dao.condition.ConditionDao;
import com.malicn.server.domain.BasePo;
import com.malicn.server.domain.condition.Condition;
import com.malicn.server.enums.condition.CondCatgryEnum;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yanghuoyun
 * on 2017/4/10.
 */
@Repository("conditionCache")
public class ConditionCache implements Cache{

    private static final String PRE = "SYS_CONDITION_";

    @Resource
    private ConditionDao conditionDao;

    @Resource(name="jdkTemplate")
    private RedisTemplate redisTemplate;

    @Override
    public void load() {
        redisTemplate.delete(redisTemplate.keys(PRE+ALL));
        List<Condition> list = conditionDao.getAll();
        Map<Integer,Condition> map = new HashMap<>();
        for (Condition con:list){
            if(con==null){
                continue;
            }
            map.put(con.getId(),con);
        }
        redisTemplate.opsForList().rightPushAll(PRE+LIST,list);
        redisTemplate.opsForHash().putAll(PRE+MAP,map);
    }

    @Override
    public void insert(BasePo bo) {
        Condition con = (Condition) bo;
        BoundValueOperations<String, BasePo> bvo = redisTemplate.boundValueOps(PRE + con.getId());
        bvo.set(bo);
    }

    @Override
    public void update(BasePo bo) {
        insert(bo);
    }

    @Override
    public void delete(String id) {
        redisTemplate.delete(PRE + id);
    }

    @Override
    public BasePo get(String id) {
        return (Condition) redisTemplate.opsForHash().get(PRE+MAP, Integer.parseInt(id));
    }

    public List<Condition> getListByIds(int[] ids){
        Map<Integer,Condition> map = getMap();
        List<Condition> list = new ArrayList<>();
        for (int id: ids) {
            if(map.containsKey(id)){
                list.add(map.get(id));
            }
        }
        return list;
    }

    public Map<Integer,Condition> getMap(){
        return redisTemplate.opsForHash().entries(PRE+MAP);
    }

    public List<Condition> getAll(){
        List<Condition> list = redisTemplate.opsForList().range(PRE + LIST,0,-1);
        return list;
}

}
