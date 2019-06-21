package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Circle;

public interface CircleDao {
    int insert(Circle record);

    int insertSelective(Circle record);
}