package cn.edu.yuntukeji.finacing.dao.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.yuntukeji.common.dao.BaseDaoHib;
import cn.edu.yuntukeji.finacing.dao.ProductDao;
import cn.edu.yuntukeji.finacing.pojos.Product;

public class ProductDaoHib extends BaseDaoHib<Product, Integer> implements ProductDao{

	public Product queryProductByProductName(String name) {

		Product re = new Product();
		String sql = "from Product where productName =:NAME";
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		Query query =  s.createQuery(sql);
		query.setString("NAME", name);
		if(query.list().size()>0){
		re = (Product) query.list().get(0);
		}
		transaction.commit();
		return re;
	}

}
