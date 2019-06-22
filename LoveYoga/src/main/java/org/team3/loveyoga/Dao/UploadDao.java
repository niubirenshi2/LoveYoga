package org.team3.loveyoga.Dao;

import org.springframework.web.multipart.MultipartFile;

public interface UploadDao {

	boolean uploadCoachImg(MultipartFile coachHeadImg, Integer uid);

	boolean uploadStudentImg(MultipartFile studentHeadImg, Integer uid);

}
