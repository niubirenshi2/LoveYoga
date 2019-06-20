package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Role;

public interface RoleDao {
    int insert(Role record);

	int insertSelective(Role record);


}