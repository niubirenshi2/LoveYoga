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
	//手机注册账号
	@Override
	public void addStudentByTel(Student student) {
		student.setYs_createtime(new Date());
		student.setYs_updatetime(new Date());
		studentDao.addStudentByTel(student);
	}
	//根据手机号查找账号
	@Override
	public Student findStudentByTel(String ys_tel) {
		// TODO Auto-generated method stub
		return studentDao.findStudentByTel(ys_tel);
	}
	//用户名注册账号
	@Override
	public void addStudentByName(Student student) {
		student.setYs_createtime(new Date());
		student.setYs_updatetime(new Date());
		studentDao.addStudentByName(student);
		
	}
	//根据用户名查找账号
	@Override
	public Student findStudentByName(String ys_name) {
		// TODO Auto-generated method stub
		return studentDao.findStudentByName(ys_name);
	}

	@Override
	public void addUid(int ys_uid) {
		studentDao.addUid(ys_uid);
		
	}

}
