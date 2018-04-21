package com.kenya.controller;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kenya.bean.Live;
import com.kenya.bean.User;
import com.kenya.dao.DeleteImg;
import com.kenya.service.LiveService;
import com.kenya.service.UserService;

/**
 * 生活服务控制台
 * @author Administrator
 *
 */

@Controller  
@RequestMapping("/Live")
public class LiveController {
	@Autowired
	LiveService liveService;
	@Autowired
	UserService userService;
	DeleteImg deleteImg = new DeleteImg();
	/**
	 * 查询
	 * @param liveType
	 * @param pn
	 * @param model
	 * @return
	 */
	@RequestMapping("/SelectByType")
	@ResponseBody
	public  HashMap<String, Object> SelectByType(String liveName,@RequestParam(value="liveType",defaultValue="不限")String liveType,@RequestParam(value="pn",defaultValue="1")int pn){
		//返回map集合
		HashMap<String,Object> map = new HashMap<String, Object>();
		//page插件 pn页码 7显示几条记录
		PageHelper.startPage(pn, 7);
		//第一个查询默认分页
		List<Live> list = liveService.selectByType(liveName,liveType);
		//PageInfo封装分页信息
		PageInfo<Live> page = new PageInfo<Live>(list);
		//map封装分页数据
		map.put("result", list);
		if(page.isIsLastPage()) {
			map.put("code","040");
		}else {
			map.put("code","000");
		}
		return map;
	}
	/**
	 * 多文件上传
	 * @param files
	 * @param request
	 * @return
	 */
    @RequestMapping(value="/filesUpload")
    //requestParam要写才知道是前台的那个数组
    @ResponseBody
    public HashMap<String, Object> filesUpload(@RequestParam("files") MultipartFile[] files,Live live,
            HttpServletRequest request) {
        List<String> list = new ArrayList<String>();
        if (files != null && files.length > 0) {
            for (int i = 0; i < files.length; i++) {
                MultipartFile file = files[i];
                // 保存文件
                list = saveFile(request, file, list);
            }
        }
        //insert准备工作
        for (int i = 0; i < list.size(); i++) {
            if(i==0) {
            	live.setLiveimgs("/kenya/upload/"+list.get(i));
            }
            if(i==1) {
            	live.setLiveimg1("/kenya/upload/"+list.get(i));
            }
            if(i==2) {
            	live.setLiveimg2("/kenya/upload/"+list.get(i));
            }
            if(i==3) {
            	live.setLiveimg3("/kenya/upload/"+list.get(i));
            }
            if(i==4) {
            	live.setLiveimg4("/kenya/upload/"+list.get(i));
            }
        }
        HashMap<String,Object> map = new HashMap<String,Object>();
        if(liveService.IsNull(live)=="非法访问") {
        	map.put("code", "040");
        	map.put("result","非法访问");
        }else {
        	liveService.inserLive(live);
        	User user = userService.selectbyId(live.getUserid());
        	user.setUserPsw("");
        	live.setUser(user);
        	map.put("code","000");
        	map.put("result",live);
        }
        return map;//跳转的页面
    }

    private List<String> saveFile(HttpServletRequest request,
            MultipartFile file, List<String> list) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
            	Random rand = new Random();//生成随机数    
                int random = rand.nextInt();
                String filePath = request.getSession().getServletContext()
                        .getRealPath("/")
                        + "upload/" + String.valueOf(random)+file.getOriginalFilename();
                System.out.println("filePath"+filePath+"file.getOriginalFilename()"+file.getOriginalFilename());
                list.add(random+file.getOriginalFilename());
                File saveDir = new File(filePath);
                if (!saveDir.getParentFile().exists())
                    saveDir.getParentFile().mkdirs();
                System.out.println("saveDir"+saveDir);
                // 转存文件
                file.transferTo(saveDir);
                return list;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    /**
     * 查询用户发布的生活服务
     */
    @RequestMapping("/selectByUserId")
    @ResponseBody
    public HashMap<String,Object> selectByUserId(@RequestParam(value="userid",defaultValue="0")int userid,@RequestParam(value="pn",defaultValue="1")int pn){
		HashMap<String,Object> map = new HashMap<String,Object>();
		//page插件 pn页码 7显示几条记录
		PageHelper.startPage(pn, 7);
		List<Live> list=liveService.selectByUserId(userid);
		PageInfo<Live> page = new PageInfo<Live>(list);
		if(page.isIsLastPage()) {
			map.put("code","040");
		}else {
			map.put("code","000");
		}
		map.put("result", list);
		return map;
    }
    /**
     * 删除用户发布的信息及服务器上的图片
     */
    @RequestMapping("/deleteLive")
	@ResponseBody
	public  HashMap<String, Object> deletelive(@RequestParam(value="liveid",defaultValue="0")int liveid,HttpServletRequest request){
    	HashMap<String,Object> map = new HashMap<String,Object>();
		if(liveid==0) {
			map.put("code", "040");
			map.put("result", "非法访问");
		}else {
			if(liveService.selectById(liveid).getLiveimgs()!=null) {
				deleteImg.deleteImg(liveService.selectById(liveid).getLiveimgs(), request);
			}
			if(liveService.selectById(liveid).getLiveimg1()!=null) {
				deleteImg.deleteImg(liveService.selectById(liveid).getLiveimg1(), request);
			}
			if(liveService.selectById(liveid).getLiveimg2()!=null) {
				deleteImg.deleteImg(liveService.selectById(liveid).getLiveimg2(), request);
			}
			if(liveService.selectById(liveid).getLiveimg3()!=null) {
				deleteImg.deleteImg(liveService.selectById(liveid).getLiveimg3(), request);
			}
			if(liveService.selectById(liveid).getLiveimg4()!=null) {
				deleteImg.deleteImg(liveService.selectById(liveid).getLiveimg4(), request);
			}
				if(liveService.deleteLive(liveid)==0) {
					map.put("code", "040");
					map.put("result", "删除失败");
				}else {
					map.put("code", "000");
					map.put("result","删除成功");
				}
		}
		return map;
	}
    
}
