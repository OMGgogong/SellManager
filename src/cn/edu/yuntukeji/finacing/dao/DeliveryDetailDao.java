package cn.edu.yuntukeji.finacing.dao;

import java.util.List;

import cn.edu.yuntukeji.common.dao.BaseDao;
import cn.edu.yuntukeji.finacing.pojos.DeliveryDetail;
import cn.edu.yuntukeji.finacing.pojos.PurchaseDetail;

public interface DeliveryDetailDao extends BaseDao<DeliveryDetail, Integer>{
	public List<DeliveryDetail> findDeliveryDetailBydeliveryId(int deliveryId);
	public void saveDeliveryDetailAndUpdateProduct(DeliveryDetail entity);
}
