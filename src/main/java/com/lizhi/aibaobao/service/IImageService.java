package com.lizhi.aibaobao.service;

import java.util.List;

import com.lizhi.aibaobao.common.pageutil.Page;
import com.lizhi.aibaobao.model.ImageModel;
import com.lizhi.aibaobao.model.ImageQueryModel;

public interface IImageService {

	public int insertImage(ImageModel imageModel);
	
	public int deleteImage(ImageModel imageModel);
	
	public int updateImage(ImageModel imageModel);
	
	public List<ImageModel> getByCondition(ImageModel imageModel);
	
	public Page<ImageModel> getByConditionPage(ImageQueryModel imageQueryModel);
}
