package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.CoachInfo;
import org.team3.loveyoga.pojo.Gym;
import org.team3.loveyoga.pojo.Nickname;

public interface Gym_gymService {
	public int updateGym(Gym gym);

	public void insertByCidAndgcid(Integer cid, Integer gcid);

	public CoachInfo selectCoach(String yc_telphone, Integer currentyg_id);

	public Nickname selectNicknameByNicknameId(Integer yc_nicknameid);
}
