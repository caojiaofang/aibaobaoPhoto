package com.lizhi.aibaobao.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lizhi.aibaobao.common.pageutil.Page;
import com.lizhi.aibaobao.dao.ImageDao;
import com.lizhi.aibaobao.model.ImageModel;
import com.lizhi.aibaobao.model.ImageQueryModel;

/**
 * 
 * 宝宝业务层
 * Title: ImageService.java
 * Description: 
 * Company: ylink
 * @author lizhi
 * @date 2017年12月28日下午2:23:28
 */
@Service
@Transactional
public class ImageService implements IImageService {

	private static final Logger logger = LoggerFactory.getLogger(ImageService.class);
	
	@Autowired
	private ImageDao imageDao = null;
	
	@Override
	public int insertImage(ImageModel imageModel) {
		logger.info("进入爱宝宝业务层--insertImage--,{}",imageModel);
		return imageDao.insertImage(imageModel);
	}

	@Override
	public int deleteImage(ImageModel imageModel) {
		logger.info("进入爱宝宝业务层--deleteImage--,{}",imageModel);
		return imageDao.deleteImage(imageModel);
	}

	@Override
	public int updateImage(ImageModel imageModel) {
		logger.info("进入爱宝宝业务层--updateImage--,{}",imageModel);
		return imageDao.updateImage(imageModel);
	}

	@Override
	public List<ImageModel> getByCondition(ImageModel imageModel) {
		logger.info("进入爱宝宝业务层--getByCondition--,{}",imageModel);
		return imageDao.getByCondition(imageModel);
	}

	@Override
	public Page<ImageModel> getByConditionPage(ImageQueryModel imageQueryModel) {
		logger.info("进入爱宝宝业务层--getByConditionPage--,{}",imageQueryModel);
		List<ImageModel> list = imageDao.getByConditionPage(imageQueryModel);
		imageQueryModel.getPage().setResult(list);
		return imageQueryModel.getPage();
	}

}
