package cn.edu.yuntukeji.finacing.dao;

import java.util.List;

import cn.edu.yuntukeji.common.dao.BaseDao;
import cn.edu.yuntukeji.finacing.pojos.DeliveryMaster;
import cn.edu.yuntukeji.finacing.pojos.PurchaseMaster;

public interface DeliveryMasterDao extends BaseDao<DeliveryMaster, Integer>{
	public List<DeliveryMaster> queryGodownProduct();
	public List<DeliveryMaster> queryUngodownProduct();
}
