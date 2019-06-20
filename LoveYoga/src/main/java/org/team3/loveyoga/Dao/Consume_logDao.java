package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Consume_log;

public interface Consume_logDao {
    int insert(Consume_log record);

    int insertSelective(Consume_log record);
}