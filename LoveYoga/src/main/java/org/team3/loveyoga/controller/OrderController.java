package org.team3.loveyoga.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team3.loveyoga.pojo.Order;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Resource
	private OrderService orderService;

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	/**
	 * 返回交易订单和所有学生信息的集合，根据学生id进行比对就可以查询出学生的名字
	 * @return
	 */
	@RequestMapping("/myOrders")
	@ResponseBody
	public List<Order> myOrders(){
		//Map<String,Object> map=new HashMap<>();
		//根据存放的教练id查询出所有的签约信息
		System.out.println("开始进入");
		Integer cid=2001;
		List<Order> orders=orderService.myOrders(cid);
		System.out.println(orders.size());
		//所有的学生账号
//		List<Student> students=orderService.selectStudentAll();
//		map.put("orders", orders);
//		map.put("students", students);
		return orders;
	}
	
}
