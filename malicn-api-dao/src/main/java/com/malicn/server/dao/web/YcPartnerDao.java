package com.malicn.server.dao.web;

import com.malicn.server.domain.web.YcPartner;

import java.util.List;

public interface YcPartnerDao {

    int insert(YcPartner ycPartner);

    List<YcPartner> selectByAll(YcPartner ycPartner);

}