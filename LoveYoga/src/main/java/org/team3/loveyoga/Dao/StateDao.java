package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.State;

public interface StateDao {
    int insert(State record);

    int insertSelective(State record);
}