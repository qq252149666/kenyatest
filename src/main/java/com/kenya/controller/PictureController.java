package com.kenya.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/*import org.jboss.netty.handler.timeout.ReadTimeoutException;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.kenya.ajaxResult.JsonCodeEnum;
/*import com.google.gson.Gson;
import com.kenYa.ajaxResult.JsonResult;
import com.kenYa.ajaxResult.ResultJsonUtil;
import com.kenYa.exception.MyException;*/
import com.kenya.ajaxResult.JsonResult;
/*import com.kenYa.pojo.KenyaGoods;
import com.kenYa.pojo.KenyaUser;

import com.kenYa.service.PublishGoods;
import com.kenYa.service.kenYaUserService;
import com.kenYa.until.DataprocessUtils;
import com.kenYa.until.GlobalNames;
import com.kenYa.until.JsonUtils;*/
import com.kenya.bean.Goods;
import com.kenya.bean.User;
import com.kenya.service.GoodsService;
import com.kenya.service.UserService;
import com.kenya.until.DataprocessUtils;

@Controller
public class PictureController {

	@Autowired
	private GoodsService publishGoods;
	@Autowired
	private UserService ya;
	private User kenyaUser;

	@RequestMapping("/saveSurvey")
	@ResponseBody
	public JsonResult saveSurvey(@RequestParam("logoFil") MultipartFile[] logoFile, String goodsName, String goodsDesc,
			Float goodsPrice, String goodUserName, String goodsPhone, Integer userId, HttpServletRequest request,

			HttpSession session) throws IOException {

		Goods survey = new Goods();

		String logoPaths[] = { "", "", "", "","" };
		int i = -1;

		for (MultipartFile Lf : logoFile) {
			i++;
			if (!Lf.isEmpty()) {
				// 1.检查上传的文件是否为空
				// =====================封线========================
				long size = Lf.getSize();
				System.out.println(size + "ssrrrrrrssssssssssssssssssssssss");
				if (size > 1024 * 1024*5) {
					// throw new MyException("ss5555555");//文件太大了
					JsonResult pictureTooBig = JsonResult.PictureTooBig();
					/*return JSON.toJSONString(pictureTooBig);*/
					return pictureTooBig;
				}
				String contentType = Lf.getContentType();
				System.out.println(contentType + "1sssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
				if (!contentType.startsWith("image/")) {
					// 不是图片
					JsonResult json = JsonResult.NotaPicture();
					//return JSON.toJSONString(json);
					return json;

				}

				/*
				 * 422320ssrrrrrrssssssssssssssssssssssss
				 * image/png1sssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
				 * org.apache.catalina.core.ApplicationContextFacade@fed0811
				 * E:\.metadata\.plugins\org.eclipse.wst.server.core\tmp2\wtpwebapps\kenYa-test\
				 * surveyLogosaassdfgsdgdsgd http://localhost:8080/kenYa-test/saveSurvey
				 */
				String virtualPath = "/surveyLogos";
				// 3.获取ServletContext对象
				ServletContext servletContext = session.getServletContext();
				System.out.println(servletContext);

				// 4.将虚拟路径转换为真实物理路径
				String realPath = servletContext.getRealPath(virtualPath);
				System.out.println(realPath + "aassdfgsdgdsgd");

				// 5.获取文件输入流
				InputStream inputStream = Lf.getInputStream();

				// // 6.执行压缩
				logoPaths[i] = DataprocessUtils.resizeImages(inputStream, realPath);

			}

		}

		survey.setGoodsimgs(logoPaths[0]);
		survey.setGoodsimg1(logoPaths[1]);
		survey.setGoodsimg2(logoPaths[2]);
		survey.setGoodsimg3(logoPaths[3]);
		survey.setGoodsimg4(logoPaths[4]);
		/*
		 * String string = ""; request.getRequestURL().toString().;
		 */
		// 8.从Session域中读取User对象进而获得userI

		/*KenyaUser user = (KenyaUser) session.getAttribute(GlobalNames.LOGIN_USER);
		  Integer userId = user.getUserId();
		 */
		// 9.给Survey对象设userId
		// survey.setUserId(userId); // 10.保存Survey对象 //
		// System.out.println(logoFile[1]);
		

		survey.setUserid(userId);
		survey.setGoodsdesc(goodsDesc);
		survey.setGoodsname(goodsName);
		survey.setGoodsusername(goodUserName);
		survey.setGoodsprice(goodsPrice);
		survey.setGoodsphone(goodsPhone);
		survey.setGoodsid(survey.getGoodsid());
		 /*Goods k1= survey;*/
	
		// 发布成功
		publishGoods.creatPublishGoods(survey);
		kenyaUser = ya.getUserDetails(userId);
		JsonResult usedGoodsPublishSuccess1 = JsonResult.UsedGoodsPublishSuccess1(survey, kenyaUser,JsonCodeEnum.UsedGoodsPublishSuccess.getCode(), 
				JsonCodeEnum.UsedGoodsPublishSuccess.getMsg());
/*		JsonResult jsonResult = JsonResult.UsedGoodsPublishSuccess(survey,kenyaUser);*/
		return usedGoodsPublishSuccess1;
		
	}

}
