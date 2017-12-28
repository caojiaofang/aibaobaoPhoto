package com.lizhi.aibaobao.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lizhi.aibaobao.common.pageutil.Page;
import com.lizhi.aibaobao.dao.UserDao;
import com.lizhi.aibaobao.model.UserModel;
import com.lizhi.aibaobao.model.UserQueryModel;

/**
 * 爱宝宝业务层
 * Title: UserService.java
 * Description: 
 * Company: ylink
 * @author lizhi
 * @date 2017年12月28日上午11:43:10
 */
@Service
@Transactional
public class UserService implements IUserService {

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserDao userDao = null;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public int insertUser(UserModel userModel) {
		logger.info("进入爱宝宝业务层--insertUser--,{}",userModel);
		return userDao.insertUser(userModel);
	}

	@Override
	public int deleteUser(UserModel userModel) {
		logger.info("进入爱宝宝业务层--deleteUser--,{}",userModel);
		return userDao.deleteUser(userModel);
	}

	@Override
	public int updateUser(UserModel userModel) {
		logger.info("进入爱宝宝业务层--updateUser--,{}",userModel);
		return userDao.updateUser(userModel);
	}

	@Override
	public List<UserModel> getByCondition(UserModel userModel) {
		logger.info("进入爱宝宝业务层--getByCondition--,{}",userModel);
		return userDao.getByCondition(userModel);
	}

	@Override
	public Page<UserModel> getByConditionPage(UserQueryModel userQueryModel) {
		logger.info("进入爱宝宝业务层--getByConditionPage--,{}",userQueryModel);
		List<UserModel> list = userDao.getByConditionPage(userQueryModel);
		userQueryModel.getPage().setResult(list);
		return userQueryModel.getPage();
	}

}
