package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.GymPhoto;

public interface GymPhotoDao {
    int insert(GymPhoto record);

    int insertSelective(GymPhoto record);
}