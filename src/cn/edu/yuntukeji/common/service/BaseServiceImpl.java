package cn.edu.yuntukeji.common.service;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import cn.edu.yuntukeji.common.dao.BaseDao;
import cn.edu.yuntukeji.common.dao.BaseDaoHib;




public abstract class BaseServiceImpl<T, ID>
		implements BaseService<T, ID> {

	public BaseDao<T, ID> dao;

	private Class<T> clazz;
	@SuppressWarnings("unchecked")
	public BaseServiceImpl(){
		this.clazz = (Class<T>)((ParameterizedType)getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}
	@Override
	public T findById(ID id) {
		return dao.get(id);
	}
	
	@Override
	public List<T> findAll(){
		return dao.query();
	}

	
	@Override
	public void removeById(ID id) {
		dao.removeById(id);
	}
	
	@Override
	public void remove(T entity){
		dao.remove(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void removeMultiRecords(String ids) {
		if(!StringUtils.isNotEmpty(ids)){
			return ;
		}
		
		ID[] idArr = convertIdsToArray(ids);

		for (int i = 0; i < idArr.length; i++) {
			dao.removeById(idArr[i]);
		}
	}
	
	protected  ID[] convertIdsToArray(String ids){
		return null;
	}
	
	
	@Override
	public void save(T entity) {
		dao.save(entity);
	}
	
	protected Integer convertIdsToInt(String id){
		return Integer.parseInt(id);
	}
	@Override
	public void update(T entity) {
		dao.update(entity);
	}
	

  
	
}
