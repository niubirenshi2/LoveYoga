package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.GymCourse;

public interface GymCourseDao {
    int insert(GymCourse record);

    int insertSelective(GymCourse record);
}