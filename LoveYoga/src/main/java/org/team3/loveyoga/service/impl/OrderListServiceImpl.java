package org.team3.loveyoga.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.OrderListDao;
import org.team3.loveyoga.pojo.OrderList;
import org.team3.loveyoga.service.OrderListService;

@Service("orderListService")
public class OrderListServiceImpl implements OrderListService {
	@Resource
	private OrderListDao orderListDao;
	public OrderListDao getOrderListDao() {
		return orderListDao;
	}
	public void setOrderListDao(OrderListDao orderListDao) {
		this.orderListDao = orderListDao;
	}

	//向教练发起签约申请
	@Override
	public void sendSignRequestToCoach(OrderList orderList) {
		orderListDao.sendSignRequestToCoach(orderList);
	}
	//查询签约记录(学员对教练的签约申请，以便重复申请)
	@Override
	public OrderList findSignRequestBySidAndCid(OrderList orderList) {
		return orderListDao.findSignRequestBySidAndCid(orderList);
	}
	//重复向教练发起签约申请
	@Override
	public void reSendSignRequestToCoach(OrderList orderList) {
		orderListDao.reSendSignRequestToCoach(orderList);
	}
	//教练同意签约申请
	@Override
	public void coachAcceptSign(OrderList orderList) {
		orderListDao.coachAcceptSign(orderList);
	}
	@Override
	public void coachRefuseSign(OrderList orderList) {
		orderListDao.coachRefuseSign(orderList);
}

}
