package com.kenya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenya.bean.Funds;
import com.kenya.bean.FundsExample;
import com.kenya.bean.FundsExample.Criteria;
import com.kenya.dao.FundsMapper;
import com.kenya.service.FundsService;
@Service
public class FundsServiceImpl implements FundsService {

	@Autowired
	FundsMapper fundsDao;
	/**
	 * 资金找项目
	 */
	public List<Funds> Selectbyfile(String fundsName) {
		if(fundsName!=null&&!fundsName.equals("")) {
			FundsExample example = new FundsExample();
			Criteria criteria = example.createCriteria();
			criteria.andFundsnameLike("%"+fundsName+"%");
			System.out.println(criteria.getAllCriteria());
			return fundsDao.selectByExample(example);
		}else {
			System.out.println(fundsName);
			return fundsDao.selectByExample(null);
		}
	}

	public int insertfunds(Funds funds) {
		return fundsDao.insert(funds);
	}
	
	public String IsNull(Funds funds) {
		if(funds.getFundsimgs()==null) {
			return"非法访问";
		}
		if(funds.getFundsname()==null) {
			return"非法访问";
		}
		if(funds.getFundsdesc()==null) {
			return "非法访问";
		}
		if(funds.getFundsphone()==null) {
			return "非法访问";
		}
		if(funds.getAdminid()==null) {
			return "非法访问";
		}
		if(funds.getFundsprice()==null) {
			return "非法访问";
		}
		return "";
	}

}
