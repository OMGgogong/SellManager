package cn.edu.yuntukeji.finacing.service;

import cn.edu.yuntukeji.common.service.BaseServiceImpl;
import cn.edu.yuntukeji.finacing.dao.hibernate.ADaoHib;
import cn.edu.yuntukeji.finacing.pojos.A;

public class AServiceImpl extends BaseServiceImpl<A, Integer>{
public AServiceImpl() {
	this.dao = new ADaoHib();
}
}
