package com.lizhi.aibaobao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.lizhi.aibaobao.common.pageutil.Page;
import com.lizhi.aibaobao.model.UserModel;
import com.lizhi.aibaobao.model.UserQueryModel;
import com.lizhi.aibaobao.service.IUserService;
import com.sun.security.ntlm.Client;


@Service
@Transactional
public class BaoCilent {

	@Autowired
	private IUserService userService = null;
	
	public IUserService getUserService() {
		return userService;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		BaoCilent client = (BaoCilent) context.getBean("baoCilent");

		UserQueryModel userQueryModel = new UserQueryModel();
		userQueryModel.setId(1);
		Page<UserModel> pageResult = client.getUserService().getByConditionPage(userQueryModel);
		System.out.println(pageResult.getResult().toString());
		
		/*UserModel userModel = new UserModel();
		userModel.setId(1);
		List<UserModel> list = client.getUserService().getByCondition(userModel);
		JSONArray jsonArray = new JSONArray();
		jsonArray.add(list);
		System.out.println(jsonArray.toString());*/
	}

}
