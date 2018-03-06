package com.malicn.server.dao.web;


import com.malicn.server.domain.web.Partner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  Created by lianrongxiang 2017/10/20
 */
public interface PartnerDao {

    /**
     * 填写加盟申请
     * @param partner
     * @return
     */
    int savePartner(Partner partner);

    List<Partner> selectAllListPartner(@Param("name")String name ,@Param("city") String city);
}
