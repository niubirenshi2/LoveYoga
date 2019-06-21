package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.RolePermission;

public interface RolePermissionDao {
    int insert(RolePermission record);

    int insertSelective(RolePermission record);
}