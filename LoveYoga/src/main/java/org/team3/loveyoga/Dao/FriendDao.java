package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Friend;

public interface FriendDao {
    int insert(Friend record);

    int insertSelective(Friend record);
}