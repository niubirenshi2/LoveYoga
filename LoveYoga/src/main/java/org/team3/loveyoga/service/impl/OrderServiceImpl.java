package org.team3.loveyoga.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.OrderDao;
import org.team3.loveyoga.pojo.Order;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService{
	
	@Resource
	private OrderDao orderDao;
	
	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	
	
	@Override
	public List<Order> myOrders(Integer cid) {
		System.out.println("1111111111");
		List<Order> list=orderDao.selectAllOrders(cid);
		return list;
	}

//	@Override
//	public List<Student> selectStudentAll() {
//		System.out.println("1111");
//		return orderDao.selectStudentsAll();
//	}

}
