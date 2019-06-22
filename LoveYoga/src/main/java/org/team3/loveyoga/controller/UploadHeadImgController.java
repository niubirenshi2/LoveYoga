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

import java.io.File;
import java.io.IOException;
import java.util.UUID;

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
	 * @param studentHeadImg
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/student")
	@ResponseBody
	public boolean  uploadStudentHeadImg(@RequestParam(value = "studentHeadImg") MultipartFile studentHeadImg,HttpServletRequest request) throws IOException {
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
		File currentPjo = new File(path);
		//获取上一级目录
		File webapps = currentPjo.getParentFile();
		//获取保存文件的文件夹
		File upload = new File(webapps,"upload");
		//判断文件夹是否存在
		if (!upload.exists()){
			upload.mkdirs();
		}
		//获取新文件名
		String newFileName = UUID.randomUUID().toString()+fileName.substring(fileName.lastIndexOf("."));
		//获取新文件的路径
		String newFilePath = upload.getAbsoluteFile()+File.separator+newFileName;
		//得到新文件的file的对象
		File newFile = new File(newFileName);
		//保存到本地
		studentHeadImg.transferTo(newFile);
		System.out.println(newFileName);
		
		//插入数据库
		result = uploadService.uploadStudentImg(studentHeadImg,uid);
		return result;		
	}
	
	/**
	 * 上传教练的头像
	 * @param coachHeadImg
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
