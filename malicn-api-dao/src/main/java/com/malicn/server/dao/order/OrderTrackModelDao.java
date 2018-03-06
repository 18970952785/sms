package com.malicn.server.dao.order;

import com.malicn.server.domain.order.OrderTrackModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderTrackModelDao {

    List<OrderTrackModel> getAll(@Param("type") int type);

}