package com.malicn.server.cache.home;

import com.malicn.server.cache.Cache;
import com.malicn.server.dao.home.HomeLinkDao;
import com.malicn.server.domain.BasePo;
import com.malicn.server.domain.sys.HomeLink;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 首页消息流模板缓存
 * @author  yanghuoyun
 * @since  2017/4/10.
 */
@Repository("homeLinkCache")
public class HomeLinkCache implements Cache{

    private static final String PRE = "HOME_LINK_";

    @Resource
    private HomeLinkDao homeLinkDao;

    @Resource(name="jdkTemplate")
    private RedisTemplate redisTemplate;

    @Override
    public void load() {
        redisTemplate.delete(redisTemplate.keys(PRE+ALL));
        List<HomeLink> list = homeLinkDao.getAll();
        Map<Integer,HomeLink> map = new HashMap<>();
        for (HomeLink hl:list){
            if(hl==null){
                continue;
            }
            map.put(hl.getId(),hl);
        }
        redisTemplate.opsForList().rightPushAll(PRE+LIST,list);
        redisTemplate.opsForHash().putAll(PRE+MAP,map);
    }

    @Override
    public void insert(BasePo bo) {
        HomeLink con = (HomeLink) bo;
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
        return (HomeLink) redisTemplate.opsForHash().get(PRE+MAP,id);
    }

    public List<HomeLink> getListByIds(int[] ids){
        Map<Integer,HomeLink> map = getMap();
        List<HomeLink> list = new ArrayList<>();
        for (int id: ids) {
            if(map.containsKey(id)){
                list.add(map.get(id));
            }
        }
        return list;
    }

    public Map<Integer,HomeLink> getMap(){
        return redisTemplate.opsForHash().entries(PRE+MAP);
    }

    public HomeLink get(int id){
        return (HomeLink) redisTemplate.opsForHash().get(PRE+MAP,id);
    }

    private List<HomeLink> getAll(){
        List<HomeLink> list = redisTemplate.opsForList().range(PRE + LIST,0,-1);
        return list;
    }

    public List<HomeLink> getAll(Byte clientType){
        List<HomeLink> all = getAll();
        List<HomeLink> list = new ArrayList<>();
        for (HomeLink hl:all) {
            Byte type = hl.getClientType();
            if(type!=null && type.byteValue()==clientType.byteValue()){
                list.add(hl);
            }
        }
        return list;
    }
}
