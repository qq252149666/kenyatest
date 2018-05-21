package com.kenya.dao;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import net.coobird.thumbnailator.Thumbnails;

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
		String filePath = "C:/usr/local/tomcat/upload"+str;
		File file = new File(filePath);
		file.delete();
		return "删除成功";
	}
	/**
	 * 上传缩略图
	 * @throws IOException 
	 */
	public String goImg(MultipartFile file,String saveDird,HttpServletRequest request,HttpServletResponse response) throws IOException {
		String str = saveDird;
		for(int len=str.length();0<len;len--){
			if(str.substring(len-1,len).equals("\\")) {
				str=str.substring(len, str.length());
				break;
			}
		}
		String filePath = request.getSession().getServletContext()
                .getRealPath("/")+ "thumbnail/"+str;
		File saveDir = new File(filePath);
        if (!saveDir.getParentFile().exists())
            saveDir.getParentFile().mkdirs();
        BufferedImage image = ImageIO.read(file.getInputStream());
        int width = image.getWidth();
        System.out.println(saveDir);
        if(width>320) {
        	Thumbnails.of(file.getInputStream()).scale(320.0/width).toFile(saveDir);
        }else {
        	file.transferTo(saveDir);
        }
		return filePath;
	}
}
