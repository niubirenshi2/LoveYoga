package org.team3.loveyoga.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Gym;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.FillService;

@Controller
@RequestMapping(value = "/fill")
public class FillController {

	@Autowired
	private FillService fillService;


	public FillService getCoachService() {
		return getCoachService();
	}


	public void setCoachService(FillService coachService) {
		this.fillService = coachService;
	}


	/**
	 * 教练信息完善
	 * @param coach
	 * @return
	 */
	@RequestMapping(value = "/coach")
	@ResponseBody
	public boolean  fillCoach(@RequestBody Coach coach,HttpServletRequest request) {		
//		System.out.println("开始提交教练信息！"+coach);
		boolean result = false;
		HttpSession session = request.getSession();
		Object oUid = session.getAttribute("uid");
		if (oUid == null) {
			return false;
		}
		Integer uid = (Integer) oUid;
		coach.setUid(uid);
		result = fillService.addInfo(coach);
		return result;		
	}
	
	/**
	 * 学员信息完善
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "/student")
	@ResponseBody
	public boolean  fillStudent(@RequestBody Student student,HttpServletRequest request) {		
		System.out.println("开始提交学员信息！"+student);
		boolean result = false;
		HttpSession session = request.getSession();
		Object oUid = session.getAttribute("uid");
		if (oUid == null) {
			return false;
		}
		Integer uid = (Integer) oUid;
		student.setUserID(uid);
		result = fillService.fillStudent(student);
		return result;		
	}
	
	/**
	 * 场馆信息完善
	 * @param gym
	 * @return
	 */
	@RequestMapping(value = "/Gym")
	@ResponseBody
	public boolean  fillGym(@RequestBody Gym gym,HttpServletRequest request) {		
		System.out.println("开始提交学员信息！"+gym);
		boolean result = false;
		HttpSession session = request.getSession();
		Object oUid = session.getAttribute("uid");
		if (oUid == null) {
			return false;
		}
		Integer uid = (Integer) oUid;
		gym.setUid(uid);
		result = fillService.fillGym(gym);
		return result;		
	}
	
}
