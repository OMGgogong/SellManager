package cn.edu.yuntukeji.finacing.dao;

import java.util.List;

import cn.edu.yuntukeji.common.dao.BaseDao;
import cn.edu.yuntukeji.finacing.pojos.Product;

public interface ProductDao extends BaseDao<Product, Integer>{
	public Product queryProductByProductName(String name);
}
