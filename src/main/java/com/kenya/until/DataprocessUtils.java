package com.kenya.until;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

import com.google.gson.Gson;
/*import com.atguigu.survey.entities.guest.Bag;
import com.atguigu.survey.entities.guest.Question;*/
//import com.google.gson.Gson;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class DataprocessUtils {
	private static Gson gson = new Gson();

	public static String resizeImages(InputStream inputStream, String realPath) {

		OutputStream out = null;

		try {
			// 1.鏋勯�犲師濮嬪浘鐗囧搴旂殑Image瀵硅薄
			BufferedImage sourceImage = ImageIO.read(inputStream);

			// 2.鑾峰彇鍘熷鍥剧墖鐨勫楂樺��
			int sourceWidth = sourceImage.getWidth();
			int sourceHeight = sourceImage.getHeight();

			// 3.璁＄畻鐩爣鍥剧墖鐨勫楂樺��
			int targetWidth = sourceWidth;
			int targetHeight = sourceHeight;

			if (sourceWidth > 720) {
				// 鎸夋瘮渚嬪帇缂╃洰鏍囧浘鐗囩殑灏哄
				targetWidth = 720;
				targetHeight = sourceHeight * (sourceWidth / 720);
			}

			// 4.鍒涘缓鍘嬬缉鍚庣殑鐩爣鍥剧墖瀵瑰簲鐨処mage瀵硅薄
			BufferedImage targetImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);

			// 5.缁樺埗鐩爣鍥剧墖
			targetImage.getGraphics().drawImage(sourceImage, 0, 0, targetWidth, targetHeight, null);

			// 6.鏋勯�犵洰鏍囧浘鐗囨枃浠跺悕
			String targetFileName = System.nanoTime() + ".jpg";

			// 7.鍒涘缓鐩爣鍥剧墖瀵瑰簲鐨勮緭鍑烘祦
			out = new FileOutputStream(realPath + "/" + targetFileName);

			// 8.鑾峰彇JPEG鍥剧墖缂栫爜鍣�
			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);

			// 9.JPEG缂栫爜
			encoder.encode(targetImage);

			// 10.杩斿洖鏂囦欢鍚�
			return "/kenya/upload/" + targetFileName;

		} catch (Exception e) {

			e.printStackTrace();

			return null;
		} finally {
			// 10.鍏抽棴娴�
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	/**
	 * 瀵规簮瀛楃涓茶繘琛屽姞瀵嗘搷浣�
	 * 
	 * @param source
	 * @return
	 */
	/*public static String md5(String source) {

		if (source == null || source.length() == 0) {
			return null;
		}

		// 1.鍑嗗宸ヤ綔
		StringBuilder builder = new StringBuilder();
		char[] c = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		// 2.鑾峰彇婧愬瓧绗︿覆鐨勫瓧鑺傛暟缁�
		byte[] bytes = source.getBytes();

		// 3.鑾峰彇MessageDigest瀵硅薄
		MessageDigest digest = null;
		try {
			digest = MessageDigest.getInstance("md5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		// 4.鎵ц鍔犲瘑鎿嶄綔
		byte[] targetBytes = digest.digest(bytes);

		// 5.閬嶅巻瀛楄妭鏁扮粍
		for (int i = 0; i < targetBytes.length; i++) {
			byte b = targetBytes[i];

			// 6.鍙栧綋鍓嶅瓧鑺傜殑楂樺洓浣嶅��
			int highValue = (b >> 4) & 15;

			// 7.鍙栧綋鍓嶅瓧鑺傜殑浣庡洓浣嶅��
			int lowValue = b & 15;

			// 8.浠ヤ笂闈㈣绠楃殑缁撴灉涓轰笅鏍囦粠瀛楃鏁扮粍涓彇鍊�
			char highChar = c[highValue];
			char lowChar = c[lowValue];

			// 9.鎷艰瀛楃涓�
			builder.append(highChar).append(lowChar);

		}

		return builder.toString();
	}

	public static List<String> convertJSONToList(String json) {

		// 1.妫�鏌SON瀛楃涓叉槸鍚︽湁鏁�
		if (json == null || json.length() == 0) {
		
			return null;
		}

		// 2.灏唈son瀛楃涓茶浆鎹负List闆嗗悎
		List<String> list = gson.fromJson(json, List.class);

		return list;
	}

	public static void processOptionToJson(Question question) {

		// 1.纭question瀵硅薄涓嶄负null
		if (question == null) {
			return;
		}

		// 2.鍒ゆ柇棰樺瀷
		Integer type = question.getQuestionType();
		if (type == 3) {
			return;
		}

		// 3.鑾峰彇鍘熷鐨刼ption瀛楃涓诧紙鍒氬垰浠庨〉闈笂鎻愪氦涓婃潵鐨勶紝鏈粡澶勭悊鐨勶級
		String option = question.getQuestionOption();

		// 4.鍘婚櫎鍓嶅悗绌烘牸
		String trimedOption = option.trim();

		// 5.灏唗rimedOption鏍规嵁\r\n鎷嗗垎涓烘暟缁�
		String[] split = trimedOption.split("\r\n");

		// 6.璋冪敤gson鐨勬柟娉曟墽琛岃浆鎹㈡搷浣�
		String targetJson = gson.toJson(split);

		// 7.灏嗚浆鎹㈠緱鍒扮殑JSON瀛楃涓茶缃埌Question瀵硅薄涓�
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

		// 1.鑾峰彇閫夐」瀛楃涓诧紝姝ゆ椂搴旇鏄粠鏁版嵁搴撲腑鍙栧嚭鐨凧SON鏍煎紡
		String jsonOption = question.getQuestionOption();

		// 2.灏咼SON鏍煎紡瀛楃涓茶浆鎹负List
		List<String> list = convertJSONToList(jsonOption);

		StringBuilder builder = new StringBuilder();

		// 3.閬嶅巻List灏嗛泦鍚堝厓绱犻�氳繃\r\n鎷艰涓哄瓧绗︿覆
		for (String element : list) {
			builder.append(element).append("\r\n");
		}

		String targetOption = builder.toString().trim();

		question.setQuestionOption(targetOption);

	}

	public static String checkRedisplay(PageContext pageContext) {

		// 1.鍑嗗宸ヤ綔
		ServletRequest request = pageContext.getRequest();
		HttpSession session = pageContext.getSession();
		Map<Integer, Map<String, String[]>> allBagMap = (Map<Integer, Map<String, String[]>>) session
				.getAttribute(GlobalNames.ENGAGE_ALL_BAG_MAP);
		Bag bag = (Bag) request.getAttribute(GlobalNames.ENGAGE_CURRENT_BAG);
		Integer bagId = bag.getBagId();
		Map<String, String[]> paramMap = allBagMap.get(bagId);

		// 鈥诲鏋減aramMap涓簄ull锛岃鏄庢病鏈変换浣曟暟鎹渶瑕佸洖鏄撅紝鎵�浠ュ悗缁搷浣滀笉鎵ц
		if (paramMap == null) {
			return "";
		}

		Question question = (Question) pageContext.findAttribute("question");

		// 2.鎷艰〃鍗曟爣绛剧殑name灞炴�у��
		String paramName = "q" + question.getQuestionId();

		// 3.鏍规嵁paramName浠巔aramMap璇诲彇paramValues
		String[] paramValues = paramMap.get(paramName);

		// 鈥诲鏋滅寮�涓�涓寘瑁规椂娌℃湁鎻愪氦鏁版嵁锛岄偅涔堝啀鍥炲埌杩欎釜鍖呰９鏃秔aramValues灏变細鏄痭ull鍊硷紝瀵艰嚧鍚庨潰绌烘寚閽堝紓甯�
		// 涓轰簡閬垮厤绌烘寚閽堝紓甯歌繖閲岄渶瑕佹帓闄aramValues涓簄ull鐨勬儏鍐�
		if (paramValues == null) {
			return "";
		}

		// 鈥诲垽鏂鍨�
		Integer questionType = question.getQuestionType();
		if (questionType == 1 || questionType == 2) {
			// 4.鑾峰彇褰撳墠optionStatus瀵硅薄
			LoopTagStatus optionStatus = (LoopTagStatus) pageContext.findAttribute("optionStatus");

			// 5.閫氳繃optionStatus鑾峰彇褰撳墠閫夐」閬嶅巻杩囩▼涓殑绱㈠紩鍊�
			int index = optionStatus.getIndex();

			// 6.灏唅ndex杞崲涓篠tring绫诲瀷
			String currentValue = index + "";

			// 7.灏唒aramValues浠庢暟缁勭被鍨嬭浆鎹负List绫诲瀷
			List<String> paramList = Arrays.asList(paramValues);

			// 8.妫�鏌urrentValue鏄惁鍦╬aramList涓�
			if (paramList.contains(currentValue)) {
				return "checked='checked'";
			}

		}

		if (questionType == 3) {

			// 9.濡傛灉鏄畝绛旈鍒欑洿鎺ヤ粠paramValues鏁扮粍涓幏鍙栫储寮曚负0鐨勫厓绱�
			String value = paramValues[0];

			// 10.浣跨敤杩欎釜鍊艰缃枃鏈鐨剉alue灞炴��
			return "value='" + value + "'";

		}

		return "";
	}
*/


}
