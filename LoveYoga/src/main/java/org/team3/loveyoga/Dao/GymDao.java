package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Gym;

public interface GymDao {
    int insert(Gym record);

    int insertSelective(Gym record);
}