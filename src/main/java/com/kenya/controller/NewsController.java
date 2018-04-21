package com.kenya.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.kenya.ajaxResult.JjsonResult1;
import com.kenya.bean.Job;
import com.kenya.bean.News;
import com.kenya.bean.PageBean1;
import com.kenya.service.NewsService;
import com.kenya.until.EUDataGridResult;
import com.kenya.until.PageBean2;
import com.kenya.until.StringUtil;


@Controller
@RequestMapping("/news")
public class NewsController {
	@Autowired
	private NewsService newsService;
	@ResponseBody
	@RequestMapping("/pageQuery")
	public Object pageQuery(String pagetext, Integer page, @RequestParam(value="rows1",defaultValue="7")Integer rows1) {
		
		PageBean2<News> NewsPage = new PageBean2<News>();

		JjsonResult1 jsonResult = new JjsonResult1();
		Gson gson =  new Gson();
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

		
			/*
			 * userPage.setDatas(jobSeeker); userPage.setTotalno(totalno);
			 * userPage.setTotalsize(count); userPage.setPageno(pageno);
			 * userPage.setPagesize(pagesize); result.setPageObj(userPage);
			 */
	/*		for (Job job : jobSeeker) {
				this.longToDate( job.getJointime());
				
				
			}*/
			//NewsPage.setLists(jobSeeker);
			NewsPage.setTotalPage(totalno);
			NewsPage.setCurrPage(page);
			NewsPage.setTotalCount(count);
			NewsPage.setRows(jobSeeker);
			NewsPage.setPageSize(rows1);
			NewsPage.setCode("000");
			/*jsonResult.setPageObj(NewsPage);*/
		
			
			


		} catch (Exception e) {
			e.printStackTrace();
			jsonResult.setDatas(false);
		}

		return NewsPage;
	}
	
	@RequestMapping(value="/item/save",method=RequestMethod.POST)
	@ResponseBody
	public Object createItem(News news)throws Exception{
	
		return newsService.insertSelective(news);	
	}
	@RequestMapping(value="/pic/updole",method=RequestMethod.POST)
	@ResponseBody
	public Object pictureController () {
		
		return newsService;
		
	}

}
