package org.team3.loveyoga.service.impl;

import java.util.List;

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
		
		List<Attention> list=attentionDao.selectMyFid(uid);
		List<Circle> circles=null;
		for (int i = 0; i < list.size(); i++) {
			Integer fid=list.get(i).getYa_fid();
			circles=attentionDao.selectMyCircle(fid);
		}
		return circles;
	}
	
}
