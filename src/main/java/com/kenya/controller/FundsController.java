package com.kenya.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.kenya.dao.DeleteImg;
import com.kenya.service.AdminService;
import com.kenya.service.FundsService;

@Controller  
@RequestMapping("Funds")
public class FundsController {

	
	DeleteImg deleteImg=new DeleteImg();
	@Autowired
	FundsService fundsservice;
	
	@Autowired 
	AdminService adminservice;
	/**
	 * 分页查询显示数据
	 */
	@RequestMapping("/selectbyfile")
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
		map.put("count", page.getTotal());;
		map.put("pages", page.getPages());
		if(page.isIsLastPage()) {
			map.put("code","040");
		}else {
			map.put("code","000");
		}
		return map;
	}
	
	@RequestMapping("/inserfunds")
	@ResponseBody
	public HashMap<String,Object> inserfunds(@RequestParam("files")MultipartFile[] files,MultipartFile Fundhead,Funds funds,
            HttpServletRequest request,HttpServletResponse response,String minprice,String maxprice) throws IOException, Exception {
		funds.setAdminid(Integer.valueOf(String.valueOf(request.getSession().getAttribute("adminid"))));
		List<String> list = new ArrayList<String>();
		//遍历获得的MultiparFile数组
        if (files != null && files.length > 0) {
            for (int i = 0; i < files.length; i++) {
                MultipartFile file = files[i];
                // 保存文件
				list = saveFile(request, file, list,response);
            }
        }
        List<String> list1 = new ArrayList<String>();
        list1 = saveFile(request, Fundhead, list,response);
        funds.setFundshead("/upload/"+list1.get(0));
        if(maxprice=="") {
        	funds.setFundsprice(minprice);
        }else {
        	funds.setFundsprice(minprice+"-"+maxprice);
        }
        //insert准备工作
        for (int i = 0; i < list.size(); i++) {
            if(i==0) {
            	funds.setFundsimgs("/upload/"+list.get(i));
            }
            if(i==1) {
            	funds.setFundsimg1("/upload/"+list.get(i));
            }
            if(i==2) {
            	funds.setFundsimg2("/upload/"+list.get(i));
            }
            if(i==3) {
            	funds.setFundsimg3("/upload/"+list.get(i));
            }
            if(i==4) {
            	funds.setFundsimg4("/upload/"+list.get(i));
            }
        }
        //返回map
        HashMap<String,Object> map = new HashMap<String,Object>();
        //判断是否有空值
        if(fundsservice.IsNull(funds)=="非法访问") {
        	map.put("code", "040");
        	map.put("message","非法访问");
        	map.put("result",null);
        }else {
        	//数据库添加
        	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(sdf.format(new Date()));
            funds.setFundsdate(date);
        	if(fundsservice.insertfunds(funds)!=0) {
        		Admin user = adminservice.selectbyid(funds.getAdminid());
            	//外键中密码为空
            	user.setAdminpassword("");
            	funds.setAdmin(user);
            	map.put("code","000");
            	map.put("message","Posting Successfully");
            	//返回插入的实体类
            	map.put("result",funds);
        	}else {
        		map.put("code","040");
            	map.put("message","Posting Failed");
            	//返回插入的实体类
            	map.put("result",null);
        	}
        	
        }
        return map;//跳转的页面
    }
	@RequestMapping("/updatefunds")
	@ResponseBody
	public HashMap<String,Object> updatefunds(@RequestParam("files")MultipartFile[] files,@RequestParam("Fundhead")MultipartFile Fundhead,Funds funds,
            HttpServletRequest request,HttpServletResponse response,String minprice,String maxprice) throws IOException {
		funds.setAdminid(Integer.valueOf(String.valueOf(request.getSession().getAttribute("adminid"))));
		List<String> list = new ArrayList<String>();
		//遍历获得的MultiparFile数组
        if (files != null && files.length > 0) {
        	if(fundsservice.selectById(funds.getFundsid()).getFundshead()!=null) {
				deleteImg.deleteImg(fundsservice.selectById(funds.getFundsid()).getFundshead(), request);
			}
			if(fundsservice.selectById(funds.getFundsid()).getFundsimgs()!=null) {
				deleteImg.deleteImg(fundsservice.selectById(funds.getFundsid()).getFundsimgs(), request);
			}
			if(fundsservice.selectById(funds.getFundsid()).getFundsimg1()!=null) {
				deleteImg.deleteImg(fundsservice.selectById(funds.getFundsid()).getFundsimg1(), request);
			}
			if(fundsservice.selectById(funds.getFundsid()).getFundsimg2()!=null) {
				deleteImg.deleteImg(fundsservice.selectById(funds.getFundsid()).getFundsimg2(), request);
			}
			if(fundsservice.selectById(funds.getFundsid()).getFundsimg3()!=null) {
				deleteImg.deleteImg(fundsservice.selectById(funds.getFundsid()).getFundsimg3(), request);
			}
			if(fundsservice.selectById(funds.getFundsid()).getFundsimg4()!=null) {
				deleteImg.deleteImg(fundsservice.selectById(funds.getFundsid()).getFundsimg4(), request);
			}
            for (int i = 0; i < files.length; i++) {
                MultipartFile file = files[i];
                // 保存文件
				list = saveFile(request, file, list,response);
            }
        }else {
        	funds.setFundsimgs(fundsservice.selectById(funds.getFundsid()).getFundsimgs());
        	funds.setFundsimg1(fundsservice.selectById(funds.getFundsid()).getFundsimg1());
        	funds.setFundsimg2(fundsservice.selectById(funds.getFundsid()).getFundsimg2());
        	funds.setFundsimg3(fundsservice.selectById(funds.getFundsid()).getFundsimg3());
        	funds.setFundsimg4(fundsservice.selectById(funds.getFundsid()).getFundsimg4());
        }
        if(Fundhead.equals(null)) {
        	funds.setFundshead("/kenya/upload/"+saveFile(request,Fundhead,list,response).get(0));
        }else {
        	funds.setFundshead(fundsservice.selectById(funds.getFundsid()).getFundshead());
        }
        if(maxprice.equals("")) {
        	funds.setFundsprice(minprice);
        }else {
        	funds.setFundsprice(minprice+"-"+maxprice);
        }
        //insert准备工作
        for (int i = 0; i < list.size(); i++) {
            if(i==0) {
            	funds.setFundsimgs("/upload/"+list.get(i));
            }
            if(i==1) {
            	funds.setFundsimg1("/upload/"+list.get(i));
            }
            if(i==2) {
            	funds.setFundsimg2("/upload/"+list.get(i));
            }
            if(i==3) {
            	funds.setFundsimg3("/upload/"+list.get(i));
            }
            if(i==4) {
            	funds.setFundsimg4("/upload/"+list.get(i));
            }
        }
        //返回map
        HashMap<String,Object> map = new HashMap<String,Object>();
        //判断是否有空值
        if(fundsservice.IsNull(funds)=="非法访问") {
        	map.put("code", "040");
        	map.put("message","非法访问");
        }else {
        	//数据库添加
        	if(fundsservice.updatefunds(funds)!=0) {
        		Admin user = adminservice.selectbyid(funds.getAdminid());
            	//外键中密码为空
            	user.setAdminpassword("");
            	funds.setAdmin(user);
            	map.put("code","000");
            	map.put("message","Modify Successfully");
            	//返回插入的实体类
            	map.put("result",funds);
        	}else {
        		map.put("code","040");
            	map.put("message","Process Failed");
            	//返回插入的实体类
            	map.put("result",null);
        	}
        	
        }
        return map;//跳转的页面
    }
	private List<String> saveFile(HttpServletRequest request,
            MultipartFile file, List<String> list,HttpServletResponse response) throws IOException {
        // 判断文件是否为空
        if (!file.isEmpty()) {
        	Random rand = new Random();//生成随机数    
            int random = rand.nextInt();
            String serverpath = request.getSession().getServletContext()
                    .getRealPath("/");
            String parentpath = new File(serverpath).getParent();
            String filePath = parentpath+"\\upload\\" + String.valueOf(random)+file.getOriginalFilename();
            list.add(random+file.getOriginalFilename());
            File saveDir = new File(filePath);
            if (!saveDir.getParentFile().exists())
                saveDir.getParentFile().mkdirs();
			file.transferTo(saveDir);
        }
        return list;
    }
    @RequestMapping("/deletefunds")
    @ResponseBody
    public HashMap<String,Object> deletefunds(@RequestParam(value="fundsid",defaultValue="0")int fundsid,HttpServletRequest request){
    	HashMap<String,Object> map = new HashMap<String,Object>();
    	if(fundsid==0) {
			map.put("Code", "040");
			map.put("message", "非法访问");
		}else {
			if(fundsservice.selectById(fundsid).getFundshead()!=null) {
				deleteImg.deleteImg(fundsservice.selectById(fundsid).getFundshead(), request);
			}
			if(fundsservice.selectById(fundsid).getFundsimgs()!=null) {
				deleteImg.deleteImg(fundsservice.selectById(fundsid).getFundsimgs(), request);
			}
			if(fundsservice.selectById(fundsid).getFundsimg1()!=null) {
				deleteImg.deleteImg(fundsservice.selectById(fundsid).getFundsimg1(), request);
			}
			if(fundsservice.selectById(fundsid).getFundsimg2()!=null) {
				deleteImg.deleteImg(fundsservice.selectById(fundsid).getFundsimg2(), request);
			}
			if(fundsservice.selectById(fundsid).getFundsimg3()!=null) {
				deleteImg.deleteImg(fundsservice.selectById(fundsid).getFundsimg3(), request);
			}
			if(fundsservice.selectById(fundsid).getFundsimg4()!=null) {
				deleteImg.deleteImg(fundsservice.selectById(fundsid).getFundsimg4(), request);
			}
			if(fundsservice.delete(fundsid)==0) {
				map.put("code", "040");
				map.put("message", "Process Failed");
			}else {
				map.put("code", "000");
				map.put("message","Deleted");
			}
		}
    	return map;
    }
    @RequestMapping("/selectById")
    @ResponseBody
    public HashMap<String,Object> selectById(int fundsid){
    	HashMap<String,Object> map = new HashMap<String,Object>();
    	Funds funds;
    	funds = fundsservice.selectById(fundsid);
    	if(funds==null) {
    		map.put("result", funds);
        	map.put("code", "040");
        	map.put("message", "Process Failed");
    	}else {
	    	map.put("result", funds);
	    	map.put("code", "000");
	    	map.put("message", "Modify Successfully");
    	}
    	return map;
    }
}
