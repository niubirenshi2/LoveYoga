package org.team3.loveyoga.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Student;

public interface Student_coachDao {
	@Select("select * from y_student_coach where cid=#{cid}")
	List<Student> myStudents(Integer cid);
	
	
}
