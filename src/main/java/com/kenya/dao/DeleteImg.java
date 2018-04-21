package com.kenya.dao;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

public class DeleteImg {
	/**
	 * 删除服务器上的图片
	 */
	public String deleteImg(String imgs,HttpServletRequest request) {
		String str = imgs;
		for(int len=str.length();0<len;len--){
			if(str.substring(len-1,len).equals("/")) {
				str=str.substring(len, str.length());
				break;
			}
		}
		String filePath = request.getSession().getServletContext()
                .getRealPath("\\")
                + "\\upload\\"+str;
		File file = new File(filePath);
		file.delete();
		return "删除成功";
	}
}
