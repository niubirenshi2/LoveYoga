package org.team3.loveyoga.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.service.AddressService;

@Controller
@RequestMapping("/add")
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	
	public AddressService getAddressService() {
		return addressService;
	}


	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}


	@RequestMapping("/getAddress")
	@ResponseBody
	public boolean getAddress(Double pointX,Double pointY,HttpServletRequest request) {
		System.out.println("存储的坐标："+pointX+";"+pointY);
		//设置经纬度
		System.out.println("设置经纬度：");
		boolean result = false;
		//获取用户信息
		HttpSession session = request.getSession();
		Object oUid = session.getAttribute("uid");
		System.out.println(oUid);
		if (oUid == null) {
			return result;
		}
		Integer uid = (Integer) oUid;
		System.out.println(uid);
		result = addressService.setAddress(uid,pointX,pointY);
        return result;
    }
}
