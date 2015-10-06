package cn.edu.yuntukeji.finacing.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.yuntukeji.common.dao.BaseDaoHib;
import cn.edu.yuntukeji.finacing.dao.PurchaseMasterDao;
import cn.edu.yuntukeji.finacing.pojos.PurchaseMaster;
import cn.edu.yuntukeji.finacing.vo.PurchaseVo;

public class PurchaseMasterDaoHib extends BaseDaoHib<PurchaseMaster, Integer> implements PurchaseMasterDao{

	@Override
	public List<PurchaseVo> findAllPurchase() {
		List<PurchaseVo> re = new ArrayList<>();
		//String sql = "select pm.purchaseId,pm.purchaseDate,s.supplierSimpleName,sum(pd.purchaseAmount),pm.purchaseProperty from PurchaseMaster as pm ,Supplier as s,PurchaseDetail as pd where pm.supplierId = s.supplierId and pd.purchaseId = pm.purchaseId";
		String sql = "select new cn.edu.yuntukeji.finacing.vo.PurchaseVo(pm.purchaseId,pm.purchaseDate,s.supplierSimpleName,pd.purchaseAmount,pm.purchaseProperty) from PurchaseMaster as pm ,Supplier as s,PurchaseDetail as pd where pm.supplierId = s.supplierId and pd.purchaseId = pm.purchaseId";
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		Query query =  s.createQuery(sql);
		re = query.list();
		transaction.commit();
		return re;
		
	}
	
public List<PurchaseMaster> queryGodownProduct() {
	List<PurchaseMaster> re = new ArrayList<>();
	String sql = "from PurchaseMaster where purchaseProperty = -1";
	Session s = currentSession();
	Transaction transaction = s.beginTransaction();
	Query query =  s.createQuery(sql);
	re = query.list();
	transaction.commit();
	return re;
	}
public List<PurchaseMaster> queryUngodownProduct() {
	List<PurchaseMaster> re = new ArrayList<>();
	String sql = "from PurchaseMaster where purchaseProperty = 1";
	Session s = currentSession();
	Transaction transaction = s.beginTransaction();
	Query query =  s.createQuery(sql);
	re = query.list();
	transaction.commit();
	return re;
	}
}
