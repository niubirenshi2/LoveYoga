package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.SignGym;

public interface SignGymDao {
    int insert(SignGym record);

    int insertSelective(SignGym record);
}