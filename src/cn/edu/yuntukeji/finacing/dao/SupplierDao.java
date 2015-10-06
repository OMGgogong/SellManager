package cn.edu.yuntukeji.finacing.dao;

import java.util.List;

import cn.edu.yuntukeji.common.dao.BaseDao;
import cn.edu.yuntukeji.finacing.pojos.Supplier;
import cn.edu.yuntukeji.finacing.vo.TradeStatistics;

public interface SupplierDao extends BaseDao<Supplier, Integer>{
	public List<TradeStatistics> queryTradesGroupQuarterById(int id,int quarter);
	public List<TradeStatistics> queryTradesGroupQuarterBySimpleName(String simpleName,int quarter);
}
