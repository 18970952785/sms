package com.malicn.server.domain.order;

import com.malicn.server.domain.BasePo;
import lombok.Data;

@Data
public class OrderAssignment extends BasePo{

    private Long orderId;
    private String groupId;
    private String groupName;
    private String creator;
    private String updater;
}