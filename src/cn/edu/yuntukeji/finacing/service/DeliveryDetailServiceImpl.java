package cn.edu.yuntukeji.finacing.service;

import java.util.List;

import cn.edu.yuntukeji.common.service.BaseServiceImpl;
import cn.edu.yuntukeji.finacing.dao.hibernate.DeliveryDetailDaoHib;
import cn.edu.yuntukeji.finacing.pojos.DeliveryDetail;
import cn.edu.yuntukeji.finacing.pojos.PurchaseDetail;

public class DeliveryDetailServiceImpl extends BaseServiceImpl<DeliveryDetail, Integer>{

	
	public DeliveryDetailServiceImpl() {
		this.dao = new DeliveryDetailDaoHib();
	}
	public List<DeliveryDetail> findDeliveryDetailBydeliveryId(int deliveryId){
		return ((DeliveryDetailDaoHib) dao).findDeliveryDetailBydeliveryId(deliveryId);
	}
	@Override
	public void save(DeliveryDetail entity) {
		// TODO Auto-generated method stub
		((DeliveryDetailDaoHib) dao).saveDeliveryDetailAndUpdateProduct(entity);
	}
}
