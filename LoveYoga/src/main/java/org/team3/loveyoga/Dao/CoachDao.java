package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Coach;

public interface CoachDao {
    int insert(Coach record);

    int insertSelective(Coach record);
}