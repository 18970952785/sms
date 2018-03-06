package com.malicn.server.cache;

import com.malicn.server.domain.BasePo;

/**
 * Created by yanghuoyun on 2017/4/10.
 */
public interface Cache {

    String ALL = "*";
    String LIST = "LIST";
    String MAP = "MAP";

    void load();

    void insert(BasePo bo);

    void update(BasePo bo);

    void delete(String key);

    BasePo get(String key);
}
