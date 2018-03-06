package com.malicn.server.dao.cloudStorage;

import com.malicn.server.domain.cloudStorage.ResLook;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xieqiujin on 2017/10/24.
 */
public interface ResLookDao {
    int insert(ResLook resLook);
    List<ResLook> list(@Param("storageName") String storageName);
}
