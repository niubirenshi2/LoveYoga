package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Message;

public interface MessageDao {
    int insert(Message record);

    int insertSelective(Message record);
}