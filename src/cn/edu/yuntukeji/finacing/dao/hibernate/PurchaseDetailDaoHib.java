package cn.edu.yuntukeji.finacing.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.yuntukeji.common.dao.BaseDaoHib;
import cn.edu.yuntukeji.finacing.dao.PurchaseDetailDao;
import cn.edu.yuntukeji.finacing.pojos.Product;
import cn.edu.yuntukeji.finacing.pojos.PurchaseDetail;
import cn.edu.yuntukeji.finacing.vo.PurchaseProductVo;

public class PurchaseDetailDaoHib extends BaseDaoHib<PurchaseDetail, Integer> implements PurchaseDetailDao{

	public List<PurchaseDetail> findPurchaseDetailByPurchaseId(int purchaseId) {

		List<PurchaseDetail> re = new ArrayList<>();
		String sql = "from PurchaseDetail where purchaseId = :PURCHASEID";
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		Query query =  s.createQuery(sql);
		query.setInteger("PURCHASEID", purchaseId);
		re = query.list();
		transaction.commit();
		return re;
	}

	public List<PurchaseProductVo> countPurchaseDetailLimitByDate(String min, String max) {
		List<PurchaseProductVo> re = new ArrayList<>();
		String sql = "select new cn.edu.yuntukeji.finacing.vo.PurchaseProductVo(p.productId,p.productName,SUM(pd.purchaseQuantity),SUM(pd.purchaseAmount)) from PurchaseDetail as pd, Product as p , PurchaseMaster as pm where"
				+ " pd.productId = p.productId and "
				+ "pd.purchaseId = pm.purchaseId and "
				+ "pm.purchaseDate between :MIN and :MAX group by p.productId";
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		Query query =  s.createQuery(sql);
		query.setString("MIN", min);
		query.setString("MAX", max);
		re = query.list();
		
		transaction.commit();
		//System.out.println(re);
		return re;
		
		
		
	}

	public void savePurchaseDetailAndUpdateProduct(PurchaseDetail entity) {
		
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		s.save(entity);
		Product p =	(Product) s.load(Product.class, entity.getProductId().getProductId());
		p.setQuantity(p.getQuantity()+entity.getPurchaseQuantity());
		if(entity.getPurchaseQuantity()>=0){
		p.setLastPurchaseDate(entity.getProductId().getLastPurchaseDate());
		}else{
		//p.setLastDeliveryDate(entity.getProductId().getLastDeliveryDate());
		}
		s.update(p);
		transaction.commit();
	}
	
}
