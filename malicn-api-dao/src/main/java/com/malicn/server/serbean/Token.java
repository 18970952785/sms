package com.malicn.server.serbean;

import com.malicn.server.utils.TokenUtil;

import java.io.Serializable;


public class Token implements Serializable {

    //Token 有效期
    public final static long ACC_TOKEN_EXP = 2 * 3600 * 1000; //2小时
    public final static long REF_TOKEN_EXP = 2400 * 3600 * 1000; //100天

    private static final long serialVersionUID = -5888707740021483901L;

    private String accessToken; // 访问TOKEN
    private String refreshToken; // 刷新TOKEN
    private long expiresIn;      //access token 有效期 的时间点 单位秒
    private long createTime; // 建立时间
    private long userId; // 用户ID

    public Token() {
    }

    public Token(long uid) {
        this.userId = uid;
        this.accessToken = TokenUtil.randomUUID();
        this.refreshToken = TokenUtil.randomUUID();
        this.createTime = System.currentTimeMillis();
        this.expiresIn = createTime + ACC_TOKEN_EXP;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long uid) {
        this.userId = userId;
    }
}
