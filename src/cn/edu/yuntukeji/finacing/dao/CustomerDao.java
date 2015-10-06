package cn.edu.yuntukeji.finacing.dao;

import java.util.List;

import cn.edu.yuntukeji.common.dao.BaseDao;
import cn.edu.yuntukeji.finacing.pojos.Customer;
import cn.edu.yuntukeji.finacing.vo.CustomerTradeStatistics;

public interface CustomerDao extends BaseDao<Customer, Integer>{
	public List<CustomerTradeStatistics> queryTradeGroupByQuater(int quarter);
}
