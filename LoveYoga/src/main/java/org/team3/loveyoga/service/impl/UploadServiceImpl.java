package org.team3.loveyoga.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.team3.loveyoga.Dao.UploadDao;
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
	public boolean uploadStudentImg(MultipartFile studentHeadImg, Integer uid) {
		// TODO Auto-generated method stub
		return uploadDao.uploadStudentImg(studentHeadImg,uid);
	}

	@Override
	public boolean uploadCoachImg(MultipartFile coachHeadImg, Integer uid) {
		// TODO Auto-generated method stub
		return uploadDao.uploadCoachImg(coachHeadImg,uid);
	}


}
