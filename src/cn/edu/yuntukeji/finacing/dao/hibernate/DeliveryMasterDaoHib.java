package cn.edu.yuntukeji.finacing.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.yuntukeji.common.dao.BaseDaoHib;
import cn.edu.yuntukeji.finacing.dao.DeliveryMasterDao;
import cn.edu.yuntukeji.finacing.pojos.DeliveryMaster;
import cn.edu.yuntukeji.finacing.pojos.PurchaseMaster;

public class DeliveryMasterDaoHib extends BaseDaoHib<DeliveryMaster, Integer> implements DeliveryMasterDao{
	
	
	public List<DeliveryMaster> queryGodownProduct() {
		List<DeliveryMaster> re = new ArrayList<>();
		String sql = "from DeliveryMaster where deliveryProperty = -1";
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		Query query =  s.createQuery(sql);
		re = query.list();
		transaction.commit();
		return re;
		}
	public List<DeliveryMaster> queryUngodownProduct() {
		List<DeliveryMaster> re = new ArrayList<>();
		String sql = "from DeliveryMaster where deliveryProperty = 1";
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		Query query =  s.createQuery(sql);
		re = query.list();
		transaction.commit();
		return re;
		}
	
}
