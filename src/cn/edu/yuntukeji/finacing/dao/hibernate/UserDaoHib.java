package cn.edu.yuntukeji.finacing.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.yuntukeji.common.dao.BaseDaoHib;
import cn.edu.yuntukeji.finacing.dao.UserDao;
import cn.edu.yuntukeji.finacing.pojos.PurchaseDetail;
import cn.edu.yuntukeji.finacing.pojos.User;

public class UserDaoHib extends BaseDaoHib<User, String> implements UserDao{

	public boolean Login(String name, String password) {
		
		
		//List<PurchaseDetail> re = new ArrayList<>();
		String sql = "from User where name = :NAME and password =:PASSWORD";
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		Query query =  s.createQuery(sql);
		query.setString("NAME", password);
		query.setString("PASSWORD", password);
		if(query.list().size()>0){
			return false;
		}
		transaction.commit();
		
		
		return true;
	}

}
