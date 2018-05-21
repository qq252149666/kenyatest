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
			return fundsDao.selectByExample(example);
		}else {
			return fundsDao.selectByExample(null);
		}
	}

	public int insertfunds(Funds funds) {
		return fundsDao.insert(funds);
	}
	
	public String IsNull(Funds funds) {
		if(funds.getFundsimgs()==null) {
			System.out.println(0);
			return"非法访问";
		}
		if(funds.getFundsname()==null) {
			System.out.println(1);
			return"非法访问";
		}
		if(funds.getFundsdesc()==null) {
			System.out.println(2);
			return "非法访问";
		}
		if(funds.getFundsphone()==null) {
			System.out.println(3);
			return "非法访问";
		}
		if(funds.getAdminid()==null) {
			System.out.println(4);
			return "非法访问";
		}
		if(funds.getFundsprice()==null) {
			System.out.println(5);
			return "非法访问";
		}
		return "";
	}

	public int delete(int id) {
		return fundsDao.deleteByPrimaryKey(id);
	}

	public Funds selectById(int id) {
		return fundsDao.selectByPrimaryKey(id);
	}

	@Override
	public int updatefunds(Funds funds) {
		return fundsDao.updateByPrimaryKey(funds);
	}

}
