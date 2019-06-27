package org.team3.loveyoga.interceptor;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class FileTypeInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		boolean flag = true;
		//判断是否是上传文件的请求
		if (request instanceof MultipartHttpServletRequest) {
			//将request转换成文件上传的请求
			MultipartHttpServletRequest mhsr = (MultipartHttpServletRequest) request;
			//获取上传文件
			Map<String , MultipartFile> files = mhsr.getFileMap();
			//遍历文件检查文件类型是否满足要求
			Iterator<String> iterator = files.keySet().iterator();
			while (iterator.hasNext()) {
				String key = iterator.next();
				MultipartFile file = files.get(key);
				if (!file.getOriginalFilename().endsWith(".png")) {
					flag = false;
					break;
				}
			}
		}
	return super.preHandle(request, response, handler);
	}

}
