package org.team3.loveyoga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.service.CoachService;

@Controller
@RequestMapping(value = "/fill")
public class FillController {

	@Autowired
	private CoachService coachService;


	@RequestMapping(value = "/coach")
	@ResponseBody
	public boolean  register(@RequestBody Coach coach) {
		
		System.out.println("开始提交信息！"+coach);
		boolean result = false;
		result = coachService.addInfo(coach);
		return result;
				
	}
	
	
	
}
