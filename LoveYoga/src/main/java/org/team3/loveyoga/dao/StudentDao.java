package org.team3.loveyoga.dao;

import org.apache.ibatis.annotations.Insert;
import org.team3.loveyoga.pojo.Student;

public interface StudentDao {
	
	@Insert("insert into y_student(ys_tel,ys_pwd,ys_createtime,ys_updatetime) values(#{ys_tel},#{ys_pwd},#{ys_createtime},#{ys_updatetime})")
	public void addStudent(Student student);
}
