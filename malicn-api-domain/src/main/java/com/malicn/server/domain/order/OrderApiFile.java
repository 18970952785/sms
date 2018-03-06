package com.malicn.server.domain.order;

import com.malicn.server.domain.BasePo;
import lombok.Data;

/**
 * Created by lianrongxiang on 2017/9/18.
 */

@Data
public class OrderApiFile extends BasePo {
    //创建类型 上传人类型(1.货主 2.司机 3.cms用户)

    public static final Byte  CREATOR_TYPE_OWNER  = 1;

    public static final Byte  CREATOR_TYPE_DRIVER  = 2;

    public static final Byte  CREATOR_TYPE_CMS = 3;

    //上传类型
    public static final Byte  FIILE_UNLOAD=6;

    public static final Byte  FIILE_PUTSTORAGE=7;

    public static final Byte ACCEPT= 8;

    public static final Byte IMG = 1;
    public static final Byte MUSIC= 2;
    public static final Byte MEDIA = 3;
    public static final Byte IE = 4;


    private Long id;

    private Long orderId;

    private Byte creatorType;  //上传人类型

    private int chainId;    //cms_order_file  证据链表主键

    /* 1.装货照片 2.唛头 3.出库单 4.电子货单 5.付款凭证 6.卸货照片 7.入库单 8.验收凭证 */
    private Byte fileClass;

    /**1.图片 2.音频 3.视频 4.网页*/
    private Byte fileType;

    private String  fileUrl ; //链接URL

    /* 1.装货照片 2.唛头 3.出库单 4.电子货单 5.付款凭证 6.卸货照片 7.入库单 8.验收凭证 */
    //代码转名称
    public static final   String fileClassName(Byte code){
        String name = "";
        switch (code){
            case 1:
                name="装货照片";
                break;
            case 2:
                name="唛头";
                break;
            case 3:
                name="出库单";
                break;
            case 4:
                name="电子货单";
                break;
            case 5:
                name="付款凭证";
                break;
            case 6:
                name="卸货照片";
                break;
            case 7:
                name="入库单";
                break;
            case 8:
                name="验收凭证";
                break;
        }
        return name;
    }
    /**
     *创建人id
     */
    protected Integer creator;

}
