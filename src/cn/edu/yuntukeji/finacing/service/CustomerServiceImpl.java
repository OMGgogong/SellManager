package cn.edu.yuntukeji.finacing.service;

import java.util.List;

import cn.edu.yuntukeji.common.service.BaseServiceImpl;
import cn.edu.yuntukeji.finacing.dao.hibernate.CustomerDaoHib;
import cn.edu.yuntukeji.finacing.pojos.Customer;
import cn.edu.yuntukeji.finacing.vo.CustomerTradeStatistics;

public class CustomerServiceImpl extends BaseServiceImpl<Customer, Integer>{

	
	public CustomerServiceImpl() {
		this.dao = new CustomerDaoHib();
	}
	
	public List<CustomerTradeStatistics> queryTradeGroupByQuater(int quarter){
		return ((CustomerDaoHib) dao).queryTradeGroupByQuater(quarter);
	}
	
}
