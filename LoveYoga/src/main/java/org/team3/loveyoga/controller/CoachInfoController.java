package org.team3.loveyoga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.CoachInfo;
import org.team3.loveyoga.service.CoachInfoService;

@Controller
@RequestMapping(value = "/coachInfo")
public class CoachInfoController {

	@Autowired
	CoachInfoService coachInfoService;
	
	@RequestMapping(value = "/register")
	@ResponseBody
	public boolean  register(@RequestBody CoachInfo coachInfo) {
		
		System.out.println("开始提交信息！"+coachInfo);
		boolean result = false;
//		result = coachInfoService.addInfo(coachInfo);
		return result;
				
	}
	
}