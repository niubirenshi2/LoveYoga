package org.team3.loveyoga.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.team3.loveyoga.service.UploadService;
import org.team3.loveyoga.utils.FileUpload;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "/upload")
@Scope("prototype")
public class UploadImgController {

	@Autowired
	private UploadService uploadService;
	
	
	public UploadService getUploadService() {
		return uploadService;
	}


	public void setUploadService(UploadService uploadService) {
		this.uploadService = uploadService;
	}


	/**
	 * 上传头像
	 * @param headImg
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/user")
	@ResponseBody
	public String  uploadHeadImg(@RequestParam("file") MultipartFile headImg,HttpServletRequest request) throws IOException {
		System.out.println("开始上传头像！");
		//获取前台传来的文件并保存为新文件存入到数据库中
		String newFilePath = FileUpload.fileOne(headImg,request);
//		System.out.println("生成的路径"+newFilePath);	
		//获取登陆账户的信息
		HttpSession session = request.getSession();
		Object oUid = session.getAttribute("uid");
		if (oUid == null) {
			return null;
		}
		Integer uid = (Integer) oUid;
		// 插入数据库
		Integer result = uploadService.uploadHeadImg(newFilePath,uid);
		String str = "{\"code\": "+result+",\"msg\":\"\",\"data\": {\"src\":\"" + newFilePath + "\"}}";
		return str;
	}	
	
	@RequestMapping(value = "/gym")
	@ResponseBody
	public String  uploadGymImg(@RequestParam("files") MultipartFile[] photos,HttpServletRequest request) throws IOException {
		System.out.println("开始上传头像！");

		List<String> newFilesPath = FileUpload.fileMany(photos, request);
		System.out.println("生成的路径"+newFilesPath);
		
		//获取登陆账户的信息
		HttpSession session = request.getSession();
		Object oUid = session.getAttribute("uid");
		if (oUid == null) {
			return null;
		}
		Integer uid = (Integer) oUid;
		// 插入数据库
		
		Integer result = uploadService.uploadGymPhotos(newFilesPath,uid);
		String str = "{\"code\": "+result+",\"msg\":\"\",\"data\": {\"src\":\"" + newFilesPath + "\"}}";
		return str;
	}	
	
	
}
