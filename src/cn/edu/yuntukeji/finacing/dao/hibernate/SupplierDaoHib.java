package cn.edu.yuntukeji.finacing.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.yuntukeji.common.dao.BaseDaoHib;
import cn.edu.yuntukeji.finacing.dao.SupplierDao;
import cn.edu.yuntukeji.finacing.pojos.Supplier;
import cn.edu.yuntukeji.finacing.vo.PurchaseVo;
import cn.edu.yuntukeji.finacing.vo.TradeStatistics;

public class SupplierDaoHib extends BaseDaoHib<Supplier, Integer> implements SupplierDao{
	public List<TradeStatistics> queryTradesGroupQuarterById(int id,int quarter){
		int i = (quarter-1)*3+1;
		List<TradeStatistics> re = new ArrayList<>();
		String sql = "select new cn.edu.yuntukeji.finacing.vo.TradeStatistics(s.supplierId,s.supplierSimpleName,p.productName,SUM(pd.purchaseQuantity),SUM(pd.purchaseAmount)) from Product as p ,PurchaseDetail as pd,"
				+ "PurchaseMaster as pm , Supplier as s where "
				+ "p.productId = pd.productId and pd.purchaseId "
				+ "= pm.purchaseId and s.supplierId = pm.supplierId"
				+ " and MONTH(pm.purchaseDate) >:MIN and MONTH(pm.purchaseDate) <:MAX and s.supplierId = :ID group by p.productId";
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		System.out.println("cccc");
		Query query =  s.createQuery(sql);
		query.setInteger("MIN", i);
		query.setInteger("MAX", i+3);
		query.setInteger("ID", id);
		re = query.list();
		transaction.commit();
		return re;
	}
	
	public List<TradeStatistics> queryTradesGroupQuarterBySimpleName(String simpleName,int quarter){
		List<TradeStatistics> re = new ArrayList<>();
		int i = (quarter-1)*3+1;
		String sql = "select new cn.edu.yuntukeji.finacing.vo.TradeStatistics(s.supplierId,s.supplierSimpleName,p.productName,SUM(pd.purchaseQuantity),SUM(pd.purchaseAmount)) from Product as p ,PurchaseDetail as pd,"
				+ "PurchaseMaster as pm , Supplier as s where "
				+ "p.productId = pd.productId and pd.purchaseId "
				+ "= pm.purchaseId and s.supplierId = pm.supplierId"
				+ " and MONTH(pm.purchaseDate) >:MIN and MONTH(pm.purchaseDate) <:MAX and s.supplierSimpleName = :SIMPLENAME group by p.productId";
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		System.out.println("cccc");
		Query query =  s.createQuery(sql);
		query.setInteger("MIN", i);
		query.setInteger("MAX", i+3);
		query.setString("SIMPLENAME", simpleName);
		re = query.list();
		transaction.commit();
		return re;
	}
}
