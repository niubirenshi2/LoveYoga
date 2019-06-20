package org.team3.loveyoga.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.pojo.User;
import org.team3.loveyoga.service.StudentService;
import org.team3.loveyoga.service.UserService;
import org.team3.loveyoga.util.PhoneCodeUtil;
import org.team3.loveyoga.util.RegexUtil;
import org.team3.loveyoga.util.SMSUtil;


@Controller
@RequestMapping("/student")
public class StudentController {
	Map<String, Object> map=new HashMap<>();
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Resource
	private StudentService studentService;
	@Resource
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public StudentService getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	//手机号注册
	@RequestMapping("/registerByTel")
	@ResponseBody
	public String register(Student student,String code,User user){
		//格式判断
		if(!RegexUtil.isMobile(student.getYs_tel())){
			return "账号格式错误！账号为11位手机号！";
		}
		if(!RegexUtil.isPassword(student.getYs_pwd())){
			return "密码格式错误！密码为6~12位字符！";
		}
		//判断手机号是否已存在
		if(studentService.findStudentByTel(student.getYs_tel())!=null){
			System.out.println("手机号已被注册");
			return "手机号已被注册";
		}
		//获取验证码
		String scode = (String) map.get("scode");
		//校验用户输入的验证码
		if(scode.equals(code)){
			System.out.println("用户验证码正确");
			//验证码正确插入学员表
			studentService.addStudent(student);
			//插入用户表
			user.setYu_tel(student.getYs_tel());
			user.setYu_password(student.getYs_pwd());
			userService.addUser(user);
		}
		return "/html/login.html";
	}
	
	@RequestMapping("/sendSMS")
	@ResponseBody
	public void sendSMS(Student student){
		//获取手机号
		String phoneNumber = student.getYs_tel();
		//生成验证码
		String sCode = PhoneCodeUtil.sendPhoneCode(phoneNumber);
		//发送验证码
		SMSUtil.sendSms(phoneNumber, sCode);
		System.out.println(sCode);
		map.put("scode", sCode);
	}
	
	//手机号登录
	@RequestMapping("loginByTel")
	@ResponseBody
	public String studentLogin(User user){
		System.out.println(user.getYu_password());
		System.out.println(user.getYu_tel());
		//格式判断
		if(!RegexUtil.isMobile(user.getYu_tel())){
			return "账号格式错误！账号为11位手机号！";
		}
		if(!RegexUtil.isPassword(user.getYu_password())){
			return "密码格式错误！密码为6~12位字符！";
		}
		//登录验证
		if(!user.getYu_password().equals(userService.findPasswordByTel(user.getYu_tel()))){
			
			System.out.println("账号或密码错误，请重新输入！");
			return "账号或密码错误，请重新输入！";
		}
			System.out.println("登录成功！");
			return "登录成功！";
		
		
	}
}
