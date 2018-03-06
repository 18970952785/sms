package com.malicn.server.dao.home;


import com.malicn.server.domain.sys.HomeLink;

import java.util.List;

public interface HomeLinkDao {

    List<HomeLink> getAll();
}