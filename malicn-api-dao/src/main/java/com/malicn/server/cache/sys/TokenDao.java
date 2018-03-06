package com.malicn.server.cache.sys;

import com.malicn.server.serbean.Token;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * token凭证操作接口实现
 */
@Repository
public class TokenDao{

    private static final String ACC_TOKEN_PRE = "CPS_USER_ACC_TOKEN_";
    private static final String REF_TOKEN_PRE = "CPS_USER_REF_TOKEN_";
    
    @Resource(name="jdkTemplate")
    private RedisTemplate redisTemplate;

    /**
     * 保存token
     *
     * @param token token对象
     */
    public void save(Token token) {
        BoundValueOperations<String, String> bvo = redisTemplate.boundValueOps(ACC_TOKEN_PRE + token.getUserId());
        bvo.set(token.getAccessToken());
        bvo.expire(Token.ACC_TOKEN_EXP, TimeUnit.MILLISECONDS);
        //保持refreshToken
        bvo = redisTemplate.boundValueOps(REF_TOKEN_PRE + token.getUserId());
        bvo.set(token.getRefreshToken());
        bvo.expire(Token.REF_TOKEN_EXP, TimeUnit.MILLISECONDS);
    }

    /**
     * 删除rtoken对象
     *
     * @param uid 用户ID
     */
    public void deleteToken(long uid) {
        redisTemplate.delete(ACC_TOKEN_PRE + uid);
        redisTemplate.delete(REF_TOKEN_PRE + uid);

    }

    /**
     * 获取accessToken
     *
     * @param uid 用户ID
     */
    public String getAccessTokenByUid(long uid) {
        BoundValueOperations<String, String> bvo = redisTemplate.boundValueOps(ACC_TOKEN_PRE + uid);
        String accessToken = bvo.get();
     //   System.out.println("查找uid:"+uid+"token:"+accessToken);
        return accessToken;
    }

    /**
     * 获取refreshToken
     *
     * @param uid
     */
    public String getRefreshToken(long uid) {
        BoundValueOperations<String, String> bvo = redisTemplate.boundValueOps(REF_TOKEN_PRE + uid);
        String refreshToken = bvo.get();
        return refreshToken;
    }

    /**
     * 判断用户是否登录
     *
     * @param userId
     * @param accessToken
     * @return
     */
    public boolean isLogined(Long userId, String accessToken) {

        //判断用户是否登录
        boolean logined;
        if (userId == null || userId == 0 || accessToken == null || accessToken.length() == 0) {
            logined = false;
        } else {

            String accessTokenResult = null;
            try {
                accessTokenResult = getAccessTokenByUid(userId);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (accessTokenResult == null || !accessTokenResult.equals(accessToken)) {
                logined = false;
            } else {
                logined = true;
            }
        }
        return logined;
    }


}
