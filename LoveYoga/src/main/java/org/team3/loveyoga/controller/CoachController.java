package org.team3.loveyoga.controller;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.service.CoachService;

@Controller
@RequestMapping(value = "/coach")
public class CoachController {
	
	private CoachService coachService;
	
	@RequestMapping("/register")
	@ResponseBody
	public String  register(Coach coach) {
						
		String pwd = new SimpleHash("MD5", coach.getYu_password(), coach.getYu_name(), 1024).toString();
		
		Coach coach2 = new Coach();
		coach2.setYu_password(pwd);
		
		coachService.addCoach(coach2);
		return "/html/login.html";
	}
}
