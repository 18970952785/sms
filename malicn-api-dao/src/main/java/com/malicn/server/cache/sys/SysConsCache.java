package com.malicn.server.cache.sys;

import com.malicn.server.cache.Cache;
import com.malicn.server.dao.sys.SysConsDao;
import com.malicn.server.domain.BasePo;
import com.malicn.server.domain.sys.SysCons;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * Created by yanghuoyun
 * on 2017/4/10.
 */
@Repository("sysConsCache")
public class SysConsCache implements Cache{

    private static final String PRE = "CONS_SYSTEM_";

    private static final String ORDER_SEQ = "ORDER_ID_SEQ_";

    @Resource
    private SysConsDao sysConsDao;

    @Resource(name="jdkTemplate")
    private RedisTemplate redisTemplate;

    @Resource
    private JedisConnectionFactory jedisConnectionFactory;

    @Override
    public void load() {
        redisTemplate.delete(PRE);
        List<SysCons> list = sysConsDao.getAll();
        for (SysCons sc:list){
            insert(sc);
        }
    }

    @Override
    public void insert(BasePo bo) {
        SysCons sysCons = (SysCons) bo;
        BoundValueOperations<String, BasePo> bvo = redisTemplate.boundValueOps(PRE + sysCons.getIdKey());
        bvo.set(bo);
    }

    @Override
    public void update(BasePo bo) {
        insert(bo);
    }

    @Override
    public void delete(String key) {
        redisTemplate.delete(PRE + key);
    }

    @Override
    public BasePo get(String key) {
        BoundValueOperations<String, BasePo> bvo = redisTemplate.boundValueOps(PRE + key);
        return bvo.get();
    }

    public SysCons getByIdKey(String key){
        BasePo po = get(key);
        if(po==null){
            return null;
        }
        return (SysCons)po;
    }

    public String getValue(String key){
        SysCons cons= getByIdKey(key);
        if(cons==null){
            return null;
        }
        return cons.getValue();
    }

    public Long createOrderId(){
        Jedis jedis = jedisConnectionFactory.getConnection().getNativeConnection();
        Long id =jedis.incr(ORDER_SEQ);
        if(id==null||id<1000000){
            jedis.set(ORDER_SEQ,"1000000");
            id = jedis.incr(ORDER_SEQ);
        }
        return randomOrderId(id);
    }

    public static void main(String[] args) {
        SysConsCache sysConsCache = new SysConsCache();
        sysConsCache.createOrderId();
    }

    private Long randomOrderId(Long orderId){
        String id = orderId.toString();

        int len = id.length();
        if(len<3){
            return orderId;
        }
        String start = id.substring(0,len-2);
        char last1 = id.charAt(len-2);
        char last = id.charAt(len-1);
        Random random = new Random();

        int r1 = random.nextInt(10);
        int r2 = random.nextInt(10);
        int r3 = random.nextInt(10);
        StringBuilder sb = new StringBuilder(start);
        sb.append(r1).append(last1)
                .append(r2).append(last)
                .append(r3);
        return Long.parseLong(sb.toString());
    }
}
