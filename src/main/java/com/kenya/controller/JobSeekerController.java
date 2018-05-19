package com.kenya.controller;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.kenya.ajaxResult.JjsonResult1;
import com.kenya.ajaxResult.JsonCodeEnum;
/*import com.atguigu.survey.e.FileTooLargeForSaveException;
import com.atguigu.survey.e.FileTypeInvalidForSaveException;
import com.atguigu.survey.entities.guest.Survey;
import com.atguigu.survey.entities.guest.User;
import com.atguigu.survey.utils.DataprocessUtils;
import com.atguigu.survey.utils.GlobalMessage;
import com.atguigu.survey.utils.GlobalNames;*/
import com.kenya.ajaxResult.JsonResult;
import com.kenya.bean.Job;
import com.kenya.bean.PageBean1;
import com.kenya.dao.DeleteImg;
import com.kenya.service.JobSeekerService;
import com.kenya.until.DataprocessUtils;
import com.kenya.until.StringUtil;

@Controller
@RequestMapping("/jobSeeker")
public class JobSeekerController {
	DeleteImg deleteimg = new DeleteImg();
	@Autowired
	private JobSeekerService jobSeekerService;
//  jobSeeker/saveJobWant   logoFile
	@ResponseBody
	@RequestMapping(value="/saveJobWant",method=RequestMethod.POST)
	public JsonResult jobWantPulish(Job survey, @RequestParam("logoFile") MultipartFile logoFile, Integer userId,
			HttpSession session) throws IOException, ParseException {
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
		String birthday = survey.getBirthday();
		Date date1 = new Date();
		Date date = simpleFormat.parse(birthday);
		long diff = date1.getTime() - date.getTime();
		long  day = diff / (1000 * 3600 * 24);
		int age = (int)day / 366;
		System.out.println(age);
		survey.setAge(age);


		// 1.妫�鏌ヤ笂浼犵殑鏂囦欢鏄惁涓虹┖
		if (!logoFile.isEmpty()) {

			// =============================================
			long size = logoFile.getSize();
			if (size > 1024 * 1000) {
				JsonResult pictureTooBig = JsonResult.PictureTooBig();
				return pictureTooBig;
			}

			String contentType = logoFile.getContentType();
			// image/gif,image/png,image/jpg,image/jpeg
			if (!contentType.startsWith("image/")) {
				JsonResult json = JsonResult.NotaPicture();

				return json;
			}

			// =====================\============

			// 2.澹版槑/surveyLogos鐩綍瀵瑰簲鐨勮櫄鎷熻矾寰�
			String virtualPath = "/upload";

			// 3.鑾峰彇ServletContext瀵硅薄
			ServletContext servletContext = session.getServletContext();

			// 4.灏嗚櫄鎷熻矾寰勮浆鎹负鐪熷疄鐗╃悊璺緞
			String realPath = servletContext.getRealPath(virtualPath);

			// 5.鑾峰彇鏂囦欢杈撳叆娴�
			InputStream inputStream = logoFile.getInputStream();

			// 6.鎵ц鍘嬬缉
			String logoPath = DataprocessUtils.resizeImages(inputStream, realPath);

			// 7.涓篠urvey瀵硅薄璁剧疆logoPath灞炴��
			survey.setHeadimg(logoPath);
		}

		// 8.浠嶴ession鍩熶腑璇诲彇User瀵硅薄杩涜�岃幏寰梪serId

		// 9.缁橲urvey瀵硅薄璁剧疆userId

		survey.setUserid(userId);
		int insert = jobSeekerService.insert(survey);
		if (insert >= 1) {
			JsonResult ok1 = JsonResult.getOK1(survey, JsonCodeEnum.UsedGoodsPublishSuccess.getCode(),
					JsonCodeEnum.UsedGoodsPublishSuccess.getMsg());
			return ok1;
		}

		return null;
	}

