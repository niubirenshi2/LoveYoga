package org.team3.loveyoga.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.Message;
import org.team3.loveyoga.service.CoachService;
import org.team3.loveyoga.service.GymService;
import org.team3.loveyoga.service.MessageService;
import org.team3.loveyoga.service.StudentService;
/*
 * 查看我的消息通知
 */
@Controller
@RequestMapping("/showMyMessage")
public class MyMessageController {
	@Resource
	private StudentService studentService;
	@Resource
	private MessageService messageService;
	@Resource
	private CoachService coachService;
	@Resource
	private GymService gymService;
	public GymService getGymService() {
		return gymService;
	}
	public void setGymService(GymService gymService) {
		this.gymService = gymService;
	}
	public CoachService getCoachService() {
		return coachService;
	}
	public void setCoachService(CoachService coachService) {
		this.coachService = coachService;
	}
	public MessageService getMessageService() {
		return messageService;
	}
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	public StudentService getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	//学员查看消息通知
	@RequestMapping("/studentMessage")
	@ResponseBody
	public List<Message> studentMessage(HttpSession session){
		//从session中取出当前登录用户的id
//		int userID = (int) session.getAttribute("yu_id");
		int userID = 1;
		//获得消息表中的学员ID，
		int studentID = studentService.findStudentByUid(userID).getId();
		System.out.println(studentID);
		//查看所有消息通知
		
		return messageService.showStudentMessage(studentID);
	}
	
	//教练查看消息通知
	@RequestMapping("/coachMessage")
	@ResponseBody
	public List<Message> coachMessage(HttpSession session){
		//从session中取出当前登录用户的id
//		int uid = (int) session.getAttribute("yu_id");
		int uid = 2;
		//获得消息表中的教练ID，
		int coachID = coachService.findCoachByUid(uid).getId();
		//查看所有消息通知
		
		return messageService.showCoachMessage(coachID);
	}
	//场馆查看消息通知
	@RequestMapping("/gymMessage")
	@ResponseBody
	public List<Message> gymMessage(HttpSession session){
		//从session中取出当前登录用户的id
//		int uid = (int) session.getAttribute("yu_id");
		int uid = 3;
		//获得消息表中的场馆ID，
		int gymID = gymService.findGymByUid(uid).getId();
		//查看所有消息通知
		
		return messageService.showGymMessage(gymID);
	}
}
