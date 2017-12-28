package com.lizhi.aibaobao.service;

import java.util.List;

import com.lizhi.aibaobao.common.pageutil.Page;
import com.lizhi.aibaobao.model.UserModel;
import com.lizhi.aibaobao.model.UserQueryModel;

public interface IUserService {

    public int insertUser(UserModel userModel);
	
	public int deleteUser(UserModel userModel);
	
	public int updateUser(UserModel userModel);
	
	public List<UserModel> getByCondition(UserModel userModel);
	
	public Page<UserModel> getByConditionPage(UserQueryModel userQueryModel);
}
