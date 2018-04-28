package com.kenya.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.kenya.ajaxResult.JjsonResult1;
import com.kenya.ajaxResult.JsonResult;
import com.kenya.bean.Job;
import com.kenya.bean.News;
import com.kenya.bean.PageBean1;
import com.kenya.service.NewsService;
import com.kenya.until.DataprocessUtils;
import com.kenya.until.EUDataGridResult;
import com.kenya.until.JsonUtils;
import com.kenya.until.PageBean2;
import com.kenya.until.StringUtil;

@Controller
@RequestMapping("/news")
public class NewsController {
	@Autowired
	private NewsService newsService;
	private byte[] bytes;

	@ResponseBody///news/pageQuery?page=1
	@RequestMapping("/pageQuery")
	public Object pageQuery(String pagetext, Integer page,
			@RequestParam(value = "rows", defaultValue = "7") Integer rows1) {

		PageBean2<News> NewsPage = new PageBean2<News>();

		JjsonResult1 jsonResult = new JjsonResult1();
		Gson gson = new Gson();
		try {
			// 查询用户数据
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("start", (page - 1) * rows1);
			paramMap.put("size", rows1);
			if (StringUtil.isNotEmpty(pagetext)) {
				// pagetext = pagetext.replaceAll("%", "\\%");
			}
			paramMap.put("pagetext", pagetext);

			// 分页查询数据
			List<News> jobSeeker = newsService.pageQuery(paramMap);
			// 获取数据的总条数
			int count = newsService.queryCount(paramMap);

			int totalno = 0;// on总页码
			// 获取总页码
			if (count % rows1 == 0) {
				totalno = count / rows1;
			} else {
				totalno = count / rows1 + 1;
			}
			if (totalno==page) {
				// NewsPage.setLists(jobSeeker);
				NewsPage.setTotalPage(totalno);
				NewsPage.setCurrPage(page);
				NewsPage.setTotalCount(count);
				NewsPage.setRows(jobSeeker);
				NewsPage.setPageSize(rows1);
				NewsPage.setCode("040");
			}else {
				// NewsPage.setLists(jobSeeker);
				NewsPage.setTotalPage(totalno);
				NewsPage.setCurrPage(page);
				NewsPage.setTotalCount(count);
				NewsPage.setRows(jobSeeker);
				NewsPage.setPageSize(rows1);
				NewsPage.setCode("000");
				/* jsonResult.setPageObj(NewsPage); */
			}
	

		} catch (Exception e) {
			e.printStackTrace();
			jsonResult.setDatas(false);
		}

		return NewsPage;
	}

	@RequestMapping(value = "/item/save", method = RequestMethod.POST)
	@ResponseBody
	public Object createItem(News news, HttpSession session) throws Exception {
		String newstext = news.getNewstext();
		Map resultMap = new HashMap<>();

		if (!newstext.isEmpty()) {
			long length = newstext.length();

			bytes = newstext.getBytes("UTF-8");

			// 2.声明/surveyLogos目录对应的虚拟路径
			String virtualPath = "/htmlFile";

			// 3.获取ServletContext对象
			ServletContext servletContext = session.getServletContext();

			// 4.将虚拟路径转换为真实物理路径
			String realPath = servletContext.getRealPath(virtualPath);
			System.out.println(realPath + "1111144");

			// 5.获取文件输入流
			InputStream inputStream;
			
			FileWriter writer;
			String str1 = DataprocessUtils.genImageName()+".html";
			String str= realPath+"/"+str1 ;
			//String str11 = "kenya1/htmlFile/"+str1;
			try {
				// inputStream = uploadFile.getInputStream();
				writer = new FileWriter(str);
				writer.write(newstext);
				writer.flush();
				writer.close();
				news.setNewstext("/kenya/htmlFile/"+str1);
			} catch (IOException e) {
				resultMap.put("error", 1);
				resultMap.put("message", "文件上传发生异常");

				Gson gson = new Gson();
				String jsonStr = gson.toJson(resultMap);
				return jsonStr;
			}

		}
		//"/kenya1/surveyLogos/" + targetFileName;
		
		
		return newsService.insertSelective(news);

	}
}
