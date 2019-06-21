package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.UserRole;

public interface UserRoleDao {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}