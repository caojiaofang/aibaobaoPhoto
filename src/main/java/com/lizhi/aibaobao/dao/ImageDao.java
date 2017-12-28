package com.lizhi.aibaobao.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lizhi.aibaobao.model.ImageModel;
import com.lizhi.aibaobao.model.ImageQueryModel;

/**
 * 爱宝宝
 * Title: ImageDao.java
 * Description: 
 * Company: ylink
 * @author lizhi
 * @date 2017年12月28日上午11:21:14
 */
@Repository
public interface ImageDao {

    public int insertImage(ImageModel imageModel);
	
	public int deleteImage(ImageModel imageModel);
	
	public int updateImage(ImageModel imageModel);
	
	public List<ImageModel> getByCondition(ImageModel imageModel);
	
	public List<ImageModel> getByConditionPage(ImageQueryModel imageQueryModel);
}
