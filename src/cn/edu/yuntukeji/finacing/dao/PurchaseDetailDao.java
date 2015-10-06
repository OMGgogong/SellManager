package cn.edu.yuntukeji.finacing.dao;

import java.util.List;

import cn.edu.yuntukeji.common.dao.BaseDao;
import cn.edu.yuntukeji.finacing.pojos.PurchaseDetail;
import cn.edu.yuntukeji.finacing.vo.PurchaseProductVo;

public interface PurchaseDetailDao extends BaseDao<PurchaseDetail, Integer>{
	public List<PurchaseDetail> findPurchaseDetailByPurchaseId(int purchaseId);
	public List<PurchaseProductVo> countPurchaseDetailLimitByDate(String min, String max);
	public void savePurchaseDetailAndUpdateProduct(PurchaseDetail entity);
}
