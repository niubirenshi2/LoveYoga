package org.team3.loveyoga.dao;

import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Student;

public interface StudentDao {
	//通过UID查询学员信息
	@Select("select * from student where userID=#{userID}")
	public Student findStudentByUid(int userID);
	
	//通过学员编号查询学员信息
	@Select("select * from student where studentID=#{studentID}")
	public Student findStudentByStudentID(int studentID);
}
