package cn.edu.yuntukeji.finacing.service;

import cn.edu.yuntukeji.common.service.BaseServiceImpl;
import cn.edu.yuntukeji.finacing.dao.hibernate.UserDaoHib;
import cn.edu.yuntukeji.finacing.pojos.User;

public class UserServiceImpl extends BaseServiceImpl<User, String>{
	
	//private PurchaseMasterDao purchaseMasterDao ;
	public UserServiceImpl() {
		this.dao = new UserDaoHib();
		//purchaseMasterDao = (PurchaseMasterDao) new ProductServiceImpl();
	}

	public boolean login(String name,String password){
		return ((UserDaoHib) dao).Login(name,password);
	}
	
	
}
