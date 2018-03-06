package com.malicn.server.domain.balance;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yuanfei on 2017/5/24.
 */
@Data
public class Withdraw extends BasePo {
   private Long id;              //主键id
   private Long userId;       //司机id
   private Long bankCardId;    //银行卡id
   private String bankCardNo;  //银行卡号
   private Integer cardRegionId; //银行卡开户城市
   private BigDecimal amount;   //提现金额
   private Date createTime;
   private Date auditTime;    //审核时间
   private Byte auditStatus;  //审核状态   0 待审核  1审核通过  2审核不通过
   private String auditRemark;   //标注
   private Date updateTime;    //更新时间
   //@modify qun.xu @date 2017.07.06
   private Byte userType;     //用户类型

   public static final byte DSH = 0;
   public static final byte SHTG = 1;
   public static final byte SHBTG = 2;


   //链表字段
   private  String mobile;  // 手机号码
   private String realName;  //司机姓名


   public static String getauditStatusString(Byte auditStatus){
         String auditStatusName="";
      switch (auditStatus){
         case 0:{
            auditStatusName="待审核";
            break;
         }case 1:{
            auditStatusName="审核通过";
            break;
         }
         case 2:{
            auditStatusName="审核不通过";
            break;
         }
      }
      return auditStatusName;
   }
}
