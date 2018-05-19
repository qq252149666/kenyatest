package com.kenya.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kenya.bean.Goods;
import com.kenya.dao.DeleteImg;
import com.kenya.service.GoodsService;

/**
 * 商品控制器
 * @author Administrator
 *
 */
@Controller  
@RequestMapping("Goods") 
public class GoodsController {
	@Autowired
	GoodsService goodsService;
	
	DeleteImg deleteImg = new DeleteImg();
	@RequestMapping("/selectByFile")
	@ResponseBody
	public  HashMap<String, Object> SelectByFile(Integer id,@RequestParam(value="goodsName",defaultValue="") String goodsName,@RequestParam(value="pn",defaultValue="1")Integer pn,Model model) throws Exception  {
		//返回map集合
		HashMap<String,Object> map = new HashMap<String, Object>();
		//page插件 pn页码 7显示几条记录
		PageHelper.startPage(pn, 7);
		//第一个查询默认分页
		List<Goods> list = goodsService.selectByfild(goodsName);
		//PageInfo封装分页信息
		PageInfo<Goods> page = new PageInfo<Goods>(list);
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
	 * 按照用户id查询商品
	 */
	@RequestMapping("/selectByUserId")
	@ResponseBody
	public HashMap<String,Object> selectByUserId(@RequestParam(value="userid",defaultValue="0")int userid,@RequestParam(value="pn",defaultValue="1")Integer pn){
		HashMap<String,Object> map = new HashMap<String,Object>();
		//page插件 pn页码 7显示几条记录
		PageHelper.startPage(pn, 7);
		List<Goods> list=goodsService.selectbyUserid(userid);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		if(page.isIsLastPage()) {
			map.put("code","040");
		}else {
			map.put("code","000");
		}
		map.put("result", list);
		return map;
	}
	/**
	 * 修改用户发布的Goods商品
	 */
	@RequestMapping("/upGoods")
	@ResponseBody
	public HashMap<String,Object> updateGoods(Goods goods){
		HashMap<String,Object> map = new HashMap<String,Object>();
		if(goodsService.updateGoods(goods)==0) {
			map.put("code", "040");
			map.put("result", null);
			map.put("message", "Process Failed");
		}else {
			map.put("code", "000");
			map.put("result", goods);
			map.put("message", "Modify Successfully");
		}
		return map;
	}
	@RequestMapping("/deleteGoods")
	@ResponseBody
	public HashMap<String,Object> deleteGoods(@RequestParam(value="goodsid",defaultValue="0")int goodsid,HttpServletRequest request){
		HashMap<String,Object> map = new HashMap<String,Object>();
		if(goodsid==0) {
			map.put("code", "040");
			map.put("result", null);
			map.put("message", "Invalid Visit");
		}else {
			if(goodsService.selectById(goodsid).getGoodsimgs()!=null) {
				deleteImg.deleteImg(goodsService.selectById(goodsid).getGoodsimgs(), request);
			}
			if(goodsService.selectById(goodsid).getGoodsimg1()!=null) {
				deleteImg.deleteImg(goodsService.selectById(goodsid).getGoodsimg1(), request);
			}
			if(goodsService.selectById(goodsid).getGoodsimg2()!=null) {
				deleteImg.deleteImg(goodsService.selectById(goodsid).getGoodsimg2(), request);
			}
			if(goodsService.selectById(goodsid).getGoodsimg3()!=null) {
				deleteImg.deleteImg(goodsService.selectById(goodsid).getGoodsimg3(), request);
			}
			if(goodsService.selectById(goodsid).getGoodsimg4()!=null) {
				deleteImg.deleteImg(goodsService.selectById(goodsid).getGoodsimg4(), request);
			}
			if(goodsService.deleteGoods(goodsid)==0) {
				map.put("code", "040");
				map.put("result", "Process Failed");
			}else {
				map.put("code", "000");
				map.put("result","Deleted");
			}
		}
		return map;
	}
	
}
