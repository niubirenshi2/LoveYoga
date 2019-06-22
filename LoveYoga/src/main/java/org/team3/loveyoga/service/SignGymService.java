package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.SignGym;

public interface SignGymService {
	//教练给场馆发送签约申请
	public void sendRequestToGym(SignGym signGym);

	//场馆同意教练签约申请
	public void acceptCoachSign(SignGym signGym);
}
