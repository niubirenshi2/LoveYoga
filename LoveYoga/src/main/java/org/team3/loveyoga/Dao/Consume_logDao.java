package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Withdrawmoney;

public interface Consume_logDao {
    int insert(Withdrawmoney record);

    int insertSelective(Withdrawmoney record);
}