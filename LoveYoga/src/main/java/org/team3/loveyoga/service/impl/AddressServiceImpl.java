package org.team3.loveyoga.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.AddressDao;
import org.team3.loveyoga.Dao.RoleDao;
import org.team3.loveyoga.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressDao addressDao;
	
	private RoleDao roleDao;
	

	@Override
	public boolean setAddress(Integer uid, Double pointX, Double pointY) {
		Integer roleId = roleDao.findRole(uid);
		boolean re = false;
		if (roleId == 1) {
			return re = addressDao.setCoachAddress(uid,pointX,pointY);
		}else if (roleId == 2) {
			return re = addressDao.setGymAddress(uid,pointX,pointY);			
		}
		return re;
	}

}
