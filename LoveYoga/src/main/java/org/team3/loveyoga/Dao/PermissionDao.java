package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Permission;

public interface PermissionDao {
    int insert(Permission record);

    int insertSelective(Permission record);
}