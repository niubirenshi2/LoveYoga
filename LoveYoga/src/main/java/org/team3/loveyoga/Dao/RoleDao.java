package org.team3.loveyoga.Dao;

import org.apache.ibatis.annotations.Select;

public interface RoleDao {

	@Select("select roleID from userRole where userID=#{uid} and flag=0")
	Integer findRole(Integer uid);
}
