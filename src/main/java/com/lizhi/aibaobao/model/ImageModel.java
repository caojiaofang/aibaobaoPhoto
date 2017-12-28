package com.lizhi.aibaobao.model;

import java.util.Date;

import com.lizhi.aibaobao.common.pageutil.Page;

public class ImageModel {

	private Integer id;
	private String name;
	private String url;
	private Date date;
	private Integer userId;
	private Page page = new Page();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "ImageModel [id=" + id + ", name=" + name + ", url=" + url + ", date=" + date + ", userId=" + userId
				+ ", page=" + page + "]";
	}
	
}
