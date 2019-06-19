package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Sign_gym;

public interface Sign_gymDao {
    int insert(Sign_gym record);

    int insertSelective(Sign_gym record);
}