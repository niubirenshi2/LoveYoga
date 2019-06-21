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
	public List<Circle> selectMyCircle(){
		//根据登录表的id查询朋友圈
		Integer id=2001;
		return attentionService.selectMyCircle(id);
	}
	
	/**
	 * 点击关注加入关注列表
	 * 
	 * 登录成功之后得到登录人员id,点击关注之后前端传过来一个关注人员id
	 * @return 是否关注成功
	 */
	@RequestMapping("/insertFollowOne")
	@ResponseBody
	public String insertFollowOne(Integer ya_fid){
		//得到登录人员的id
//		Integer uid=2001;
		return attentionService.insertFollowOne(2001,3);
	}
	
	@RequestMapping("/deleteFollowOne")
	@ResponseBody
	public String deleteFollowOne(Integer ya_fid){
		//得到登录人员id
		//得到要删除人员的id
		return attentionService.deleteFollowOne(2001, 3);
	}
	
	//查看关注我的人员
	public List<>
	
}
