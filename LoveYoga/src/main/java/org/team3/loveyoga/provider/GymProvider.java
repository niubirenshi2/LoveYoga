package org.team3.loveyoga.provider;

import org.apache.ibatis.jdbc.SQL;
import org.team3.loveyoga.pojo.Gym;

public class GymProvider {
	public String updateGym(Gym gym){
		SQL sql = new SQL().UPDATE("y_gym");
		if(gym.getYg_address()!=null&&gym.getYg_address().length()!=0){
			sql.SET("yg_address="+gym.getYg_address()+"'");
		}
		if(gym.getYg_name()!=null&&gym.getYg_name().length()!=0){
			sql.SET("yg_name="+gym.getYg_name()+"'");
		}
		if(gym.getYg_tel()!=null&&gym.getYg_tel().length()!=0){
			sql.SET("yg_tel="+gym.getYg_tel()+"'");
		}
		if(gym.getYg_qq()!=null&&gym.getYg_qq().length()!=0){
			sql.SET("yg_qq="+gym.getYg_qq()+"'");
		}
		if(gym.getYg_img()!=null&&gym.getYg_img().length()!=0){
			sql.SET("yg_img="+gym.getYg_img()+"'");
		}
		if(gym.getYg_description()!=null&&gym.getYg_description().length()!=0){
			sql.SET("yg_description="+gym.getYg_description()+"'");
		}
		sql.WHERE("yg_id="+gym.getYg_id());
		return sql.toString();
		
	}
}
