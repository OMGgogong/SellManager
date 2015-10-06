package cn.edu.yuntukeji.finacing.service;

import java.util.List;

import cn.edu.yuntukeji.common.service.BaseServiceImpl;
import cn.edu.yuntukeji.finacing.dao.PurchaseDetailDao;
import cn.edu.yuntukeji.finacing.dao.hibernate.PurchaseDetailDaoHib;
import cn.edu.yuntukeji.finacing.pojos.PurchaseDetail;
import cn.edu.yuntukeji.finacing.vo.PurchaseProductVo;

public class PurchaseDetailServiceImpl extends BaseServiceImpl<PurchaseDetail, Integer>{

	
	public PurchaseDetailServiceImpl() {
		this.dao = new PurchaseDetailDaoHib();
	}
	
	public List<PurchaseDetail>findPurchaseDetailByPurchaseId(int purchaseId){
		return ((PurchaseDetailDaoHib) dao).findPurchaseDetailByPurchaseId(purchaseId);
	}
	public List<PurchaseProductVo> countPurchaseDetailLimitByDate(String min,String max){
		return ((PurchaseDetailDaoHib) dao).countPurchaseDetailLimitByDate(min, max);
	}
	
	@Override
	public void save(PurchaseDetail entity) {
		((PurchaseDetailDaoHib) dao).savePurchaseDetailAndUpdateProduct(entity);
	}
}
