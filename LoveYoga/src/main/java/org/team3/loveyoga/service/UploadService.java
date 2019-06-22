package org.team3.loveyoga.service;

import org.springframework.web.multipart.MultipartFile;


public interface UploadService {


	boolean uploadCoachImg(MultipartFile coachHeadImg, Integer uid);

	boolean uploadStudentImg(MultipartFile studentHeadImg, Integer uid);

}
