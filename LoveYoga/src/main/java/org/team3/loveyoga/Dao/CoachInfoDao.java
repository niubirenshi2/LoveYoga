package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.CoachInfo;

public interface CoachInfoDao {
    int insert(CoachInfo record);

    int insertSelective(CoachInfo record);
}