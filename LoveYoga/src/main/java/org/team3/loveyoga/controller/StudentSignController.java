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
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Friend;
import org.team3.loveyoga.pojo.Message;
import org.team3.loveyoga.pojo.OrderList;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.CoachService;
import org.team3.loveyoga.service.FriendService;
import org.team3.loveyoga.service.MessageService;
import org.team3.loveyoga.service.OrderListService;
import org.team3.loveyoga.service.StudentService;
/**
 * 学员向教练发起签约申请，点击教练-约私教，获得教练ID，判断学员余额？教练课时费
 * 余额足够，向教练发送申请通知（message表-createTime），生成订单请求（orderlist表-requestTime）
 * 重复发送申请，再次发送申请通知，同时更新订单请求的requestTime
 * @author 14797
 *
 */
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
	@Resource
	private FriendService friendService;
	public FriendService getFriendService() {
		return friendService;
	}
	public void setFriendService(FriendService friendService) {
		this.friendService = friendService;
	}
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

	//向教练发起签约请求(前端传coachID）
	@RequestMapping("/sendRequest")
	@ResponseBody
	public Map<String, Object> requestCoach(HttpSession session,Integer couchID){
		OrderList orderList = new OrderList();
		Message message = new Message();
		//从session中取出当前登录学员的uid
//		int userID = (int) session.getAttribute("yu_id");
		
		//模拟学员、教练uid
		int userID = 1;
		couchID = 2;
		
		//获得当前用户信息
		Student student = studentService.findStudentByUid(userID);
		//获得对应的教练信息
		Coach coach = coachService.findCoachByUid(couchID);
		//判断用户余额是否足够
		if(student.getBalance().doubleValue() < coach.getPrice().doubleValue()){
			map.put("mes", "您的余额不足，请充值");
			return map;
		}
		//学员编号，教练编号(各自的表)
		Integer studentID = student.getId();
		Integer coachID = coach.getId();
		//确定签约双方的编号
		orderList.setStudentID(studentID);
		orderList.setCoachID(coachID);
		//确定消息通知中双方的编号
		message.setStudentID(studentID);
		message.setCoachID(coachID);
		//余额足够，向教练发起申请（判断是否有申请,如果有，更新申请时间，再次发送消息通知）
		//没有签约申请
		if(orderListService.findSignRequestBySidAndCid(orderList) == null){
			//申请时间（同通知消息创建时间）
			Date requestTime = new Date();
			orderList.setRequestTime(requestTime);
			orderListService.sendSignRequestToCoach(orderList);
			//向教练发送消息通知
			message.setForm("学员"+student.getNickName()+"邀请您成为他的私教，是否同意");
			message.setCreateTime(requestTime);
			messageService.sendMessageToCoach(message);
			map.put("message", "成功向教练发起签约申请");
			return map;
		}
		//教练已经同意申请
		if(orderListService.findSignRequestBySidAndCid(orderList).getOrderNumber()!=null){
			map.put("message", "您已经是该教练的学员，请先完成课程");
			return map;
		}
		//有签约申请
		Date reRequestTime = new Date();
		orderList.setRequestTime(reRequestTime);
		orderListService.reSendSignRequestToCoach(orderList);
		//再次发送消息通知
		//向教练发送消息通知
		message.setForm("学员"+student.getNickName()+"邀请您成为他的私教，是否同意");
		message.setCreateTime(reRequestTime);
		messageService.sendMessageToCoach(message);
		map.put("messege", "再次向教练发起签约申请");
		return map;
	}
	//学员确认签约消息(在我的消息页面点击确认，删除该条消息)
	@RequestMapping("/sureMessage")
	@ResponseBody
	public String studentSureSign(Integer id){
		messageService.deleteMessageById(id);
		return null;
	}
	
	//教练点击同意学员签约申请，从前端获得message对象
	@RequestMapping("/coachAcceptSign")
	@ResponseBody
	public Map<String, Object> acceptSign(Integer id, HttpSession session){
		//查询该条消息记录
		Message message = messageService.findMessageById(id);
//		//学员编号（学员表）
		int studentID = message.getStudentID();
		//获得教练编号（用户表）
//		int coachID = (int) session.getAttribute("yu_id");
		//模拟
		int coachID = 2;
		//获得教练、学员对象
		Coach coach = coachService.findCoachByUid(coachID);
		Student student = studentService.findStudentByStudentID(studentID);
		
		//通过学员、教练编号查寻签约记录
		OrderList orderList = new OrderList();
		orderList.setCoachID(message.getCoachID());
		orderList.setStudentID(studentID);
		orderList = orderListService.findSignRequestBySidAndCid(orderList);
		//判断请求是否过期,如果过期，提示该申请过期，请查看最新申请
		if(!message.getCreateTime().equals(orderList.getRequestTime())){
			map.put("message", "该申请过期，请查看最新申请");
			//删除该条消息通知
			messageService.deleteMessageById(id);
			return map;
		}
		//若请求没过期，生成订单号，订单创建时间，同时给学员发送通知消息
		Date createTime = new Date();
		String orderNumber ="" + createTime.getTime() + studentID + coachID ;
		orderList.setCreateTime(createTime);
		orderList.setOrderNumber(orderNumber);
		//生成订单号、订单创建时间
		orderListService.coachAcceptSign(orderList);
		//给学员发送通知
		message.setForm("教练" + coach.getNickName() + "同意了您的申请，您和对方已成为好友，您可以前往好友列表查看对方联系方式了！" );
		message.setCreateTime(new Date());
		messageService.sendMessageToStudent(message);
		//接受申请后，成为好友
		Friend friend = new Friend();
		Date friendTime = new Date();
		friend.setCreateTime(friendTime);
		friend.setUserID(coachID);
		friend.setFriendID(student.getUserID());
		friendService.makeFriendWithStudent(friend);
		friend.setUserID(student.getUserID());
		friend.setFriendID(coachID);
		friendService.makeFriendWhthCoach(friend);
		map.put("message", "您接受了学员的申请");
		//删除该条消息通知
		messageService.deleteMessageById(id);
		return map;
	}
	
	//教练拒绝学员申请
	@RequestMapping("/coachRefuseSign")
	@ResponseBody
	public Map<String, Object> refuseSign(Integer id,HttpSession session){
		//查询该条消息记录
		Message message = messageService.findMessageById(id);
//		//学员编号(学员表）
		int studentID = message.getStudentID();
		//获得教练编号（用户表）
//		int coachID = (int) session.getAttribute("yu_id");
		//模拟
		int coachID = 2;
		//获得学员、教练对象
		Coach coach = coachService.findCoachByUid(coachID);
		Student student = studentService.findStudentByStudentID(studentID);
		//通过学员、教练编号查寻签约记录
		OrderList orderList = new OrderList();
		orderList.setCoachID(message.getCoachID());
		orderList.setStudentID(studentID);
		orderList = orderListService.findSignRequestBySidAndCid(orderList);
		//判断请求是否过期,如果过期，提示该申请过期，请查看最新申请
		if(!message.getCreateTime().equals(orderList.getRequestTime())){
			map.put("message", "该申请过期，请查看最新申请");
			//删除该条message
			messageService.deleteMessageById(id);
			return map;
		}
		//若请求没过期，作废签约申请，同时给学员发送通知消息
		//作废签约申请
		orderListService.coachRefuseSign(orderList);
		//给学员发送通知
		message.setForm("教练" + coach.getNickName() + "拒绝了您的申请，您可以查看一下其他教练哦" );
		message.setCreateTime(new Date());
		messageService.sendMessageToStudent(message);
		map.put("message", "您拒绝了学员的申请");
		//删除该条message
		messageService.deleteMessageById(id);
		return map;
	}
	
	
}
