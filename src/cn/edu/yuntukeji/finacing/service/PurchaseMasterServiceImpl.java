package cn.edu.yuntukeji.finacing.service;

import java.util.List;

import cn.edu.yuntukeji.common.service.BaseServiceImpl;
import cn.edu.yuntukeji.finacing.dao.hibernate.PurchaseMasterDaoHib;
import cn.edu.yuntukeji.finacing.pojos.PurchaseMaster;
import cn.edu.yuntukeji.finacing.vo.PurchaseVo;

public class PurchaseMasterServiceImpl extends BaseServiceImpl<PurchaseMaster, Integer>{

	
	public PurchaseMasterServiceImpl() {
		this.dao = new PurchaseMasterDaoHib();
	}
	
	public List<PurchaseVo> queryAllPurchase(){
		
		return ((PurchaseMasterDaoHib) dao).findAllPurchase();
	}
public List<PurchaseMaster> queryGodownProduct(){
		
		return ((PurchaseMasterDaoHib) dao).queryGodownProduct();
	}
	
public List<PurchaseMaster> queryUngodownProduct(){
	
	return ((PurchaseMasterDaoHib) dao).queryUngodownProduct();
}

}
