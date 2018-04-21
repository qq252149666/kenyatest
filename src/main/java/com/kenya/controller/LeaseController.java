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
import com.kenya.bean.Lease;
import com.kenya.dao.DeleteImg;
import com.kenya.service.LeaseService;
/**
 * 同城信息
 * @author Administrator
 *
 */

@Controller  
@RequestMapping("/Lease")
public class LeaseController {
	@Autowired
	LeaseService leaseService;
	
	DeleteImg deleteImg = new DeleteImg();
	/**
	 * 查询
	 * @param leaseName
	 * @param pn
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selectByFile")
	@ResponseBody
	public  HashMap<String, Object> SelectByFile(@RequestParam(value="leaseName",defaultValue="") String leaseName,@RequestParam(value="pn",defaultValue="1")Integer pn) throws Exception  {
		//返回map集合
		HashMap<String,Object> map = new HashMap<String, Object>();
		//page插件 pn页码 7显示几条记录
		PageHelper.startPage(pn, 7);
		//第一个查询默认分页
		List<Lease> list = leaseService.selectByFild(leaseName);
		//PageInfo封装分页信息
		PageInfo<Lease> page = new PageInfo<Lease>(list);
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
	 * 上传图片
	 */
	@RequestMapping("/inserLease")
	@ResponseBody
    public HashMap<String, Object> filesUpload(@RequestParam("files") MultipartFile[] files,Lease lease,
            HttpServletRequest request) {
        HashMap<String,Object> map = new HashMap<String,Object>();
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
        	
            System.out.println("集合里面的数据" + list.get(i));
            if(i==0) {
            	lease.setLeaseimgs("/kenya/upload/"+list.get(i));
            }
            if(i==1) {
            	lease.setLeaseimg1("/kenya/upload/"+list.get(i));
            }
            if(i==2) {
            	lease.setLeaseimg2("/kenya/upload/"+list.get(i));
            }
            if(i==3) {
            	lease.setLeaseimg3("/kenya/upload/"+list.get(i));
            }
            if(i==4) {
            	lease.setLeaseimg4("/kenya/upload/"+list.get(i));
            }
        }
        if(leaseService.IsNull(lease)=="非法访问") {
        	map.put("code", "040");
        	map.put("result","非法访问");
        }else {
        	leaseService.insert(lease);
        	map.put("code","000");
        	map.put("result",lease);
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
     * 删除图片
     */
    @RequestMapping("/deleteLease")
	@ResponseBody
	public  HashMap<String, Object> deleteLease(@RequestParam(value="leaseid",defaultValue="0")int leaseid,HttpServletRequest request){
    	HashMap<String,Object> map = new HashMap<String,Object>();
		if(leaseid==0) {
			map.put("Code", "040");
			map.put("result", "非法访问");
		}else {
			if(leaseService.selectById(leaseid).getLeaseimgs()!=null) {
				deleteImg.deleteImg(leaseService.selectById(leaseid).getLeaseimgs(), request);
			}
			if(leaseService.selectById(leaseid).getLeaseimg1()!=null) {
				deleteImg.deleteImg(leaseService.selectById(leaseid).getLeaseimg1(), request);
			}
			if(leaseService.selectById(leaseid).getLeaseimg2()!=null) {
				deleteImg.deleteImg(leaseService.selectById(leaseid).getLeaseimg2(), request);
			}
			if(leaseService.selectById(leaseid).getLeaseimg3()!=null) {
				deleteImg.deleteImg(leaseService.selectById(leaseid).getLeaseimg3(), request);
			}
			if(leaseService.selectById(leaseid).getLeaseimg4()!=null) {
				deleteImg.deleteImg(leaseService.selectById(leaseid).getLeaseimg4(), request);
			}
			if(leaseService.delete(leaseid)==0) {
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
		List<Lease> list=leaseService.selectByUserId(userid);
		PageInfo<Lease> page = new PageInfo<Lease>(list);
		if(page.isIsLastPage()) {
			map.put("code","040");
		}else {
			map.put("code","000");
		}
		map.put("result", list);
		return map;
    }
}
    

