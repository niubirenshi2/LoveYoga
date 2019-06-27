package org.team3.loveyoga.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

public class FileUpload {
	
	@Value("${file.rootPath}")
	private String ROOT_PATH;
	
	/**
	 * @function 单文件上传
	 * @return
	 */
	public static String fileOne(MultipartFile photo,HttpServletRequest request) {
		String fileName = photo.getOriginalFilename();
		System.out.println("获取的文件名："+fileName);
		//获取保存文件的路径
		String path = request.getServletContext().getRealPath("");
		//当前项目根路径
		File currentPjo = new File(path);
		//获取上一级目录
		File webapps = currentPjo.getParentFile();
		//获取保存文件的文件夹
		File images = new File(webapps,"/images");
		//判断文件夹是否存在
		if (!images.exists()){
			images.mkdirs();
		}
		//获取新文件名
		String newFileName = UUID.randomUUID().toString()+
				fileName.substring(fileName.lastIndexOf("."));
		//获取新文件的路径
		String newFilePath = images.getAbsoluteFile()+File.separator+newFileName;
		//得到新文件的file的对象
		File newFile = new File(newFilePath);
		//保存到本地
		try {
			photo.transferTo(newFile);
		} catch (IOException e) {
			e.printStackTrace();
			return "上传失败！";
		}
		return newFilePath;
	}

	/**
	 * @function 多文件上传
	 * @return
	 */
	public static List<String> fileMany(MultipartFile[] files, HttpServletRequest request) {
		List<String> picUrl = null;
		//获取保存文件的路径
				String path = request.getServletContext().getRealPath("");
				//当前项目根路径
				File currentPjo = new File(path);
				//获取上一级目录
				File webapps = currentPjo.getParentFile();
				//获取保存文件的文件夹
				File images = new File(webapps,"/images");
				//判断文件夹是否存在
				if (!images.exists()){
					images.mkdirs();
				}
		for (MultipartFile file : files) {
			if (file != null) {
				String fileName = file.getOriginalFilename();
				//获取新文件名
				String newFileName = UUID.randomUUID().toString()+
						fileName.substring(fileName.lastIndexOf("."));
				//获取新文件的路径
				String newFilePath = images.getAbsoluteFile()+File.separator+newFileName;
				//得到新文件的file的对象
				File newFile = new File(newFilePath);
				try {
					file.transferTo(newFile);
					picUrl.add(newFilePath);
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("上传失败");
				}
			}
		}
		return picUrl;
	}

}
