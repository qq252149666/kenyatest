package com.kenya.service;

import java.util.List;

import com.kenya.until.EUTreeNode;
import com.kenya.until.KYResult;


public interface ContentCategoryService {
	
	List <EUTreeNode> getCategoryList(long parentId);
	KYResult insertContentCatgory(long parentId,String name);
	KYResult deleteContentCatgory(long parentId,long Id);
	KYResult deleteContentCatgoryById(Long id);
	KYResult updateContentCatgory(long id, String name);

}
