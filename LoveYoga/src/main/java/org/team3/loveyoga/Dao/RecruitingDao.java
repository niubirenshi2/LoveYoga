package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Recruiting;

public interface RecruitingDao {
    int insert(Recruiting record);

    int insertSelective(Recruiting record);
}