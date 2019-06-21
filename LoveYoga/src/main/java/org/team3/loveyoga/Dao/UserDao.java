package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.User;

public interface UserDao {
    int insert(User record);

	int insertSelective(User record);


}