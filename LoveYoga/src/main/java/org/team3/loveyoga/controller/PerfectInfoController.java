package org.team3.loveyoga.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.CoachInfo;
import org.team3.loveyoga.pojo.Gym;
import org.team3.loveyoga.pojo.Nickname;
import org.team3.loveyoga.service.Gym_gymService;

@Controller
@RequestMapping("/perfectInfo")
public class PerfectInfoController {
	@Autowired
	private Gym_gymService gym_gymService;
	@RequestMapping("/selectCoach")
	public String selectCoach(ModelMap map,Gym gym,Integer cid,Integer gcid){//还要传教练的id，课程的id
		//前端接收场馆地址，场馆名称，联系电话：必填
		//QQ号，场馆图片地址，场馆详情
		//教练课程安排：ajax异步获取传到前台，向教练课程关系表中加数据
		//场馆团购：写场馆的账户
		gym_gymService.updateGym(gym);
		//如果教练的id与课程的id都有的情况下，向教练课程关系表y_coach_course添加数据
		gym_gymService.insertByCidAndgcid(cid,gcid);
		return "提交成功";
		
	}
	@RequestMapping("/selectCoachCourseByCoach")
	public Map<String,Object> selectCoachCourseByCoach(String yc_telphone,HttpSession session){
		Object OCurrentyg_id=session.getAttribute("yg_id");
		Integer Currentyg_id=Integer.parseInt((String)OCurrentyg_id);//获取当前的场馆ID
		//通过手机号到教练表查询教练id，再通过教练id到签约场馆（y_sign_gym）
		//中查是否签约并且场馆id要与当前的场馆id一致。如果一致将教练信息反馈回页面，如果不一致，显示错误
		CoachInfo coach=gym_gymService.selectCoach(yc_telphone,Currentyg_id);
		Map<String,Object> map = new HashMap<String,Object>();
		Nickname nickName=null;
		if(coach!=null){
			nickName =gym_gymService.selectNicknameByNicknameId(coach.getYc_nicknameid());
		}
		map.put("coach", coach);
		map.put("nickName", nickName);
		
		return map;
		
	}
}
