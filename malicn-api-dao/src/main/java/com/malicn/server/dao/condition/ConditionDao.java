package com.malicn.server.dao.condition;


import com.malicn.server.domain.condition.Condition;

import java.util.List;

public interface ConditionDao {

    List<Condition> getAll();

    Condition getInfoById(int id);
}