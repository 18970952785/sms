package com.malicn.server.dao.auth;

import com.malicn.server.domain.auth.AuthVehicle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthVehicleDao {

    /**
     * 根据用户ID去查询车辆认证信息
     * @param userId    用户ID
     * @return
     */
    AuthVehicle getByCarrierId(Long userId);

    /**
     * 保存车辆认证信息
     * @param authVehicle
     * @return
     */
    int saveAuthVehicle(AuthVehicle authVehicle);

    /**
     * 查询未审核的车辆认证信息
     * @param userId   用户ID
     * @return
     */
    AuthVehicle getWSHAuthVehicle(Long userId);

    /**
     * 编辑车辆资料
     * @param authVehicle
     * @return
     */
    int updateAuthVehicle(AuthVehicle authVehicle);


    /**
     * 根据车主ID和车牌号去查询
     * @param plateNo
     * @param carrierId
     * @return
     */
    AuthVehicle getByPlNoUId(@Param("plateNo") String plateNo,
                             @Param("carrierId") Long carrierId);

    /**
     * 逻辑删除车辆认证数据
     * @param authVehicleId
     * @return
     */
    int deleteAuthVehicle(Long authVehicleId);

    /** ================================= cms 审核模块 ======================================= **/
    /**
     * 查询需要审核的车辆列表
     * @param plateNo
     * @return
     */
    List<AuthVehicle> getAuthVehicleByParams(@Param("plateNo") String plateNo,
                                             @Param("auditStatus") String auditStatus);

    /**
     * 查询审核历史
     * @param carrierId
     * @return
     */
    List<AuthVehicle> getAuthVehicleByCarrierId(Long carrierId);

    /**
     * 更新状态
     * @param auditId
     * @param auditStatus
     * @return
     */
    int updateByAuditStatus(@Param("auditId") Long auditId,
                            @Param("auditStatus") Byte auditStatus,
                            @Param("auditRemark") String auditRemark);

    AuthVehicle getById(Long auditId);
}