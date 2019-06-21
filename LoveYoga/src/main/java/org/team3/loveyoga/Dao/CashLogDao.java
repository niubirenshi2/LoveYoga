package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.CashLog;

public interface CashLogDao {
    int insert(CashLog record);

    int insertSelective(CashLog record);
}