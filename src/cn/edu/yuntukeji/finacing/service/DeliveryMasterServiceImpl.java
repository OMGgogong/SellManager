package cn.edu.yuntukeji.finacing.service;

import java.util.List;

import cn.edu.yuntukeji.common.service.BaseServiceImpl;
import cn.edu.yuntukeji.finacing.dao.hibernate.DeliveryMasterDaoHib;
import cn.edu.yuntukeji.finacing.dao.hibernate.PurchaseMasterDaoHib;
import cn.edu.yuntukeji.finacing.pojos.DeliveryMaster;
import cn.edu.yuntukeji.finacing.pojos.PurchaseMaster;

public class DeliveryMasterServiceImpl extends BaseServiceImpl<DeliveryMaster, Integer>{

	
	public DeliveryMasterServiceImpl() {
		this.dao = new DeliveryMasterDaoHib();
	}
	
public List<DeliveryMaster> queryGodownProduct(){
		
		return ((DeliveryMasterDaoHib) dao).queryGodownProduct();
	}
	
public List<DeliveryMaster> queryUngodownProduct(){
	
	return ((DeliveryMasterDaoHib) dao).queryUngodownProduct();
}
}
