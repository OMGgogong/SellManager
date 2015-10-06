package cn.edu.yuntukeji.finacing.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.yuntukeji.common.dao.BaseDaoHib;
import cn.edu.yuntukeji.finacing.dao.CustomerDao;
import cn.edu.yuntukeji.finacing.dao.DeliveryDetailDao;
import cn.edu.yuntukeji.finacing.pojos.Customer;
import cn.edu.yuntukeji.finacing.pojos.DeliveryDetail;
import cn.edu.yuntukeji.finacing.pojos.Product;
import cn.edu.yuntukeji.finacing.pojos.PurchaseDetail;
import cn.edu.yuntukeji.finacing.vo.PurchaseVo;

public class DeliveryDetailDaoHib extends BaseDaoHib<DeliveryDetail, Integer> implements DeliveryDetailDao{
	public List<DeliveryDetail> findDeliveryDetailBydeliveryId(int deliveryId){
		List<DeliveryDetail> re = new ArrayList<>();
		//String sql = "select pm.purchaseId,pm.purchaseDate,s.supplierSimpleName,sum(pd.purchaseAmount),pm.purchaseProperty from PurchaseMaster as pm ,Supplier as s,PurchaseDetail as pd where pm.supplierId = s.supplierId and pd.purchaseId = pm.purchaseId";
		String sql = "from DeliveryDetail where deliveryId = :DELIVERID";
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		Query query =  s.createQuery(sql);
		query.setInteger("DELIVERID", deliveryId);
		re = query.list();
		transaction.commit();
		return re;
	}
	
public void saveDeliveryDetailAndUpdateProduct(DeliveryDetail entity) {
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		s.save(entity);
		Product p =	(Product) s.load(Product.class, entity.getProductId().getProductId());
		p.setQuantity(p.getQuantity()+entity.getSalesQuantity());
		if(entity.getSalesQuantity()>=0){
		//p.setLastPurchaseDate(entity.getProductId().getLastPurchaseDate());
		}else{
		p.setLastDeliveryDate(entity.getProductId().getLastDeliveryDate());
		}
		s.update(p);
		transaction.commit();
	}
	
}
