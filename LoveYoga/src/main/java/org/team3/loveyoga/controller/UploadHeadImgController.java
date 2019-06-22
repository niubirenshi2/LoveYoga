package org.team3.loveyoga.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.UploadService;

@Controller
@RequestMapping(value = "/upload")
public class UploadHeadImgController {

	@Autowired
	private UploadService uploadService;
	
	
	public UploadService getUploadService() {
		return uploadService;
	}


	public void setUploadService(UploadService uploadService) {
		this.uploadService = uploadService;
	}


	/**
	 * 上传学员的头像
	 * @param student
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/student")
	@ResponseBody
	public boolean  uploadStudentHeadImg(@RequestBody Student student,HttpServletRequest request) {		
		System.out.println("开始上传学员头像！"+student);
		boolean result = false;
		result = uploadService.uploadStudentImg(student);
		HttpSession session = request.getSession();
		Object oUid = session.getAttribute("uid");
		if (oUid == null) {
			return false;
		}
		Integer uid = (Integer) oUid;
		student.setUserID(uid);
		return result;		
	}
	
	/**
	 * 上传教练的头像
	 * @param coach
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/upload")
	@ResponseBody
	public boolean  uploadCoachHeadImg(@RequestBody Coach coach,HttpServletRequest request) {		
		System.out.println("开始上传教练头像！"+coach);
		boolean result = false;
		result = uploadService.uploadCoachImg(coach);
		HttpSession session = request.getSession();
		Object oUid = session.getAttribute("uid");
		if (oUid == null) {
			return false;
		}
		Integer uid = (Integer) oUid;
		coach.setUid(uid);
		return result;		
	}
}
