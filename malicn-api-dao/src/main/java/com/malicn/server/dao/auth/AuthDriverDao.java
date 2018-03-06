package com.malicn.server.dao.auth;

import com.malicn.server.domain.auth.AuthDriver;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface AuthDriverDao {

    /**
     * 查询司机认证信息
     * @param driverId  司机ID
     * @return
     */
    AuthDriver getAuthDriverByDriverId(Long driverId);

    /**
     * 提交司机认证信息
     * @param authDriver
     * @return
     */
    int saveAuthDriver(AuthDriver authDriver);

    /**
     * 查询未审核的司机认证
     * @param driverId  司机ID
     * @return
     */
    AuthDriver getWSHAuthDriverByDriverId(Long driverId);

    /**
     * 查询需要审核的司机列表
     * @param mobile
     * @param realName
     * @return
     */
    List<AuthDriver> getAuthDriverByParams(@Param("mobile") String mobile,
                                           @Param("realName") String realName);

    List<AuthDriver> listAuthDriverByDriverId(Long driverId);


    AuthDriver getAuthDriverById(Long auditId);

    int updateByAuditStatus(@Param("auditId") Long auditId,
                            @Param("auditStatus") Byte auditStatus,
                            @Param("auditRemark") String auditRemark,
                            @Param("idCard")String idCard,
                            @Param("licnExpDate")Date licnExpDate);
}