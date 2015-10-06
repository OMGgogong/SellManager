package cn.edu.yuntukeji.finacing.service;

import java.util.List;

import cn.edu.yuntukeji.common.service.BaseServiceImpl;
import cn.edu.yuntukeji.finacing.dao.hibernate.SupplierDaoHib;
import cn.edu.yuntukeji.finacing.pojos.Supplier;
import cn.edu.yuntukeji.finacing.vo.TradeStatistics;

public class SupplierServiceImpl extends BaseServiceImpl<Supplier, Integer>{

	
	public SupplierServiceImpl() {
		this.dao = new SupplierDaoHib();
	}
	/**统计供应商交易
	 * 以季度分组并按照编号查询
	 * @param id 编号
	 * @param quarter 季度
	 * @return
	 */
	public List<TradeStatistics> queryTradesGroupQuarterById(int id,int quarter){
		return (((SupplierDaoHib) dao).queryTradesGroupQuarterById(id,quarter));
	}
	/**统计供应商交易
	 * 以季度分组并按照供应商简称查询
	 * @param simpleName 简称
	 * @param quarter 季度
	 * @return
	 */
	public List<TradeStatistics> queryTradesGroupQuarterBySimpleName(String simpleName,int quarter){
		return (((SupplierDaoHib) dao).queryTradesGroupQuarterBySimpleName(simpleName,quarter));
	}
	
}
