package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.ConsumeLog;

public interface ConsumeLogDao {
    int insert(ConsumeLog record);

    int insertSelective(ConsumeLog record);
}