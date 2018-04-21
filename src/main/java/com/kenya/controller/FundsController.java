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
import com.kenya.bean.Admin;
import com.kenya.bean.Funds;
import com.kenya.service.AdminService;
import com.kenya.service.FundsService;

@Controller  
@RequestMapping("/Funds")
public class FundsController {

	
	@Autowired
	FundsService fundsservice;
	
	@Autowired 
	AdminService adminservice;
	/**
	 * 分页查询显示数据
	 */
	@RequestMapping("selectbyfile")
	@ResponseBody
	public HashMap<String,Object> selectbyfile(@RequestParam(value="pn",defaultValue="1")int pn,String fundsName){
		//返回map集合
		HashMap<String,Object> map = new HashMap<String, Object>();
		//page插件 pn页码 7显示几条记录
		PageHelper.startPage(pn, 7);
		//第一个查询默认分页
		List<Funds> list = fundsservice.Selectbyfile(fundsName);
		//PageInfo封装分页信息
		PageInfo<Funds> page = new PageInfo<Funds>(list);
		//map封装分页数据
		map.put("result", list);
		if(page.isIsLastPage()) {
			map.put("code","040");
		}else {
			map.put("code","000");
		}
		return map;
	}
	
	@RequestMapping("/inserfunds")
	@ResponseBody
	public HashMap<String,Object> inserfunds(@RequestParam("files")MultipartFile[] files,Funds funds,
            HttpServletRequest request) {
		funds.setAdminid(Integer.valueOf(String.valueOf(request.getSession().getAttribute("adminid"))));
		List<String> list = new ArrayList<String>();
		//遍历获得的MultiparFile数组
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
            	funds.setFundsimgs("/kenya/upload/"+list.get(i));
            }
            if(i==1) {
            	funds.setFundsimg1("/kenya/upload/"+list.get(i));
            }
            if(i==2) {
            	funds.setFundsimg2("/kenya/upload/"+list.get(i));
            }
            if(i==3) {
            	funds.setFundsimg3("/kenya/upload/"+list.get(i));
            }
            if(i==4) {
            	funds.setFundsimg4("/kenya/upload/"+list.get(i));
            }
        }
        //返回map
        HashMap<String,Object> map = new HashMap<String,Object>();
        //判断是否有空值
        if(fundsservice.IsNull(funds)=="非法访问") {
        	map.put("code", "040");
        	map.put("result","非法访问");
        }else {
        	//数据库添加
        	fundsservice.insertfunds(funds);
        	//添加外键
        	Admin user = adminservice.selectbyid(funds.getAdminid());
        	//外键中密码为空
        	user.setAdminpassword("");
        	funds.setAdmin(user);
        	map.put("code","000");
        	//返回插入的实体类
        	map.put("result",funds);
        }
        return map;//跳转的页面
    }

    private List<String> saveFile(HttpServletRequest request,
            MultipartFile file, List<String> list) {
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
        			//如果失败转存
        			file.transferTo(saveDir);
        		} catch (Exception e1) {
        			e1.printStackTrace();
        		}
    		}
        return list;
    }
}
