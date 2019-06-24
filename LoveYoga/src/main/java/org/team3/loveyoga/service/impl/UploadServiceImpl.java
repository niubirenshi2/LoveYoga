package org.team3.loveyoga.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.RoleDao;
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

	@Autowired
	private RoleDao roleDao;

	@Override
	public Integer uploadStudentImg(String newFilePath, Integer uid) {
		Integer roleId = roleDao.findRole(uid);
		Integer result = 0;
		boolean re = false;
		if (roleId == 0) {
			re = uploadDao.uploadStudentImg(newFilePath, uid);
			if (re) {
				result = 1;
				return result;
			}
			return result;
		}else if (roleId == 1) {
			re = uploadDao.uploadCoachImg(newFilePath, uid);
			if (re) {
				result = 1;
				return result;
			}
		}
		return result;
	}





}
