package com.malicn.server.domain.notice;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Notice extends BasePo {

    /** 查看状态 0未读 1已读 **/
    public static final byte UN_READ = 0;
    public static final byte READED = 1;

    //主键
    private Long id;
    //用户id
    private Long userId;
    //通知所属客户端 1 货主端 2 司机端
    private Byte clientType;
    //通知类型 1 通知-需推送  2 消息-不推送
    private Byte type;
    //通知标题
    private String title;
    //通知内容
    private String content;
    //是否已读 0 未读 1已读
    private Byte isRead;
    //已读时间
    private Date readTime;
}