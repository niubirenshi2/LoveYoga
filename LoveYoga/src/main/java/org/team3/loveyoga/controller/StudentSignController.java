package org.team3.loveyoga.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Message;
import org.team3.loveyoga.pojo.OrderList;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.CoachService;
import org.team3.loveyoga.service.MessageService;
import org.team3.loveyoga.service.OrderListService;
import org.team3.loveyoga.service.StudentService;

@Controller
@RequestMapping("/studentSign")
public class StudentSignController {
	Map<String, Object> map = new HashMap<>();
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Resource
	private StudentService studentService;
	@Resource
	private CoachService coachService;
	@Resource
	private OrderListService orderListService;
	@Resource
	private MessageService messageService;
	
	public CoachService getCoachService() {
		return coachService;
	}
	public void setCoachService(CoachService coachService) {
		this.coachService = coachService;
	}
	public OrderListService getOrderListService() {
		return orderListService;
	}
	public void setOrderListService(OrderListService orderListService) {
		this.orderListService = orderListService;
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

	//向教练发起签约请求
	@RequestMapping("/sendRequest")
	public String requestCoach(Student student, Coach coach, OrderList orderList, 
				Message message,HttpServletRequest request,Integer userID,Integer couchID){
		HttpSession session = request.getSession();
		//从session中取出当前登录学员的uid
//		int userID = (int) session.getAttribute("yu_id");
		
		//模拟学员、教练uid
		userID = 1;
		couchID = 2;
		
		//获得当前用户信息
		student = studentService.findStudentByUid(userID);
		//获得对应的教练信息
//		coach = coachService.findCoachByUid(coach.getUid());
		coach = coachService.findCoachByUid(couchID);
		//判断用户余额是否足够
		if(student.getBalance().doubleValue() < coach.getPrice().doubleValue()){
			map.put("mes", "您的余额不足，请充值");
			return "您的余额不足，请充值";
		}
		//学员编号，教练编号
		Integer studentID = student.getId();
		Integer coachID = coach.getId();
		System.out.println(studentID+"..."+coachID);
		//确定签约双方的编号
		orderList.setStudentID(studentID);
		orderList.setCoachID(coachID);
		System.out.println(orderList.getStudentID()+"...."+orderList.getCoachID());
		//确定消息通知中双方的编号
		message.setStudentID(studentID);
		message.setCoachID(coachID);
		//余额足够，向教练发起申请（判断是否有申请,如果有，更新申请时间，再次发送消息通知）
		if(orderListService.findSignRequestBySidAndCid(orderList) == null){
			//申请时间（同通知消息创建时间）
			Date requestTime = new Date();
			orderList.setRequestTime(requestTime);
			orderListService.sendSignRequestToCoach(orderList);
			//向教练发送消息通知
			message.setForm("学员"+student.getNickName()+"邀请您成为他的私教，点击查看");
			message.setCreateTime(requestTime);
			messageService.sendMessageToCoach(message);
			
			return "成功向教练发起签约申请";
		}
		
		Date reRequestTime = new Date();
		orderList.setRequestTime(reRequestTime);
		orderListService.reSendSignRequestToCoach(orderList);
		//再次发送消息通知
		//向教练发送消息通知
		message.setForm("学员"+student.getNickName()+"邀请您成为他的私教，点击查看");
		message.setCreateTime(reRequestTime);
		messageService.sendMessageToCoach(message);
		return "再次向教练发起签约申请";
	}
}
