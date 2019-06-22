package org.team3.loveyoga.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.UploadDao;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.UploadService;

@Service
public class UploadServiceImpl implements UploadService{
	
	@Autowired
	private UploadDao uploadDao;
	

	public UploadDao getUploadDao() {
		return uploadDao;
	}

	public void setUploadDao(UploadDao uploadDao) {
		this.uploadDao = uploadDao;
	}

	@Override
	public boolean uploadStudentImg(Student student) {
		
		return uploadDao.uploadStudentImg(student);
	}

	@Override
	public boolean uploadCoachImg(Coach coach) {
		return uploadDao.uploadCoachImg(coach);
	}

}
