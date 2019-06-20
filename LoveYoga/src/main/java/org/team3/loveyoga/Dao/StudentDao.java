package org.team3.loveyoga.Dao;

import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Student;

public interface StudentDao {
	@Select("select * from y_student where ys_uid=#{ys_uid}")
	Student selectStudentByUid(Integer ys_uid);
}
