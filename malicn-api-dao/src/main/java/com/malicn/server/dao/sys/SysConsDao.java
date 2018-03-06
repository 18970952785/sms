package com.malicn.server.dao.sys;


import com.malicn.server.domain.sys.SysCons;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface SysConsDao {

    int insert(SysCons sysCons);

    int update(SysCons sysCons);

    int delete(SysCons sysCons);

    SysCons get(String idKey);

    List<SysCons> getAll();

    String getValue(String idKey);

    List<SysCons> getListByModule(String module);

    @MapKey("idKey")
    Map<String,SysCons> getMap(String module);

//    @MapKey("idKey")
//    Map<String,String> getMapByModule(String module);

}