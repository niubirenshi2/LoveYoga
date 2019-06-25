package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.Friend;

public interface FriendService {
	//教练同意学员签约，双方成为好友
	public void makeFriendWithStudent(Friend friend);
	public void makeFriendWhthCoach(Friend friend);

}