	/**
	 * 鍒嗛〉鏌ヨ鐢ㄦ埛鏁版嵁
	 * 
	 * @param pageno
	 * @param pagesize
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/pageQuery")
	public Object pageQuery(String pagetext, Integer currPage, @RequestParam(value="pagesize",defaultValue="7")Integer pagesize) {
		JjsonResult1 jsonResult = new JjsonResult1();
		PageBean1<Job> jobSeekerPage = new PageBean1<Job>();
		Gson gson =  new Gson();
		try {
			// 鏌ヨ鐢ㄦ埛鏁版嵁
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("start", (currPage - 1) * pagesize);
			paramMap.put("size", pagesize);
			if (StringUtil.isNotEmpty(pagetext)) {
				// pagetext = pagetext.replaceAll("%", "\\%");
			}
			paramMap.put("pagetext", pagetext);

			// 鍒嗛〉鏌ヨ鏁版嵁
			List<Job> jobSeeker = jobSeekerService.pageQuery(paramMap);
			// 鑾峰彇鏁版嵁鐨勬�绘潯鏁�
			int count = jobSeekerService.queryCount(paramMap);

			int totalno = 0;// on鎬婚〉鐮�
			// 鑾峰彇鎬婚〉鐮�
			if (count % pagesize == 0) {
				totalno = count / pagesize;
			} else {
				totalno = count / pagesize + 1;
			}

		
			/*
			 * userPage.setDatas(jobSeeker); userPage.setTotalno(totalno);
			 * userPage.setTotalsize(count); userPage.setPageno(pageno);
			 * userPage.setPagesize(pagesize); result.setPageObj(userPage);
			 */
	/*		for (Job job : jobSeeker) {
				this.longToDate( job.getJointime());
				
				
			}*/
			jobSeekerPage.setCode("000");
			if (totalno<=currPage) {
				jobSeekerPage.setCode("040");
			}
			jobSeekerPage.setLists(jobSeeker);
			jobSeekerPage.setTotalPage(totalno);
			jobSeekerPage.setCurrPage(currPage);
			jobSeekerPage.setTotalCount(count);
			jobSeekerPage.setPageSize(pagesize);
			
			
			//jsonResult.setPageObj(jobSeekerPage);
			
			
		/*	jsonResult.setSuccess(true);
			jsonResult.setCode("000");
*/
		} catch (Exception e) {
			e.printStackTrace();
			jsonResult.setDatas(false);
		}

		return jobSeekerPage;
	}
	
	public static String longToDate(Date lo){
      
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        return sd.format(lo);
    }

	/**
	 * 删除job
	 */
    @RequestMapping("/deletejob")
	@ResponseBody
	public  HashMap<String, Object> deletejob(@RequestParam(value="jobid",defaultValue="0")int jobid,HttpServletRequest request){
    	HashMap<String,Object> map = new HashMap<String,Object>();
		if(jobid==0) {
			map.put("Code", "040");
			map.put("result", "非法访问");
		}else {
			if(jobSeekerService.selectById(jobid).getHeadimg()!=null) {
				deleteimg.deleteImg(jobSeekerService.selectById(jobid).getHeadimg(), request);
			}
			if(jobSeekerService.deleteById(jobid)==0) {
				map.put("code", "040");
				map.put("result", "删除失败");
			}else {
				map.put("code", "000");
				map.put("result","删除成功");
			}
		}
		return map;
	}
    /**
     * 查询用户发布的信息
     */
    @RequestMapping("/selectByUserId")
    @ResponseBody
    public HashMap<String,Object> selectByUserId(@RequestParam(value="userid",defaultValue="0")int userid,@RequestParam(value="pn",defaultValue="1")int pn){
		HashMap<String,Object> map = new HashMap<String,Object>();
		//page插件 pn页码 7显示几条记录
		PageHelper.startPage(pn, 7);
		List<Job> list=jobSeekerService.selectByUserid(userid);
		PageInfo<Job> page = new PageInfo<Job>(list);
		if(page.isIsLastPage()) {
			map.put("code","040");
		}else {
			map.put("code","000");
		}
		map.put("result", list);
		return map;
}

}
