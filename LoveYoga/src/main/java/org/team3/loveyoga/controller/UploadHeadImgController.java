package org.team3.loveyoga.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
	public boolean  uploadStudentHeadImg(@RequestParam(value = "studentHeadImg") MultipartFile studentHeadImg,HttpServletRequest request) {		
		System.out.println("开始上传学员头像！"+studentHeadImg);
		boolean result = false;
		//获取登陆账户的信息
		HttpSession session = request.getSession();
		Object oUid = session.getAttribute("uid");
		if (oUid == null) {
			return false;
		}
		Integer uid = (Integer) oUid;
		//获取前台传来的文件并保存为新文件存入到数据库中
		//获取文件名
		String fileName = studentHeadImg.getOriginalFilename();
		//获取保存文件的路径
		String path = request.getServletContext().getRealPath("");
		//当前项目根路径
		
		
		
		//插入数据库
		result = uploadService.uploadStudentImg(studentHeadImg,uid);
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
	public boolean  uploadCoachHeadImg(@RequestParam(value = "coachHeadImg") MultipartFile coachHeadImg,HttpServletRequest request) {		
		System.out.println("开始上传教练头像！"+coachHeadImg);
		boolean result = false;
		HttpSession session = request.getSession();
		Object oUid = session.getAttribute("uid");
		if (oUid == null) {
			return false;
		}
		Integer uid = (Integer) oUid;
		result = uploadService.uploadCoachImg(coachHeadImg,uid);
		return result;		
	}
}
