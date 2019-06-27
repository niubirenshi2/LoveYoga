package org.team3.loveyoga.service.impl;


import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.FoucesDao;
import org.team3.loveyoga.pojo.Circle;
import org.team3.loveyoga.pojo.Friend;
import org.team3.loveyoga.pojo.User;
import org.team3.loveyoga.pojo.UserRole;
import org.team3.loveyoga.service.FoucesService;

@Service("foucesService")
public class FoucesServiceImpl implements FoucesService{
	@Resource
	private FoucesDao foucesDao;
	
	public FoucesDao getAttentionDao() {
		return foucesDao;
	}

	public void setAttentionDao(FoucesDao foucesDao) {
		this.foucesDao = foucesDao;
	}


	//关注人员的朋友圈
	@Override
	public List<Circle> selectMyCircle(Integer uid) {
		
		List<Circle> list=foucesDao.selectMyCircle(uid);
		return list;
	}
	
	//添加进关注列表中
	@Override
	public String insertFollowOne(Integer uid, Integer fid) {
		String result="添加失败";
		//得到用该账号和朋友id查询出来的条数
		Integer result2=foucesDao.selectAttentionByUidAndFid(uid, fid);
		//如果没有则插入数据
		if(result2!=null){
			return result;
		}else{
			//得到插入的时间
			Date createtime=new Date();
			Integer row=foucesDao.insertFollowOne(uid, fid, createtime);
			//是否插入数据库成功
			if(row>0){
				result="关注成功";
			}
		}
		return result;
	}
	
	//取消关注
	@Override
	public String deleteFollowOne(Integer uid, Integer fid) {
		String result="删除失败";
		//得到现在的时间，将时间插入进去
		Date deletetime=new Date();
		Integer row=foucesDao.deleteFollowOne(uid, fid, deletetime);
		if(row>0){
			result="删除成功";
		}
		return result;
	}
	
	//我关注的
	@Override
	public List<User> mefouceAll(Integer userID) {
		
		return foucesDao.mefouceAll(userID);
	}
	
	//关注我的
	@Override
	public List<User> fouceMeAll(Integer foucesID) {
		
		return foucesDao.fouceMeAll(foucesID);
	}

	@Override
	public UserRole selectOneById(Integer userID) {
		
		return foucesDao.selectOneById(userID);
	}
	
	/**
	 *  添加好友信息发送，先验证两人之间是否相互关注，如果相互关注则验证是否发送
	 *  过添加信息，如果发送过，则更新信息时间，如果没有发送过添加信息，则添加进
	 *  数据库
	 */
	@Override
	public String addFriend(Integer userID, Integer friendID) {
		String result="添加好友信息发送失败";
		//验证是否互相关注
		Integer yazheng=foucesDao.mutualConcern(userID, friendID);
		if(yazheng>0){
			Date createtime=new Date();
			//验证是否已经给该用户发送过添加信息
			Friend user=foucesDao.selectAddFriendByUserIDAndFriendID(userID, friendID);
			if(user!=null){
				//发送过则更新添加时间
				Integer updateTime=foucesDao.updateCreateTimeByUserIDAndFriendID(userID, friendID, createtime);
				if(updateTime>0){
					result="已更新添加好友信息时间";
				}
			}else{
				//没有则新增添加好友信息
				Integer addfriend=foucesDao.addFriend(userID, friendID, createtime);
				if(addfriend>0){
					result="已发送添加好友信息";
				}
			}
		}
		return result;
	}

	@Override
	public List<Friend> showAllSendMeFriends(Integer friendID) {

		return foucesDao.showAllSendMeFriends(friendID);
	}

	@Override
	public String becomeFriends(Integer userID, Integer friendID) {
		String result="同意失败";
		Date createtime=new Date();
		//同意之后进行数据库插入
		Integer becomeFriends=foucesDao.agreeFriend(userID, friendID, createtime);
		//插入成功
		if(becomeFriends>0){
			//插入成功之后更改邀请人状态
			Integer updateState=foucesDao.updateInviterState(userID, friendID);
			if(updateState>0){
				 result="你们变为好友了";
			}
		}
		return result;
	}
	
	//展示我的好友
	@Override
	public List<User> showAllMyFriends(Integer userID) {
		
		return foucesDao.showAllMyFriends(userID);
	}

	@Override
	public String deleteFriend(Integer userID, Integer friendID) {
		String result="删除好友失败";
		int deleteFriendID=foucesDao.deleteMyFriendByUserID(userID, friendID);
		System.out.println(deleteFriendID);
		int deleteUserID=foucesDao.deleteMyFriendByFriendID(userID, friendID);
		if(deleteFriendID>0 && deleteUserID>0){
			result="删除好友成功";
		}
		return result;
	}

	@Override
	public List<User> huGuan(Integer UserID) {
		
		return foucesDao.huGuan(UserID);
	}

	@Override
	public UserRole selectOneByHuGuanId(Integer id) {
		// TODO Auto-generated method stub
		return foucesDao.selectOneByHuGuanId(id);
	}
	
	//关注我的人员信息
	/**
	 * 根据角色选择查询不同的表，将教练、学员放入单独的list数组,最后放入map里面，
	 * 将根据fouceID查询出来的关注我的人的关注表放入map（后期可能会用到时间）
	 */
//	@Override
//	public Map<String,Object> foucesMe(Integer foucesID) {
//		List<UserRole> roles=foucesDao.foucesMe(foucesID);
//		List<Student> students=new ArrayList<>();
//		List<Coach> coachs=new ArrayList<>();
//		List<Fouces> fouces=foucesDao.foucesMeAll(foucesID);
//		Map<String,Object> map=new HashMap<String,Object>();
//		for (int i = 0; i < roles.size(); i++) {
//			Integer roleID=roles.get(i).getRoleid();
//			Integer userID=roles.get(i).getUserid();
//			if(roleID==0){
//				Student student=foucesDao.foucesMeByStudent(userID);
//				students.add(student);
//			}else if(roleID==1){
//				Coach coach=foucesDao.foucesMeByCoach(userID);
//				coachs.add(coach);
//			}
//		}
//		map.put("students", students);
//		map.put("coachs",coachs);
//		map.put("fouces", fouces);
//		return map;
//	}
	

	
	
}
