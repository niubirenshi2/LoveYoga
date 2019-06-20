package org.team3.loveyoga.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.Attention;
import org.team3.loveyoga.pojo.Circle;
import org.team3.loveyoga.service.AttentionService;

@Controller
@RequestMapping("/attention")
public class AttentionController {
	@Resource
	private AttentionService attentionService;

	public AttentionService getAttentionService() {
		return attentionService;
	}

	public void setAttentionService(AttentionService attentionService) {
		this.attentionService = attentionService;
	}
	
	@RequestMapping("/selectMyCircle")
	@ResponseBody
	public Map<Object,List<Circle>> selectMyCircle(){
		//根据登录表的id查询朋友圈
		Integer id=2001;
		System.out.println("开始进入");
		return attentionService.selectMyCircle(id);
	}
}
