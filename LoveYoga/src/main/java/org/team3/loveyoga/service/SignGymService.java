package org.team3.loveyoga.service;

import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.SignGym;

public interface SignGymService {
	//教练给场馆发送签约申请
	public void sendRequestToGym(SignGym signGym);

	//场馆同意教练签约申请
	public void acceptCoachSign(SignGym signGym);
	
	//查询是否发送申请
	public SignGym findRequest(SignGym signGym);
		
	//查询是否签约
	public SignGym findSign(SignGym signGym);
}
