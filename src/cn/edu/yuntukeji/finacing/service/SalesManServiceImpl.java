package cn.edu.yuntukeji.finacing.service;

import cn.edu.yuntukeji.common.service.BaseServiceImpl;
import cn.edu.yuntukeji.finacing.dao.hibernate.SalesManDaoHib;
import cn.edu.yuntukeji.finacing.pojos.SalesMan;

public class SalesManServiceImpl extends BaseServiceImpl<SalesMan, Integer>{

	
	public SalesManServiceImpl() {
		this.dao = new SalesManDaoHib();
	}
	
	public void other(int jidu,String name){
		System.out.println(jidu+name);
	}
}
