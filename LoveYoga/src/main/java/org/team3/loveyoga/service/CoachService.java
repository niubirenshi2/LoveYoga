package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.Coach;

public interface CoachService {
	//通过UID查询教练信息
	public Coach findCoachByUid(int uid);

}
