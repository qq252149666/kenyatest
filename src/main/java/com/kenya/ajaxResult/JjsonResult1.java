package com.kenya.ajaxResult;

import com.kenya.bean.PageBean1;

public class JjsonResult1 {

	private PageBean1 pageObj;
	private boolean success;
	private String code;
	private Object datas;
	
	public Object getDatas() {
		return datas;
	}
	public void setDatas(Object datas) {
		this.datas = datas;
	}
	public PageBean1 getPageObj() {
		return pageObj;
	}
	public void setPageObj(PageBean1 pageObj) {
		this.pageObj = pageObj;
	}
	public boolean getSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
