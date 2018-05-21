package com.kenya.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kenya.service.ContentCategoryService;
import com.kenya.until.EUTreeNode;
import com.kenya.until.KYResult;

/*	import com.taotao.pojo.EUTreeNode;
	import com.taotao.service.ContentCategoryService;
	import com.taotao.utils.TaotaoResult;
*/
	@Controller
	@RequestMapping("/content/category")
	public class ContentCategoryController {
		@Autowired
		private ContentCategoryService contentCategoryService;
		@RequestMapping("/list")
		@ResponseBody
		public List<EUTreeNode> getContenCatList(@RequestParam (value="id",defaultValue="0")Long parentId){
			List<EUTreeNode> list = contentCategoryService.getCategoryList(parentId);
			return list;
			
		}
		@RequestMapping("/create")
		@ResponseBody
		public KYResult createContentCatgory (Long parentId, String name ){
			KYResult result = contentCategoryService.insertContentCatgory(parentId, name);
			
			return result;
			
		}
		@RequestMapping("/delete/")
		@ResponseBody
		public KYResult deleteContentCatgory (Long parentId,Long id){
			if (parentId == null){
				KYResult result = contentCategoryService.deleteContentCatgoryById(id);
				return result;
			}
			KYResult result = contentCategoryService.deleteContentCatgory(parentId,id);
			
			return result;
			
		}
		
		@RequestMapping("/update")
		@ResponseBody
		public KYResult updateContentCatgory (long id, String name ){
			KYResult result = contentCategoryService.updateContentCatgory(id, name);
			
			return result;
			
		}

	}


