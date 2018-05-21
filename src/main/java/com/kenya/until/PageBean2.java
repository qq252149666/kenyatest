package com.kenya.until;

import java.util.List;

public class PageBean2 <T>{

	    private int page;//当前页数
	    private int pageSize;//每页显示的记录数
	    private int total;//总记录数
	    private int totalPage;//总页数
	    private String code;
	    private List<T> rows;//每页的显示的数据
	   

	    public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public PageBean2() {
	        super();
	    }
/*
	    public int getCurrPage() {
	        return page;
	    }

	    public void setCurrPage(int page) {
	        this.page = page;
	    }*/
		


		public int getPageSize() {
			return pageSize;
		}

		public int getPage() {
			return page;
		}

		public void setPage(int page) {
			this.page = page;
		}

		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}

		public List<T> getRows() {
			return rows;
		}

		public void setRows(List<T> rows) {
			this.rows = rows;
		}

		public int getTotal() {
	        return total;
	    }

	    public void setTotal(int total) {
	        this.total = total;
	    }

	    public int getTotalPage() {
	        return totalPage;
	    }

	    public void setTotalPage(int totalPage) {
	        this.totalPage = totalPage;
	    }

	 
}
