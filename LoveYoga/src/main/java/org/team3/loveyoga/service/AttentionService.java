package org.team3.loveyoga.service;

import java.util.List;

import org.team3.loveyoga.pojo.Attention;
import org.team3.loveyoga.pojo.Circle;

public interface AttentionService {
	List<Circle> selectMyCircle(Integer uid);
}
