package org.team3.loveyoga.controller;

import java.util.Date;
import java.util.HashMap;
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
	private Map<String, Object> map = new HashMap<>();
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
	
	//从前端获得场馆编号。点击签约场馆，给场馆发送申请（signgym,flag=0)，同时发送消息通知（state=2）
	@RequestMapping("/sendRequest")
	@ResponseBody
	public Map<String, Object> requestGym(HttpSession session,Integer gymID){
		//获得当前登录教练的id 2
//		int uid = (int) session.getAttribute("yu_id");
		int uid = 2;
		//前端获得场馆编号（场馆表）
		gymID = 1;
		//获得教练的id，coachID，
		int coachID = coachService.findCoachByUid(uid).getId();
		//确定签约双方的编号
		SignGym signGym = new SignGym();
		signGym.setCoachID(coachID);
		signGym.setGymID(gymID);
		//判断是存在签约申请（flag=0）
		if(signGymService.findRequest(signGym)!=null){
			map.put("message", "您已经向教练发送了申请或者该教练已经向您发起申请，请耐心等待或查看消息");
			return map;
		}
		//判断是否签约（flag=1）
		if(signGymService.findSign(signGym)!=null){
			map.put("message", "您已经与场馆签约，请勿重复申请");
			return map;
		}
		//发送签约申请
		signGymService.sendRequestToGym(signGym);
		//发送消息通知（教练申请场馆state=2）
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
		//通过前端传来的id获得该条消息
		Message message = messageService.findMessageById(id);
		//获得场馆编号（场馆表）
		int gymID = message.getGymID();
		//获得当前教练的id（教练表）
//		int uid = (int) session.getAttribute("yu_id");
		int uid = 2;
		int coachID = coachService.findCoachByUid(uid).getId();
		
		//将申请插入数据库中（flag=1）
		SignGym signGym = new SignGym();
		signGym.setCoachID(coachID);
		signGym.setGymID(gymID);
		signGymService.acceptCoachSign(signGym);
		//删除该条消息
		messageService.deleteMessageById(id);
		//给场馆发送消息通知（教练同意state=4）
		message.setCoachID(coachID);
		message.setGymID(gymID);
		message.setCreateTime(new Date());
		message.setForm("教练"+coachService.findCoachByUid(uid).getNickName()+"同意了您的申请");
		messageService.sendMessagyToGymBycoach(message);
		map.put("message", "您同意了场馆的申请！");
		return map;
	}
	
	//教练拒绝场馆的申请
	@RequestMapping("/refuseRequest")
	@ResponseBody
	public Map<String, Object> refuseSign(HttpSession session,Integer id){
		//通过前端传来的id获得该条消息
		Message message = messageService.findMessageById(id);
		//获得场馆编号（场馆表）
		int gymID = message.getGymID();
		//获得当前教练的id（用户表）
//		int uid = (int) session.getAttribute("yu_id");
		int uid = 2;
		int coachID = coachService.findCoachByUid(uid).getId();
		
		//拒绝申请，更改状态flag=2
		SignGym signGym = new SignGym();
		signGym.setCoachID(coachID);
		signGym.setGymID(gymID);
		signGymService.refuseCoachSign(signGym);;
		//删除该条消息
		messageService.deleteMessageById(id);
		//给场馆发送消息通知（教练拒绝state=4）
		message.setCoachID(coachID);
		message.setGymID(gymID);
		message.setCreateTime(new Date());
		message.setForm("教练"+coachService.findCoachByUid(uid).getNickName()+"拒绝了您的申请");
		messageService.sendMessagyToGymBycoach(message);
		map.put("message", "您拒绝了场馆的申请！");
		return map;
	}
}
