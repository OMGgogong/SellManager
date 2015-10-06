package cn.edu.yuntukeji.finacing.dao;

import cn.edu.yuntukeji.common.dao.BaseDao;
import cn.edu.yuntukeji.finacing.pojos.User;

public interface UserDao extends BaseDao<User, String>{
	public boolean Login(String name, String password);
}
