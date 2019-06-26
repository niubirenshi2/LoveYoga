package org.team3.loveyoga.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Gym;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.UserInfoService;

@Controller
@RequestMapping(value = "/show")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;
	
	/**
	 * 查询教练的信息
	 * @param request
	 * @return
	 */
	@RequestMapping("/coach")
	@ResponseBody
	public Coach findCoachInfo(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Object oUid = session.getAttribute("uid");
		if (oUid == null) {
			return null;
		}
		Integer uid = (Integer) oUid;
		Coach result = userInfoService.findCoachInfo(uid);
		return result;
	}
	/**
	 * 查询学员的信息
	 * @param request
	 * @return
	 */
	@RequestMapping("/student")
	@ResponseBody
	public Student findStudentInfo(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Object oUid = session.getAttribute("uid");
		if (oUid == null) {
			return null;
		}
		Integer uid = (Integer) oUid;
		Student result = userInfoService.findStudentInfo(uid);
		return result;
	}
	
	/**
	 * 查询场馆的信息
	 * @param request
	 * @return
	 */
	@RequestMapping("/gym")
	@ResponseBody
	public Gym findGymInfo(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Object oUid = session.getAttribute("uid");
		if (oUid == null) {
			return null;
		}
		Integer uid = (Integer) oUid;
		Gym result = userInfoService.findGymInfo(uid);
		return result;
	}
}
