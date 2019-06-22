package org.team3.loveyoga.dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.team3.loveyoga.pojo.OrderList;

public interface OrderListDao {
	//向教练发起签约申请(sid,cid,requesttime)，插入订单表请求时间
	@Insert("insert into orderlist(studentID,coachID,requestTime) values(#{studentID},#{coachID},#{requestTime})")
	public void sendSignRequestToCoach(OrderList orderList);
	
	//查询签约记录(学员对教练的签约申请，以便重复申请)
	@Select("select * from orderlist where studentID=#{studentID} and coachID=#{coachID} and state=0 and flag=0")
	public OrderList findSignRequestBySidAndCid(OrderList orderList);
	
	//重复向教练发起签约申请
	@Update("update orderlist set requestTime=#{requestTime} where studentID=#{studentID} and coachID=#{coachID} and state=0 and flag=0")
	public void reSendSignRequestToCoach(OrderList orderList);
	
	//教练同意签约申请
	@Update("update orderlist set createTime=#{createTime},orderNumber=#{orderNumber} where studentID=#{studentID} and coachID=#{coachID} and state=0 and flag=0")
	public void coachAcceptSign(OrderList orderList);
	
	//教练拒绝签约申请
	@Update("update orderlist set flag=1 where studentID=#{studentID} and coachID=#{coachID} and state=0 and flag=0")
	public void coachRefuseSign(OrderList orderList);
}