package org.team3.loveyoga.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.FriendDao;
import org.team3.loveyoga.pojo.Friend;
import org.team3.loveyoga.service.FriendService;

@Service("friendService")
public class FriendServiceImpl implements FriendService {
	@Resource
	private FriendDao friendDao;
	public FriendDao getFriendDao() {
		return friendDao;
	}
	public void setFriendDao(FriendDao friendDao) {
		this.friendDao = friendDao;
	}

	//教练同意学员申请，双方成为好友
	@Override
	public void makeFriendWithStudent(Friend friend) {
		friendDao.makeFriendWithStudent(friend);
	}
	//教练同意学员申请，双方成为好友
	@Override
	public void makeFriendWhthCoach(Friend friend) {
		friendDao.makeFriendWhthCoach(friend);
	}

}
