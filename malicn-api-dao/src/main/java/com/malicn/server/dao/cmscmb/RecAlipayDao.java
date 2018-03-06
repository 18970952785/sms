package com.malicn.server.dao.cmscmb;


import com.malicn.server.domain.cmscmb.RecAlipay;

public interface RecAlipayDao {

    int deleteByPrimaryKey(Long flowId);

    int insert(RecAlipay record);

    int insertSelective(RecAlipay record);

    RecAlipay selectByPrimaryKey(Long flowId);

    int updateByPrimaryKeySelective(RecAlipay record);

    int updateByPrimaryKey(RecAlipay record);
}