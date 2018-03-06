package com.malicn.server.cache.sys;

import com.malicn.server.serbean.HistoryContact;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xieqiujin on 2017/6/15.
 */
@Repository
public class HistoryContactDao{

    @Resource(name="jdkTemplate")
    private RedisTemplate redisTemplate;

    private static final String HISTORY_CONTACT_ = "HISTORY_CONTACT_";

    private int MAX_HISTORY_CONTACT = 50;
    /**
     * 保存历史联系人
     * @param historyContact
     */
    public void saveHistoryContact(HistoryContact historyContact) {
        String key = historyContact.getUserId() + "_" + historyContact.getType();

        ListOperations<String, HistoryContact> list = redisTemplate.opsForList();
        for (int i = 0; i < list.size(HISTORY_CONTACT_ + key); i++) {
            //如果redis中的联系人和准备添加的相同，将redis中的删除
            HistoryContact sr = list.index(HISTORY_CONTACT_ + key, i);
            if (sr == null) {
                continue;
            }
            if(sr.getContactMobile()!=null && sr.getContact()!=null){
                if (sr.getContactMobile().equals(historyContact.getContactMobile()) && sr.getContact().equals(historyContact.getContact())) {
                    list.remove(HISTORY_CONTACT_ + key, i, sr);
                }
            }
        }
        //如果已经有50个历史记录了从右边删掉一个，因为是从左边插进去，右边是最早的
        if (list.size(HISTORY_CONTACT_ + key) >= 50) {
            list.rightPop(HISTORY_CONTACT_ + key);
        }
        list.leftPush(HISTORY_CONTACT_ + key, historyContact);
    }
//        redisTemplate.opsForList();
//        //设置队列长度  最多50
//        LimitQueue<HistoryContact> limitQueue = new LimitQueue<>(MAX_HISTORY_CONTACT);
//        ListOperations<String, HistoryContact> list = redisTemplate.opsForList();
//        List<HistoryContact> historyContactList = list.range(HISTORY_CONTACT_ + key, 0, -1);
//        limitQueue.addAll(historyContactList);
//        limitQueue.offer(historyContact);
//        Queue<HistoryContact> historyContactsQueue = limitQueue.getQueue();
//        list.leftPushAll(HISTORY_CONTACT_ + key, historyContactsQueue);
//    }

    /**
     * 获取历史联系人
     * @param userId     用户ID
     * @param regionId  城市ID
     * @param type      类型 1出发   2到达
     * @return
     */
    public List<HistoryContact> getHistoryContact(Long userId, Integer regionId, Byte type) {
        //把用户ID、收货/发货、城市ID合成为一个Key
        String key = userId + "_" + type;
        List<HistoryContact> historyContacts = redisTemplate.opsForList().range(HISTORY_CONTACT_ + key, 0, -1);
        return historyContacts;
    }
}
