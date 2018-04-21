package com.kenya.dao;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import net.coobird.thumbnailator.Thumbnails;

public class SaveFile {
	@SuppressWarnings("unused")
	private List<String> saveFile(HttpServletRequest request,MultipartFile file, List<String> list) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
        	Random rand = new Random();//生成随机数    
            int random = rand.nextInt();//保存随机数
            //生成保存地址
            String filePath = request.getSession().getServletContext()
                    .getRealPath("/")
                    + "upload/" + String.valueOf(random)+file.getOriginalFilename();
            list.add(random+file.getOriginalFilename());
            File saveDir = new File(filePath);
            if (!saveDir.getParentFile().exists())
                saveDir.getParentFile().mkdirs();
    		try {
    			//转换为图片格式
    			BufferedImage bi = null;
    			bi = ImageIO.read(file.getInputStream());
    			//先判断图片是否宽于720
    	    	if(bi.getWidth()>=720) {
    			//如果宽于720就强制缩放成720
    			Thumbnails.of(file.getInputStream()).size(720, bi.getHeight()).toFile(saveDir);
    	    	}
    		} catch (Exception e) {
        		try {
        			//如果失败转存
        			file.transferTo(saveDir);
        		} catch (Exception e1) {
        			e1.printStackTrace();
        		}
        		e.printStackTrace();
        	}
    		}
        return list;
    }
}
