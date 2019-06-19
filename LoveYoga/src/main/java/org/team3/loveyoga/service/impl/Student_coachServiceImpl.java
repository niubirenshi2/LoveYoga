package org.team3.loveyoga.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.Student_coachDao;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.Student_coachService;

/**
 * 
 * 根据教练id查询所有的学生
 *
 */
@Service("student_coachService")
public class Student_coachServiceImpl implements Student_coachService{
	@Resource
	private Student_coachDao student_coachDao;

	public Student_coachDao getStudent_coachDao() {
		return student_coachDao;
	}

	public void setStudent_coachDao(Student_coachDao student_coachDao) {
		this.student_coachDao = student_coachDao;
	}

	@Override
	public List<Student> myStudents(Integer cid) {
		
		return student_coachDao.myStudents(cid);
	}
	
}
