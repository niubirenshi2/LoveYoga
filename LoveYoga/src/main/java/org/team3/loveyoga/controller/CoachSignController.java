package org.team3.loveyoga.controller;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.SignGym;
import org.team3.loveyoga.service.CoachService;
import org.team3.loveyoga.service.SignGymService;

@Controller
@RequestMapping("/coachSign")
public class CoachSignController {

	@Resource
	private CoachService coachService;
	@Resource
	private SignGymService signGymService;
	public SignGymService getSignGymService() {
		return signGymService;
	}
	public void setSignGymService(SignGymService signGymService) {
		this.signGymService = signGymService;
	}
	public CoachService getCoachService() {
		return coachService;
	}
	public void setCoachService(CoachService coachService) {
		this.coachService = coachService;
	}
	
	//从前端获得场馆编号。点击签约场馆，给场馆发送申请（signgym,flag=0)，同时发送消息通知
	@RequestMapping("/sendRequest")
	@ResponseBody
	public String requestGym(ServletContext application,HttpSession session,int gymID){
		//获得当前登录教练的id 2
//		int uid = (int) session.getAttribute("yu_id");
		int uid = 2;
		gymID = 1;
		//获得教练的id，coachID，
		int coachID = coachService.findCoachByUid(uid).getId();
		SignGym signGym = new SignGym();
		signGym.setCoachID(coachID);
		signGym.setGymID(gymID);
		//发送签约申请
		signGymService.sendRequestToGym(signGym);
		//发送消息通知
		
		
		return "";
	}
}
