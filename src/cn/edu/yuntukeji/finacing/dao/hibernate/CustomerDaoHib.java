package cn.edu.yuntukeji.finacing.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.yuntukeji.common.dao.BaseDaoHib;
import cn.edu.yuntukeji.finacing.dao.CustomerDao;
import cn.edu.yuntukeji.finacing.pojos.Customer;
import cn.edu.yuntukeji.finacing.vo.CustomerTradeStatistics;
import cn.edu.yuntukeji.finacing.vo.TradeStatistics;

public class CustomerDaoHib extends BaseDaoHib<Customer, Integer> implements CustomerDao{
	public List<CustomerTradeStatistics> queryTradeGroupByQuater(int quarter){
		int i = (quarter-1)*3+1;
		List<CustomerTradeStatistics> re = new ArrayList<>();
		String sql = "select new cn.edu.yuntukeji.finacing.vo.CustomerTradeStatistics(c.id,c.customerSimpleName,SUM(dd.salesAmount) ) from Customer as c, DeliveryDetail as dd , DeliveryMaster as dm "
				+ "where "
				+ "c.id = dm.customerId and  "
				+ "dm.deliveryId = dd.deliveryId"
				+ " and MONTH(dm.deliveryDate) >=:MIN and MONTH(dm.deliveryDate) <:MAX group by c.id";
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		Query query =  s.createQuery(sql);
		query.setInteger("MIN", i);
		query.setInteger("MAX", i+3);
		query.setFirstResult(0);
		query.setMaxResults(10);
		re = query.list();
		transaction.commit();
		return re;
		
	}
}
