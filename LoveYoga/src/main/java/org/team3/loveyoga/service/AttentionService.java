package org.team3.loveyoga.service;

import java.util.List;
import java.util.Map;

import org.team3.loveyoga.pojo.Circle;

public interface AttentionService {
	List<Circle> selectMyCircle(Integer uid);
	
	String insertFollowOne(Integer uid,Integer fid);
	
	String deleteFollowOne(Integer uid,Integer fid);
}
