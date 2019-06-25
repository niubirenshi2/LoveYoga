package org.team3.loveyoga.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.StudentDao;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentDao studentDao;
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	

	//通过uid查找学员
	@Override
	public Student findStudentByUid(int userID) {
		// TODO Auto-generated method stub
		return studentDao.findStudentByUid(userID);
	}

	@Override
	public Student findStudentByStudentID(int id) {
		// TODO Auto-generated method stub
		return studentDao.findStudentByStudentID(id);
	}


}
