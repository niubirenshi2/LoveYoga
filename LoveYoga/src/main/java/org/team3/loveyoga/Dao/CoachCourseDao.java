package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.CoachCourse;

public interface CoachCourseDao {
    int insert(CoachCourse record);

    int insertSelective(CoachCourse record);
}