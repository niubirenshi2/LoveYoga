package org.team3.loveyoga.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.AddressDao;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressDao addressDao;

	@Override
	public boolean setAddress(Coach coach) {
		return addressDao.setAddress(coach);
	}

}
