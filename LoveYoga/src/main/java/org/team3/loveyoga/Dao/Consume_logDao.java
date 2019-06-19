package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Consume_logImg;

public interface Consume_logDao {
    int insert(Consume_logImg record);

    int insertSelective(Consume_logImg record);
}