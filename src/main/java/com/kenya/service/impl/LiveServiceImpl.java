package com.kenya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.Live;
import com.kenya.bean.LiveExample;
import com.kenya.bean.LiveExample.Criteria;
import com.kenya.dao.LiveMapper;
import com.kenya.service.LiveService;
@Service
public class LiveServiceImpl implements LiveService{
	
	
	
	@Autowired
	LiveMapper livedao;

	public List<Live> selectByType(String liveName,String liveType) {
		LiveExample example = new LiveExample();
		Criteria criteria = example.createCriteria();
		System.out.println(liveName);
		System.out.println(liveType);
		if(liveName!=null&&!liveName.equals("")) {
			criteria.andLivenameLike("%"+liveName+"%");
		}
		if(liveType!="不限"&&!(liveType.equals("不限"))) {
			System.out.println(liveType);
			criteria.andLivetypeEqualTo(liveType);
		}
		return livedao.selectByExample(example);
	}

	public int inserLive(Live live) {
		return livedao.insert(live);
	}
	public String IsNull(Live live) {
		if(live.getLivephone()==null) {
			return "非法访问";
		}
		if(live.getLivetype()==null) {
			return "非法访问";
		}
		if(live.getLiveimgs()==null) {
			return "非法访问";
		}
		if(live.getLivedesc()==null) {
			return "非法访问";
		}
		if(live.getLivename()==null) {
			return "非法访问";
		}
		if(live.getUserid()==null) {
			return "非法访问";
		}
		return "";
	}

	public int deleteLive(int liveid) {
		return livedao.deleteByPrimaryKey(liveid);
	}

	public Live selectById(int liveid) {
		return livedao.selectByPrimaryKey(liveid);
	}
	public List<Live> selectByUserId(int UserId) {
		LiveExample example = new LiveExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(UserId);
		return livedao.selectByExample(example);
	}

}
