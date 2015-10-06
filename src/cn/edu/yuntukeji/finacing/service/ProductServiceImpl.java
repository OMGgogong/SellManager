package cn.edu.yuntukeji.finacing.service;

import java.util.List;

import cn.edu.yuntukeji.common.service.BaseServiceImpl;
import cn.edu.yuntukeji.finacing.dao.hibernate.ProductDaoHib;
import cn.edu.yuntukeji.finacing.pojos.Product;

public class ProductServiceImpl extends BaseServiceImpl<Product, Integer>{
	
	//private PurchaseMasterDao purchaseMasterDao ;
	public ProductServiceImpl() {
		this.dao = new ProductDaoHib();
		//purchaseMasterDao = (PurchaseMasterDao) new ProductServiceImpl();
	}

	public Product queryProductByProductName(String name){
		return ((ProductDaoHib) dao).queryProductByProductName(name);
	}
	
	
}
