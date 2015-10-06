package cn.edu.yuntukeji.finacing.dao;

import java.util.List;

import cn.edu.yuntukeji.common.dao.BaseDao;
import cn.edu.yuntukeji.finacing.pojos.PurchaseMaster;
import cn.edu.yuntukeji.finacing.vo.PurchaseVo;

public interface PurchaseMasterDao extends BaseDao<PurchaseMaster, Integer>{
	public List<PurchaseVo> findAllPurchase();
	public List<PurchaseMaster> queryGodownProduct();
	public List<PurchaseMaster> queryUngodownProduct();
}
