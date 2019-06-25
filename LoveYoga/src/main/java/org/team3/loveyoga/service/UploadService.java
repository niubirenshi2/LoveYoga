package org.team3.loveyoga.service;

import java.util.List;

public interface UploadService {



	Integer uploadHeadImg(String newFilePath, Integer uid);

	Integer uploadGymPhotos(List<String> newFilesPath, Integer uid);

}
