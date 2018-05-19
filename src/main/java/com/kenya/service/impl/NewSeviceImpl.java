package com.kenya.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.News;
import com.kenya.dao.NewsMapper;
import com.kenya.service.NewsService;
import com.kenya.until.KYResult;

@Service

public class NewSeviceImpl implements NewsService {
	@Autowired
	private NewsMapper newsMapper;

	@Override
	public List<News> pageQuery(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return newsMapper.pageQuery(paramMap);
	}

	@Override
	public int queryCount(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return newsMapper.queryCount(paramMap);
	}

	@Override
	public int insertSelective(News news) {
		return newsMapper.insertSelective(news);
	}

	@Override
	public KYResult deleteId(Integer news) {

		int i = newsMapper.deleteByPrimaryKey(news);
		// TODO Auto-generated method stub
		return KYResult.ok();
		

	}

	/*
	 * @Override public Object uploadPicture(MultipartFile [] uploadFile
	 * ,HttpServletRequest request,
	 * 
	 * HttpSession session) { // TODO Auto-generated method stub Map resultMap = new
	 * HashMap<>(); News news = new News(); //生成一个新的文件名 //取原始文件名 String oldName =
	 * uploadFile.getOriginalFilename(); //UUID.randomUUID(); String newName =
	 * DataprocessUtils.genImageName(); newName = newName +
	 * oldName.substring(oldName.lastIndexOf(".")); //图片上传 String imagePath = new
	 * DateTime().toString("/yyyy/MM/dd"); return null;
	 * 
	 * String logoPaths[] = { "", "" }; int i = -1;
	 * 
	 * for (MultipartFile Lf : uploadFile) { i++; if (!Lf.isEmpty()) { //
	 * 1.检查上传的文件是否为空 // =====================封线======================== long size =
	 * Lf.getSize(); System.out.println(size + "ssrrrrrrssssssssssssssssssssssss");
	 * if (size > 1024 * 1024*5) { // throw new MyException("ss5555555");//文件太大了
	 * JsonResult pictureTooBig = JsonResult.PictureTooBig(); return
	 * JSON.toJSONString(pictureTooBig); return pictureTooBig; } String contentType
	 * = Lf.getContentType(); System.out.println(contentType +
	 * "1sssssssssssssssssssssssssssssssssssssssssssssssssssssssssss"); if
	 * (!contentType.startsWith("image/")) { // 不是图片 JsonResult json =
	 * JsonResult.NotaPicture(); //return JSON.toJSONString(json); return json;
	 * 
	 * }
	 * 
	 * 
	 * 422320ssrrrrrrssssssssssssssssssssssss
	 * image/png1sssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
	 * org.apache.catalina.core.ApplicationContextFacade@fed0811
	 * E:\.metadata\.plugins\org.eclipse.wst.server.core\tmp2\wtpwebapps\kenYa-test\
	 * surveyLogosaassdfgsdgdsgd http://localhost:8080/kenYa-test/saveSurvey
	 * 
	 * String virtualPath = "/surveyLogos"; // 3.获取ServletContext对象 ServletContext
	 * servletContext = session.getServletContext();
	 * System.out.println(servletContext);
	 * 
	 * // 4.将虚拟路径转换为真实物理路径 String realPath =
	 * servletContext.getRealPath(virtualPath); System.out.println(realPath +
	 * "aassdfgsdgdsgd");
	 * 
	 * // 5.获取文件输入流 InputStream inputStream = Lf.getInputStream();
	 * 
	 * // // 6.执行压缩 logoPaths[i] = DataprocessUtils.resizeImages(inputStream,
	 * realPath);
	 * 
	 * }
	 * 
	 * } news.setNewsimg0(logoPaths[0]);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * // 发布成功
	 * 
	 * } }
	 */
	/*
	 * Map resultMap = new HashMap<>(); try { //生成一个新的文件名 //取原始文件名 String oldName =
	 * uploadFile.getOriginalFilename(); //生成新文件名 //UUID.randomUUID(); String
	 * newName = IDUtils.genImageName(); newName = newName +
	 * oldName.substring(oldName.lastIndexOf(".")); //图片上传 String imagePath = new
	 * DateTime().toString("/yyyy/MM/dd"); boolean result =
	 * FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD,
	 * FTP_BASE_PATH, imagePath, newName, uploadFile.getInputStream()); //返回结果
	 * if(!result) { resultMap.put("error", 1); resultMap.put("message", "文件上传失败");
	 * return resultMap; } resultMap.put("error", 0); resultMap.put("url",
	 * IMAGE_BASE_URL + imagePath + "/" + newName); return resultMap;
	 * 
	 * } catch (Exception e) { resultMap.put("error", 1); resultMap.put("message",
	 * "文件上传发生异常"); return resultMap; } }
	 */

}
