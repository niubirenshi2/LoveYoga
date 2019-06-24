package org.team3.loveyoga.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.team3.loveyoga.pojo.Message;
import org.team3.loveyoga.pojo.SignGym;
import org.team3.loveyoga.service.GymService;
import org.team3.loveyoga.service.MessageService;
import org.team3.loveyoga.service.SignGymService;

@Controller
@RequestMapping("/gymSign")
public class GymSignController {
	@Resource
	private GymService gymService;
	@Resource
	private SignGymService signGymService;
	@Resource
	private MessageService messageService;
	
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
	public GymService getGymService() {
		return gymService;
	}
	public void setGymService(GymService gymService) {
		this.gymService = gymService;
	}
	
	//给教练发送签约申请
	@RequestMapping("/sendRequest")
	public String sendRequest(HttpSession session,int coachID){
		//从session获得场馆id
//		int uid = (int) session.getAttribute(("yu_id");
		int uid = 3;
		//获得gymID
		int gymID = gymService.findGymByUid(uid).getId();
		//教练编号
		coachID = 2;
		//发送签约申请
		SignGym signGym = new SignGym();
		signGym.setCoachID(coachID);
		signGym.setGymID(gymID);
		signGymService.sendRequestToGym(signGym);
		//给教练发消息通知
		Message message = new Message();
		message.setCoachID(coachID);
		message.setGymID(gymID);
		message.setForm("场馆" + gymService.findGymByUid(uid).getGymName()+"邀请您成为教练，是否同意");
		messageService.sendMessagyToCoachByGym(message);
		return "成功向教练发起签约申请";
	}
	
	//场馆同意教练的申请
	@RequestMapping("/acceptRequest")
	public String acceptSign(HttpSession session,Message message){
		//获得当前场馆的id
//			int uid = (int) session.getAttribute("yu_id");
		int uid = 3;
		int gymID = gymService.findGymByUid(uid).getId();
		//获得教练ID，
//			int coachID = message.getCoachID();
		int coachID = 2;
		SignGym signGym = new SignGym();
		signGym.setCoachID(coachID);
		signGym.setGymID(gymID);
		signGymService.acceptCoachSign(signGym);
		return "同意了教练的申请";
	}
}
