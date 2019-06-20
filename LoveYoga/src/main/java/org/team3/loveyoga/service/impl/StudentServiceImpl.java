package org.team3.loveyoga.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.team3.loveyoga.dao.StudentDao;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.StudentService;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentDao studentDao;
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public void addStudent(Student student) {
		student.setYs_createtime(new Date());
		student.setYs_updatetime(new Date());
		studentDao.addStudent(student);
	}

	@Override
	public Student findStudentByTel(String ys_tel) {
		// TODO Auto-generated method stub
		return studentDao.findStudentByTel(ys_tel);
	}

}
