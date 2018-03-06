package com.malicn.server.domain.web;

import com.malicn.server.domain.BasePo;
import lombok.Data;

/**
 * 加盟
 * Created by lianrongxiang 2017/10/20
 */
@Data
public class Partner  extends BasePo{
    private Integer id;         //主键ID
    private String name;        //姓名
    private String mobile;      //联系电话
    private String city;        //所在城市
    private String industry;    //从事行业
    private String weixin;      //微信号
    private String email;       //邮箱
    private String remark;      //备注留言
    private String clientIp;    //请求IP地址

    private  Byte joinType; //加盟类型 1 城市代理加盟 2物流公司加盟
}
