package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.OrderList;

public interface OrderListService {

	//向教练发起签约申请
	public void sendSignRequestToCoach(OrderList orderList);
	
	//查询签约记录(学员对教练的签约申请，以便重复申请或者避免对处于签约状态的教练重复申请)
	public OrderList findSignRequestBySidAndCid(OrderList orderList);
	
	//重复向教练发起签约申请
	public void reSendSignRequestToCoach(OrderList orderList);
	
	//教练同意签约申请
	public void coachAcceptSign(OrderList orderList);
	
	//教练拒绝签约申请
	public void coachRefuseSign(OrderList orderList);
}
