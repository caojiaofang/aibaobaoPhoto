package com.lizhi.aibaobao.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lizhi.aibaobao.common.pageutil.Page;
import com.lizhi.aibaobao.model.UserModel;
import com.lizhi.aibaobao.model.UserQueryModel;

/**
 * 爱宝宝
 * Title: UserDao.java
 * Description: 
 * Company: ylink
 * @author lizhi
 * @date 2017年12月28日上午11:16:33
 */
@Repository
public interface UserDao {

	public int insertUser(UserModel userModel);
	
	public int deleteUser(UserModel userModel);
	
	public int updateUser(UserModel userModel);
	
	public List<UserModel> getByCondition(UserModel userModel);
	
	public List<UserModel> getByConditionPage(UserQueryModel userQueryModel);
}
