package com.kenya.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.json.Json;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.kenya.ajaxResult.JsonResult;
import com.kenya.bean.News;
import com.kenya.until.DataprocessUtils;
import com.kenya.until.JsonUtils;


@Controller
public class PictureContro {

	@RequestMapping(value = "/pic/upload", method = RequestMethod.POST)
	@ResponseBody
	public Object pictureController(@RequestParam("uploadFile") MultipartFile uploadFile, HttpServletRequest request,

			HttpSession session) {
		Map resultMap = new HashMap<>();
		News news = new News();
		/*
		 * //生成一个新的文件名 //取原始文件名 String oldName = uploadFile.getOriginalFilename();
		 * //UUID.randomUUID(); String newName = DataprocessUtils.genImageName();
		 * newName = newName + oldName.substring(oldName.lastIndexOf(".")); //图片上传
		 * String imagePath = new DateTime().toString("/yyyy/MM/dd"); return null;
		 */

		if (!uploadFile.isEmpty()) {

			// =============================================
			long size = uploadFile.getSize();
			if (size > 1024 * 1000) {
				JsonResult pictureTooBig = JsonResult.PictureTooBig();
				return pictureTooBig;
			}

			String contentType = uploadFile.getContentType();
			System.out.println(contentType+"jjjjj");
			// image/gif,image/png,image/jpg,image/jpeg
		/*	if (!contentType.startsWith("image/")) {
				JsonResult json = JsonResult.NotaPicture();

				return json;
			}
*/			// 2.声明/surveyLogos目录对应的虚拟路径
			String virtualPath = "/surveyLogos";

			// 3.获取ServletContext对象
			ServletContext servletContext = session.getServletContext();

			// 4.将虚拟路径转换为真实物理路径
			String realPath = servletContext.getRealPath(virtualPath);
			System.out.println(realPath+"1111144");
			

			// 5.获取文件输入流
			InputStream inputStream;
			try {
				inputStream = uploadFile.getInputStream();
			} catch (IOException e) {
				resultMap.put("error", 1);
				resultMap.put("message", "文件上传发生异常");
				Gson gson = new Gson();
		        String jsonStr = gson.toJson(resultMap);
		        return jsonStr;
			}

			// 6.执行压缩
			String logoPath = DataprocessUtils.resizeImages(inputStream, realPath);
			if (logoPath != null) {
				resultMap.put("error", 0);
				resultMap.put("url", logoPath);
		
				String json = JsonUtils.objectToJson(resultMap);
			
		        return json;
			} else {
				resultMap.put("error", 1);
				resultMap.put("message", "文件上传失败");
				System.out.println("ssss");
				return resultMap;
			}
		} else {
			resultMap.put("error", 1);
			resultMap.put("message", "文件上传失败");
			Gson gson = new Gson();
	        String jsonStr = gson.toJson(resultMap);
	        return jsonStr;
		}
		
	}
}
