package com.malicn.server.dao.auth;

import com.malicn.server.domain.auth.AuthOwner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthOwnerDao {

    /**
     * 插入认证信息
     * @param authOwner
     * @return
     */
    int insert(AuthOwner authOwner);

    /**
     * 插入认证信息
     * @param authOwner
     * @return
     */
    int insertSelective(AuthOwner authOwner);

    int updateByPrimaryKeySelective(AuthOwner authOwner);

    /**
     * 废弃认证信息
     * @param id
     * @return
     */
    int abandonAuthOwner(long id);


    /**
     * 获取货主最新认证信息
     * @param userId
     * @param authType
     * @return
     */
    AuthOwner getAuthingByType(@Param("userId") long userId,@Param("authType") int authType);

    /********************************** cms 1.4.0 ****************************************/
    /**
     * 待审核的货主列表
     * @param auditType
     * @param mobile
     * @param realName
     * @param companyName
     * @return
     */
    List<AuthOwner> getAuthOwnerByParams(@Param("auditType") Byte auditType,
                                         @Param("mobile") String mobile,
                                         @Param("realName") String realName,
                                         @Param("companyName") String companyName);

    /**
     * 审核记录
     * @param ownerId
     * @return
     */
    List<AuthOwner> getAuthOwnerByOwnerId(Long ownerId);

    /**
     * 根据Id查询申请信息
     * @param auditId
     * @return
     */
    AuthOwner getAuthOwnerById(Long auditId);

    /**
     * 更新审核状态
     * @param auditId   主键Id
     * @param auditStatus 1.通过 2不通过
     * @return
     */
    int updateAuditStatus(@Param("auditId") Long auditId,
                          @Param("auditStatus") Byte auditStatus,
                          @Param("auditRemark") String auditRemark);

}