package org.team3.loveyoga.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Student;

public interface Student_coachDao {
	@Select("SELECT * from y_student INNER JOIN y_student_coach ON y_student.ys_id=y_student_coach.uid WHERE cid=#{cid}")
	List<Student> myStudents(Integer cid);
	
	
}
