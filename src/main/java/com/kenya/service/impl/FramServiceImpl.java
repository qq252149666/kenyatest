package com.kenya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.Fram;
import com.kenya.bean.FramExample;
import com.kenya.bean.FramExample.Criteria;
import com.kenya.dao.FramMapper;
import com.kenya.service.FramService;
@Service
public class FramServiceImpl implements FramService{

	@Autowired
	FramMapper framDao;
	public List<Fram> selectbyfile(String framType) {
		if(framType!="不限"&&!framType.equals("不限")) {
			FramExample example = new FramExample();
			Criteria criteria = example.createCriteria();
			criteria.andFramtypeEqualTo(framType);
			return framDao.selectByExample(example);
		}else {
			return framDao.selectByExample(null);
		}
	}

	public int inserFram(Fram fram) {
		return framDao.insert(fram);
	}
	/**
	 * 判断非空项是否为空
	 * @return
	 */
	public String IsNull(Fram fram) {
		if(fram.getFramname()==null) {
			return "非法访问";
		}
		if(fram.getFramphone()==null) {
			return "非法访问";
		}
		if(fram.getFramuser()==null) {
			return "非法访问";
		}
		if(fram.getFramimgs()==null) {
			return "非法访问";
		}
		if(fram.getFramtype()==null) {
			return "非法访问";
		}
		if(fram.getUserid()==null) {
			return "非法访问";
		}
		return "";
	}


	public int deleteFram(int framid) {
		return framDao.deleteByPrimaryKey(framid);
	}

	public Fram selectById(int framid) {
		// TODO Auto-generated method stub
		return framDao.selectByPrimaryKey(framid);
	}


	public List<Fram> selectByUserId(int userid) {
		FramExample example = new FramExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userid);
		return framDao.selectByExample(example);
	}

}
