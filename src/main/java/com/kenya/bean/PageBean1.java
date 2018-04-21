package com.kenya.bean;

import java.util.List;

public class PageBean1 <T>{

	    private int currPage;//当前页数
	    private int pageSize;//每页显示的记录数
	    private int totalCount;//总记录数
	    private int totalPage;//总页数
	    private String code;
	    private List<T> lists;//每页的显示的数据
	   

	    public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public PageBean1() {
	        super();
	    }

	    public int getCurrPage() {
	        return currPage;
	    }

	    public void setCurrPage(int currPage) {
	        this.currPage = currPage;
	    }



		public int getPageSize() {
			return pageSize;
		}

		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}



		public List<T> getLists() {
			return lists;
		}

		public void setLists(List<T> lists) {
			this.lists = lists;
		}

		public int getTotalCount() {
	        return totalCount;
	    }

	    public void setTotalCount(int totalCount) {
	        this.totalCount = totalCount;
	    }

	    public int getTotalPage() {
	        return totalPage;
	    }

	    public void setTotalPage(int totalPage) {
	        this.totalPage = totalPage;
	    }

	 
}
