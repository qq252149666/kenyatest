package com.kenya.until;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.jstl.core.LoopTagStatus;



import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.google.gson.Gson;
/*import com.atguigu.survey.entities.guest.Bag;
import com.atguigu.survey.entities.guest.Question;*/
//import com.google.gson.Gson;
import com.sun.image.codec.jpeg.JPEGCodec;

public class DataprocessUtils {
	private static Gson gson = new Gson();

	public static String resizeImages(InputStream inputStream, String realPath) {

		OutputStream out = null;

		try {
			// 1.构造原始图片对应的Image对象
			BufferedImage sourceImage = ImageIO.read(inputStream);

			// 2.获取原始图片的宽高值
			int sourceWidth = sourceImage.getWidth();
			int sourceHeight = sourceImage.getHeight();

			// 3.计算目标图片的宽高值
			int targetWidth = sourceWidth;
			int targetHeight = sourceHeight;

			if (sourceWidth > 720) {
				// 按比例压缩目标图片的尺寸
				targetWidth = 720;
				targetHeight = (int) (sourceHeight-(sourceHeight-sourceHeight/(sourceWidth/720.00)));
			/*	targetHeight = (int) sourceHeight * sourceHeight*(sourceWidth / 720.00);
*/
			}
  
			// 4.创建压缩后的目标图片对应的Image对象
			BufferedImage targetImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
			

			// 5.绘制目标图片
			targetImage.getGraphics().drawImage(sourceImage, 0, 0, targetWidth, targetHeight, null);

			// 6.构造目标图片文件名
			String targetFileName = System.nanoTime() + ".jpg";

			// 7.创建目标图片对应的输出流
			out = new FileOutputStream(realPath + "/" + targetFileName);

			// 8.获取JPEG图片编码器
			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);

			// 9.JPEG编码
			encoder.encode(targetImage);

			// 10.返回文件名
			return "/kenya/upload/" + targetFileName;

		} catch (Exception e) {

			e.printStackTrace();

			return null;
		} finally {
			// 10.关闭流
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
/*	public static String resizeImages1(InputStream inputStream, String realPath) {
		Map resultMap = new HashMap<>();

	
		
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
			news.setNewstext("kenya1/htmlFile/"+str1);
		} catch (IOException e) {
			resultMap.put("error", 1);
			resultMap.put("message", "文件上传发生异常");

			Gson gson = new Gson();
			String jsonStr = gson.toJson(resultMap);
			return jsonStr;
		}
	}*/


	/**
	 * 对源字符串进行加密操作
	 * 
	 * @param source
	 * @return
	 */
	/*public static String md5(String source) {

		if (source == null || source.length() == 0) {
			return null;
		}

		// 1.准备工作
		StringBuilder builder = new StringBuilder();
		char[] c = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		// 2.获取源字符串的字节数组
		byte[] bytes = source.getBytes();

		// 3.获取MessageDigest对象
		MessageDigest digest = null;
		try {
			digest = MessageDigest.getInstance("md5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		// 4.执行加密操作
		byte[] targetBytes = digest.digest(bytes);

		// 5.遍历字节数组
		for (int i = 0; i < targetBytes.length; i++) {
			byte b = targetBytes[i];

			// 6.取当前字节的高四位值
			int highValue = (b >> 4) & 15;

			// 7.取当前字节的低四位值
			int lowValue = b & 15;

			// 8.以上面计算的结果为下标从字符数组中取值
			char highChar = c[highValue];
			char lowChar = c[lowValue];

			// 9.拼装字符串
			builder.append(highChar).append(lowChar);

		}

		return builder.toString();
	}

	public static List<String> convertJSONToList(String json) {

		// 1.检查JSON字符串是否有效
		if (json == null || json.length() == 0) {
		
			return null;
		}

		// 2.将json字符串转换为List集合
		List<String> list = gson.fromJson(json, List.class);

		return list;
	}

	public static void processOptionToJson(Question question) {

		// 1.确认question对象不为null
		if (question == null) {
			return;
		}

		// 2.判断题型
		Integer type = question.getQuestionType();
		if (type == 3) {
			return;
		}

		// 3.获取原始的option字符串（刚刚从页面上提交上来的，未经处理的）
		String option = question.getQuestionOption();

		// 4.去除前后空格
		String trimedOption = option.trim();

		// 5.将trimedOption根据\r\n拆分为数组
		String[] split = trimedOption.split("\r\n");

		// 6.调用gson的方法执行转换操作
		String targetJson = gson.toJson(split);

		// 7.将转换得到的JSON字符串设置到Question对象中
		question.setQuestionOption(targetJson);
	}

	public static void processOptionFromJson(Question question) {
		if (question == null) {
			return;
		}

		Integer type = question.getQuestionType();
		if (type == 3) {
			return;
		}

		// 1.获取选项字符串，此时应该是从数据库中取出的JSON格式
		String jsonOption = question.getQuestionOption();

		// 2.将JSON格式字符串转换为List
		List<String> list = convertJSONToList(jsonOption);

		StringBuilder builder = new StringBuilder();

		// 3.遍历List将集合元素通过\r\n拼装为字符串
		for (String element : list) {
			builder.append(element).append("\r\n");
		}

		String targetOption = builder.toString().trim();

		question.setQuestionOption(targetOption);

	}

	public static String checkRedisplay(PageContext pageContext) {

		// 1.准备工作
		ServletRequest request = pageContext.getRequest();
		HttpSession session = pageContext.getSession();
		Map<Integer, Map<String, String[]>> allBagMap = (Map<Integer, Map<String, String[]>>) session
				.getAttribute(GlobalNames.ENGAGE_ALL_BAG_MAP);
		Bag bag = (Bag) request.getAttribute(GlobalNames.ENGAGE_CURRENT_BAG);
		Integer bagId = bag.getBagId();
		Map<String, String[]> paramMap = allBagMap.get(bagId);

		// ※如果paramMap为null，说明没有任何数据需要回显，所以后续操作不执行
		if (paramMap == null) {
			return "";
		}

		Question question = (Question) pageContext.findAttribute("question");

		// 2.拼表单标签的name属性值
		String paramName = "q" + question.getQuestionId();

		// 3.根据paramName从paramMap读取paramValues
		String[] paramValues = paramMap.get(paramName);

		// ※如果离开一个包裹时没有提交数据，那么再回到这个包裹时paramValues就会是null值，导致后面空指针异常
		// 为了避免空指针异常这里需要排除paramValues为null的情况
		if (paramValues == null) {
			return "";
		}

		// ※判断题型
		Integer questionType = question.getQuestionType();
		if (questionType == 1 || questionType == 2) {
			// 4.获取当前optionStatus对象
			LoopTagStatus optionStatus = (LoopTagStatus) pageContext.findAttribute("optionStatus");

			// 5.通过optionStatus获取当前选项遍历过程中的索引值
			int index = optionStatus.getIndex();

			// 6.将index转换为String类型
			String currentValue = index + "";

			// 7.将paramValues从数组类型转换为List类型
			List<String> paramList = Arrays.asList(paramValues);

			// 8.检查currentValue是否在paramList中
			if (paramList.contains(currentValue)) {
				return "checked='checked'";
			}

		}

		if (questionType == 3) {

			// 9.如果是简答题则直接从paramValues数组中获取索引为0的元素
			String value = paramValues[0];

			// 10.使用这个值设置文本框的value属性
			return "value='" + value + "'";

		}

		return "";
	}
*/


		/**
		 * 图片名生成
		 */
		public static String genImageName() {
			//取当前时间的长整形值包含毫秒
			long millis = System.currentTimeMillis();
			//long millis = System.nanoTime();
			//加上三位随机数
			Random random = new Random();
			int end3 = random.nextInt(999);
			//如果不足三位前面补0
			String str = millis + String.format("%03d", end3);
			
			return str;
		}
		
		/**
		 * 商品id生成
		 */
		public static long genItemId() {
			//取当前时间的长整形值包含毫秒
			long millis = System.currentTimeMillis();
			//long millis = System.nanoTime();
			//加上两位随机数
			Random random = new Random();
			int end2 = random.nextInt(99);
			//如果不足两位前面补0
			String str = millis + String.format("%02d", end2);
			long id = new Long(str);
			return id;
		}
		

}
