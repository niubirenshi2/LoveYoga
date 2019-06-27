package org.team3.loveyoga.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.Circle;
import org.team3.loveyoga.pojo.Friend;
import org.team3.loveyoga.pojo.User;
import org.team3.loveyoga.pojo.UserRole;
import org.team3.loveyoga.service.FoucesService;

@Controller
@RequestMapping("/attention")
public class FoucesController {
	@Resource
	private FoucesService foucesService;

	public FoucesService getAttentionService() {
		return foucesService;
	}

	public void setAttentionService(FoucesService foucesService) {
		this.foucesService = foucesService;
	}
	
	@RequestMapping("/selectMyCircle")
	@ResponseBody
	public Map<String,Object> selectMyCircle(){
		//根据登录表的id查询朋友圈
		Integer id=2001;
		List<Circle> list=foucesService.selectMyCircle(id);
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count",list.size());
		map.put("data", list);
		return map;
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
		return foucesService.insertFollowOne(2001,3);
	}
	
	@RequestMapping("/deleteFollowOne")
	@ResponseBody
	public String deleteFollowOne(Integer ya_fid){
		//得到登录人员id
		//得到要删除人员的id
		System.out.println(ya_fid);
		return foucesService.deleteFollowOne(2001, ya_fid);
	}
	

	
	//查看所有我关注的人员
	@RequestMapping("/mefouceAll")
	@ResponseBody
	public Map<String, Object> mefouceAll(){
		List<User> list=foucesService.mefouceAll(1);
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count",list.size());
		map.put("data", list);
		return map;
	}
	
	//查看所有关注我的人员
	@RequestMapping("/fouceMeAll")
	@ResponseBody
	public Map<String,Object> fouceMeAll(){
		List<User> list=foucesService.fouceMeAll(1);
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count",list.size());
		map.put("data", list);
		return map;
	}
	
	//查询列表中的单个用户详细信息
	@RequestMapping("/selectOneById")
	@ResponseBody
	public Object selectOneById(Integer id){
		//拿到用户id
		//将用户角色表与三张用户详细表连接,哪个角色返回的不是null就进入该用户的详细信息界面
		UserRole userRole=foucesService.selectOneById(id);
		if(userRole.getStudent()!=null){
			return userRole.getStudent();
		}else if(userRole.getGym()!=null){
			return userRole.getGym();
		}else if(userRole.getCoach()!=null){
			return userRole.getCoach();
		}else{
			return "信息保密";
		}
	}
	
	//发送添加好友的信息
	@RequestMapping("/addFriend")
	@ResponseBody
	public String addFriend(Integer friendID){
		//拿到用户id
		
		//调用添加好友的方法 
		return foucesService.addFriend(2001, 1);
	}
	
	//所有邀请成为好友的人(我暂时没有同意)
	@RequestMapping("/showAllSendMeFriends")
	@ResponseBody
	public Map<String,Object> showAllSendMeFriends(){
		//拿到我的id
		List<Friend> list=foucesService.showAllSendMeFriends(1);
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count",list.size());
		map.put("data", list);
		return map;
	}
	
	//同意邀请变为好友，同时更改邀请人状态
	@RequestMapping("/becomeFriends")
	@ResponseBody
	public String becomeFriends(Integer friendID){
		//得到登录人id
		
		return foucesService.becomeFriends(1, friendID);
	}
	
	//展示我的好友功能
	@RequestMapping("/showAllMyFriends")
	@ResponseBody
	public Map<String,Object> showAllMyFriends(){
		//得到登录人id
		List<User> list=foucesService.showAllMyFriends(2);
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count",list.size());
		map.put("data", list);
		return map;
	}
	
	@RequestMapping("/deleteFriend")
	@ResponseBody
	public String deleteFriend(Integer friendID){
		//得到登录人id
		System.out.println(friendID);
		return foucesService.deleteFriend(2, friendID);
	}
	
	@RequestMapping("/huGuan")
	@ResponseBody
	public List<User> huGuan(Integer userID){
		//得到登录人id
		return foucesService.huGuan(2001);
	}
	
	//互关情况下查看详细信息
	@RequestMapping("/selectOneByHuGuanId")
	@ResponseBody
	public Object selectOneByHuGuanId(Integer uid){
		//拿到用户id
		//将用户角色表与三张用户详细表连接,哪个角色返回的不是null就进入该用户的详细信息界面
		System.out.println(uid);
		UserRole userRole=foucesService.selectOneByHuGuanId(uid);
		System.out.println(userRole.getStudent().getUserID());
		if(userRole.getStudent()!=null){
			return userRole.getStudent();
		}else if(userRole.getGym()!=null){
			return userRole.getGym();
		}else if(userRole.getCoach()!=null){
			
			return userRole.getCoach();
		}else{
			return "信息保密";
		}
	}
}
