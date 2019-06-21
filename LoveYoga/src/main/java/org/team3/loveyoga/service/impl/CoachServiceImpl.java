package org.team3.loveyoga.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.team3.loveyoga.dao.CoachDao;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.service.CoachService;

@Service("coachService")
public class CoachServiceImpl implements CoachService {
	@Resource
	private CoachDao coachDao;
	public CoachDao getCoachDao() {
		return coachDao;
	}
	public void setCoachDao(CoachDao coachDao) {
		this.coachDao = coachDao;
	}
	//通过UID查询教练信息
	@Override
	public Coach findCoachByUid(int uid) {
		// TODO Auto-generated method stub
		return coachDao.findCoachByUid(uid);
	}

}
