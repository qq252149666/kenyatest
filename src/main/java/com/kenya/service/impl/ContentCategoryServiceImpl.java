package com.kenya.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.ContentCategory;
import com.kenya.bean.ContentCategoryExample;
import com.kenya.bean.ContentCategoryExample.Criteria;
import com.kenya.dao.ContentCategoryMapper;
import com.kenya.service.ContentCategoryService;
import com.kenya.until.EUTreeNode;
import com.kenya.until.KYResult;

/*import com.taotao.mapper.TbContentCategoryMapper;
import com.taotao.pojo.EUTreeNode;
import com.taotao.pojo.TbContentCategory;
import com.taotao.pojo.TbContentCategoryExample;
import com.taotao.pojo.TbContentCategoryExample.Criteria;
import com.taotao.service.ContentCategoryService;
import com.taotao.utils.TaotaoResult;
*/
@Service
public class ContentCategoryServiceImpl implements ContentCategoryService{
	@Autowired 
	private ContentCategoryMapper contentCategoryMapper;
	@Override
	public List<EUTreeNode> getCategoryList(long parentId) {
		ContentCategoryExample example = new ContentCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		
		List<ContentCategory> list = contentCategoryMapper.selectByExample(example);

		List <EUTreeNode>resultList =new ArrayList<>();
	
		for (ContentCategory tbContentCategory : list) {
			EUTreeNode node = new EUTreeNode();
			node.setId(tbContentCategory.getId());
			node.setText(tbContentCategory.getName());
		
			node.setState(tbContentCategory.getIsParent()?"closed":"open");
			resultList.add(node);
			
		}
		return resultList;
	}

	
	
	  @Override
	  public KYResult insertContentCatgory(long parentId, String name) {
		// TODO Auto-generated method stub
		ContentCategory contentCategory = new ContentCategory();
		contentCategory.setName(name);
		contentCategory.setIsParent(false);
		contentCategory .setStatus(1);
		contentCategory.setParentId(parentId);
		contentCategory.setSortOrder(1);
		contentCategory.setCreated(new Date());
		contentCategory.setUpdated(new Date());
		
		contentCategoryMapper.insert(contentCategory);
		ContentCategory paCategory = contentCategoryMapper.selectByPrimaryKey(parentId);
		if (!paCategory.getIsParent()){
			paCategory.setIsParent(true);
			contentCategoryMapper.updateByPrimaryKey(paCategory);
		}
		 
		return KYResult.ok(contentCategory);
	}
	@Override
	public KYResult deleteContentCatgory(long parentId,long Id) {
		//ContentCategory contentCategory = new ContentCategory();
		//contentCategory.setName(name);
		/*contentCategory.setId(id);
		contentCategory.setIsParent(false);
		contentCategory .setStatus(1);
		contentCategory.setParentId(parentId);
		contentCategory.setSortOrder(1);
		contentCategory.setCreated(new Date());
		contentCategory.setUpdated(new Date());*/
		int result = contentCategoryMapper.deleteByPrimaryKey(Id);
		ContentCategory category = contentCategoryMapper.selectByPrimaryKey(parentId);
		long o = contentCategoryMapper.queryCount(parentId);
		if (category.getIsParent()&&contentCategoryMapper.queryCount(parentId)==0){
			category.setIsParent(false);
			contentCategoryMapper.updateByPrimaryKey(category);
		}
		// TODO Auto-generated method stub
		return KYResult.ok();
	}
	@Override
	public KYResult deleteContentCatgoryById(Long id) {
		 int i = contentCategoryMapper.deleteByPrimaryKey(id);
		// TODO Auto-generated method stub
		return KYResult.ok();
	}
	@Override
	public KYResult updateContentCatgory(long id, String name) {
		ContentCategory contentCategory = new ContentCategory();
		ContentCategory selectByPrimaryKe = contentCategoryMapper.selectByPrimaryKey(id);
		//contentCategory.setId(id);
	   // contentCategory.setName(name);
		selectByPrimaryKe.setName(name);
		
		contentCategoryMapper.updateByPrimaryKey(selectByPrimaryKe);
		return KYResult.ok(contentCategory);
	}
	
	

}
