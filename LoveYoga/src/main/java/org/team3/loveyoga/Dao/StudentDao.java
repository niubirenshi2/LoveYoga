package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Student;

public interface StudentDao {
    int insert(Student record);

    int insertSelective(Student record);
}