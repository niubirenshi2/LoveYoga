package org.team3.loveyoga.controller;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.Message;
import org.team3.loveyoga.pojo.SignGym;
import org.team3.loveyoga.service.CoachService;
import org.team3.loveyoga.service.GymService;
import org.team3.loveyoga.service.MessageService;
import org.team3.loveyoga.service.SignGymService;

@Controller
@RequestMapping("/coachSign")
public class CoachSignController {
	private Map<String, Object> map;
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	@Resource
	private CoachService coachService;
	@Resource
	private SignGymService signGymService;
	@Resource
	private MessageService messageService;
	@Resource
	private GymService gymService;
	public GymService getGymService() {
		return gymService;
	}
	public void setGymService(GymService gymService) {
		this.gymService = gymService;
	}
	public MessageService getMessageService() {
		return messageService;
	}
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
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
	public Map<String, Object> requestGym(HttpSession session,Integer gymID){
		//获得当前登录教练的id 2
//		int uid = (int) session.getAttribute("yu_id");
		int uid = 2;
		gymID = 1;
		//获得教练的id，coachID，
		int coachID = coachService.findCoachByUid(uid).getId();
		SignGym signGym = new SignGym();
		signGym.setCoachID(coachID);
		signGym.setGymID(gymID);
		System.out.println(signGym.getCoachID());
		//判断是否发送过申请
		if(signGymService.findRequest(signGym)!=null){
			map.put("message", "您已经向场馆发送了申请，请耐心等待");
			return map;
		}
		//判断是否签约
		if(signGymService.findSign(signGym)!=null){
			map.put("message", "您已经与场馆签约，请勿重复申请");
			return map;
		}
		//发送签约申请
		signGymService.sendRequestToGym(signGym);
		//发送消息通知
		Message message = new Message();
		message.setCreateTime(new Date());
		message.setCoachID(coachID);
		message.setGymID(gymID);
		message.setForm("教练"+coachService.findCoachByUid(uid).getNickName()+"申请成为场馆教练");
		messageService.sendMessageToGym(message);
		map.put("message", "您成功向场馆发起签约申请,等待场馆同意");
		
		return map;
	}
	//教练同意场馆的申请
	@RequestMapping("/acceptRequest")
	@ResponseBody
	public Map<String, Object> acceptSign(HttpSession session,Integer id){
		//获得当前教练的id
//				int uid = (int) session.getAttribute("yu_id");
		int uid = 2;
		int coachID = coachService.findCoachByUid(uid).getId();
		//获得场馆ID，
//				int gymID = message.getGymID();
		int gymID = 3;
		SignGym signGym = new SignGym();
		signGym.setCoachID(coachID);
		signGym.setGymID(gymID);
		signGymService.acceptCoachSign(signGym);
		map.put("message", "您同意了教练的申请");
		return map;
	}
	
	
}
