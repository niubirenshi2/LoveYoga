package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Roles;

public interface RolesDao {
    int insert(Roles record);

	int insertSelective(Roles record);


}