package org.team3.loveyoga.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.AttentionDao;
import org.team3.loveyoga.pojo.Attention;
import org.team3.loveyoga.pojo.Circle;
import org.team3.loveyoga.service.AttentionService;

@Service("attentionService")
public class AttentionServiceImpl implements AttentionService{
	@Resource
	private AttentionDao attentionDao;
	
	public AttentionDao getAttentionDao() {
		return attentionDao;
	}

	public void setAttentionDao(AttentionDao attentionDao) {
		this.attentionDao = attentionDao;
	}



	@Override
	public List<Circle> selectMyCircle(Integer uid) {
		
		List<Circle> list=attentionDao.selectMyCircle(uid);
		return list;
	}

	@Override
	public String insertFollowOne(Integer uid, Integer fid) {
		String result="添加失败";
		//得到用该账号和朋友id查询出来的条数
		Integer result2=attentionDao.selectAttentionByUidAndFid(uid, fid);
		//如果没有则插入数据
		if(result2!=null){
			return result;
		}else{
			//得到插入的时间
			Date createtime=new Date();
			Integer row=attentionDao.insertFollowOne(uid, fid, createtime);
			//是否插入数据库成功
			if(row>0){
				result="关注成功";
			}
		}
		return result;
	}

	@Override
	public String deleteFollowOne(Integer uid, Integer fid) {
		String result="删除失败";
		//得到现在的时间，将时间插入进去
		Date deletetime=new Date();
		Integer row=attentionDao.deleteFollowOne(uid, fid, deletetime);
		if(row>0){
			System.out.println("11111");
			result="删除成功";
		}
		return result;
	}
	
	
}
