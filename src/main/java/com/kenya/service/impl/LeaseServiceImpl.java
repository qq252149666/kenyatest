package com.kenya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.Lease;
import com.kenya.bean.LeaseExample;
import com.kenya.bean.LeaseExample.Criteria;
import com.kenya.dao.LeaseMapper;
import com.kenya.service.LeaseService;

@Service
public class LeaseServiceImpl implements LeaseService{

	@Autowired
	LeaseMapper leasedao;
	
	/**
	 *	查询符合条件的记录
	 */
	public List<Lease> selectByFild(String leaseName) {
		if(leaseName!=null&&!leaseName.equals("")) {
        	LeaseExample example = new LeaseExample();
        	Criteria criteria = example.createCriteria();
        	criteria.andLeasenameLike(leaseName);
        	return leasedao.selectByExample(example);
        }else {
        	return leasedao.selectByExample(null);
        }
	}
	/**
	 * 添加记录
	 * 
	 */
	public int insert(Lease lease){
		return leasedao.insert(lease);
	}

	/**
	 * 验证非空
	 */
	public String IsNull(Lease lease) {
		if(lease.getLeaseaddress()==null) {
			return "非法访问";
		}
		if(lease.getLeasename()==null) {
			return "非法访问";
		}
		if(lease.getLeasedesc()==null) {
			return "非法访问";
		}
		if(lease.getLeasephone()==null) {
			return "非法访问";
		}
		if(lease.getLeaseprice()==null) {
			return "非法访问";
		}
		if(lease.getLeasesquare()==null){
			return "非法访问";
		}
		if(lease.getLeaseimgs()==null) {
			return "非法访问";
		}
		if(lease.getUserid()==null) {
			return "非法访问";
		}
		return "";
	}

	public int delete(int leaseid) {
		return leasedao.deleteByPrimaryKey(leaseid);
	}
	public List<Lease> selectByUserId(int userid) {
		LeaseExample example = new LeaseExample();
    	Criteria criteria = example.createCriteria();
    	criteria.andUseridEqualTo(userid);
    	return leasedao.selectByExample(example);
	}
	public Lease selectById(int id) {
		// TODO Auto-generated method stub
		LeaseExample example = new LeaseExample();
    	Criteria criteria = example.createCriteria();
    	criteria.andLeaseidEqualTo(id);
    	return leasedao.selectByExample(example).get(0);
	}


	
}
