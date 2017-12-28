package com.lizhi.aibaobao.model;

import com.lizhi.aibaobao.common.pageutil.Page;

public class UserModel {

	private Integer id;
	private String userName;
	private String password;
	private Page page = new Page() ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", userName=" + userName + ", password=" + password + ", page=" + page + "]";
	}
	
}
