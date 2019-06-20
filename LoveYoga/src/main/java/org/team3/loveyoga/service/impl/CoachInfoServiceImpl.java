package org.team3.loveyoga.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.CoachInfoDao;
import org.team3.loveyoga.pojo.CoachInfo;
import org.team3.loveyoga.service.CoachInfoService;

@Service
public class CoachInfoServiceImpl implements CoachInfoService{

	@Autowired
	private CoachInfoDao coachInfoDao;
	
	public CoachInfoDao getCoachInfoDao() {
		return coachInfoDao;
	}

	public void setCoachInfoDao(CoachInfoDao coachInfoDao) {
		this.coachInfoDao = coachInfoDao;
	}

	@Override
	public boolean addInfo(CoachInfo coachInfo) {
		boolean re = coachInfoDao.addInfo(coachInfo);
		return re;
	}

}
