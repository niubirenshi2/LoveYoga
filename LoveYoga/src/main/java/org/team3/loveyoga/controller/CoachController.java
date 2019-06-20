package org.team3.loveyoga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.service.CoachService;

@Controller
@RequestMapping(value = "/coach")
public class CoachController {
	@Autowired
	private CoachService coachService;
	
	public CoachService getCoachService() {
		return coachService;
	}

	public void setCoachService(CoachService coachService) {
		this.coachService = coachService;
	}

	/**
	 * 教练注册
	 * @param coach
	 * @return
	 */
	@RequestMapping("/register")
	@ResponseBody
	public boolean  register(@RequestBody Coach coach) {	
		System.out.println("正在注册！"+coach);	
		boolean re =  coachService.addCoach(coach);
		return re;
	}
	
	/**
	 * 查询用户是否存在
	 * @param account
	 * @return
	 */
	@RequestMapping(value = "/findCoach")
	@ResponseBody
	public Integer  findUserByAccount(String account) {
		System.out.println("校验账号名"+account+"是否被占用！");
		Integer re= coachService.findCoach(account);	
		System.out.println(re);
		return re;
	}
}
