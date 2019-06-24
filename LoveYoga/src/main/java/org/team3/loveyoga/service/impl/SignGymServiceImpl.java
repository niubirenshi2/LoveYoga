package org.team3.loveyoga.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.team3.loveyoga.dao.SignGymDao;
import org.team3.loveyoga.pojo.SignGym;
import org.team3.loveyoga.service.SignGymService;

@Service("signGymService")
public class SignGymServiceImpl implements SignGymService {
	@Resource
	private SignGymDao signGymDao;
	
	public SignGymDao getSignGymDao() {
		return signGymDao;
	}
	public void setSignGymDao(SignGymDao signGymDao) {
		this.signGymDao = signGymDao;
	}
	
	//教练给场馆发送签约申请
	@Override
	public void sendRequestToGym(SignGym signGym) {
		signGymDao.sendRequestToGym(signGym);
	}
	@Override
	public void acceptCoachSign(SignGym signGym) {
		signGymDao.acceptCoachSign(signGym);
	}
	@Override
	public SignGym findRequest(SignGym signGym) {
		// TODO Auto-generated method stub
		return signGymDao.findRequest(signGym);
	}
	@Override
	public SignGym findSign(SignGym signGym) {
		// TODO Auto-generated method stub
		return signGymDao.findSign(signGym);
	}

}
