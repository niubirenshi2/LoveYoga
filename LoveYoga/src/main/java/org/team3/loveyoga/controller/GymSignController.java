package org.team3.loveyoga.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.Message;
import org.team3.loveyoga.pojo.SignGym;
import org.team3.loveyoga.service.GymService;
import org.team3.loveyoga.service.MessageService;
import org.team3.loveyoga.service.SignGymService;

@Controller
@RequestMapping("/gymSign")
public class GymSignController {
	Map<String, Object> map = new HashMap<>();
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
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
	@ResponseBody
	public Map<String, Object> sendRequest(HttpSession session,int coachID){
		//从session获得场馆id
//		int uid = (int) session.getAttribute(("yu_id");
		int uid = 3;
		//获得gymID（场馆表）
		int gymID = gymService.findGymByUid(uid).getId();
		//教练编号
		coachID = 1;
		//确定签约双方编号
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
			map.put("message", "您已经与教练签约，请勿重复申请");
			return map;
		}
		//发送签约申请
		signGymService.sendRequestToGym(signGym);
		//给教练发消息通知（state=3）
		Message message = new Message();
		message.setCreateTime(new Date());
		message.setCoachID(coachID);
		message.setGymID(gymID);
		message.setForm("场馆" + gymService.findGymByUid(uid).getGymName()+"邀请您成为教练，是否同意");
		messageService.sendMessagyToCoachByGym(message);
		map.put("message", "成功向教练发起签约申请");
		return map;
	}
	
	//场馆同意教练的申请
	@RequestMapping("/acceptRequest")
	@ResponseBody
	public Map<String, Object> acceptSign(HttpSession session,Integer id){
		//通过前端传来的id获得该条消息
		Message message = messageService.findMessageById(id);
		//获得教练编号（教练表）
		int coachID = message.getCoachID();
		//获得当前场馆的id，gymID（场馆表）
//		int uid = (int) session.getAttribute("yu_id");
		int uid = 3;
		int gymID = gymService.findGymByUid(uid).getId();
		
		//将申请插入数据库中（flag=1）
		SignGym signGym = new SignGym();
		signGym.setCoachID(coachID);
		signGym.setGymID(gymID);
		signGymService.acceptCoachSign(signGym);
		//删除该条消息
		messageService.deleteMessageById(id);
		//给教练发送消息通知（state=5）
		message.setCoachID(coachID);
		message.setGymID(gymID);
		message.setCreateTime(new Date());
		message.setForm("场馆"+gymService.findGymByUid(uid).getGymName()+"同意了您的申请");
		messageService.sendMessagyToCoachByGym2(message);
		map.put("message", "您同意了该教练的申请！");
		return map;
	}
	
	//场馆拒绝教练的申请
	@RequestMapping("/refuseRequest")
	@ResponseBody
	public Map<String, Object> refuseSign(HttpSession session,Integer id){
		//通过前端传来的id获得该条消息
		Message message = messageService.findMessageById(id);
		//获得教练编号
		int coachID = message.getCoachID();
		//获得当前场馆的id
//			int uid = (int) session.getAttribute("yu_id");
		int uid = 3;
		int gymID = gymService.findGymByUid(uid).getId();
		
		//拒绝申请，更改状态flag=2
		SignGym signGym = new SignGym();
		signGym.setCoachID(coachID);
		signGym.setGymID(gymID);
		signGymService.refuseCoachSign(signGym);
		//删除该条消息
		messageService.deleteMessageById(id);
		//给教练发送消息通知
		message.setCoachID(coachID);
		message.setGymID(gymID);
		message.setCreateTime(new Date());
		message.setForm("场馆"+gymService.findGymByUid(uid).getGymName()+"拒绝了您的申请，您可以查看其它场馆");
		messageService.sendMessagyToCoachByGym2(message);
		map.put("message", "您拒绝了该教练的申请！");
		return map;
	}
}
