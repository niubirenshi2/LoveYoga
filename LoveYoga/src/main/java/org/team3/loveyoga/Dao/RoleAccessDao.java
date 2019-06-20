package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.RoleAccess;

public interface RoleAccessDao {
    int insert(RoleAccess record);

	int insertSelective(RoleAccess record);


}