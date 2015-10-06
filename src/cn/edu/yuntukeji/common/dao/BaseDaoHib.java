package cn.edu.yuntukeji.common.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class BaseDaoHib<T, ID extends Serializable> implements BaseDao<T, ID> {


	private static final int MAX_NUM_OF_RESULTS = 200;
	private Class<T> clazz;
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public BaseDaoHib() {
		Configuration configuration = new AnnotationConfiguration();
		//configuration.configure("/hibernate.cfg.xml");
		configuration.configure("/mysqlhibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
		this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	protected Session currentSession() {
		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		return s;
	}

	@Override
	public void save(T entity) {
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
         s.save(entity); 
         transaction.commit();
  
	}

	@Override
	public void removeById(ID id) {
		
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		
		T entity = load(id);
		//System.out.println(id+","+entity);
		s.delete(entity);
		//System.out.println("cxx"+id);
		  transaction.commit();
	}

	@Override
	public void remove(T entity) {
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		s.delete(entity);
		  transaction.commit();
	}

	@Override
	public void update(T entity) {
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		s.update(entity);
		transaction.commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> query() {
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		Criteria criteria = s.createCriteria(clazz);
		criteria.setMaxResults(MAX_NUM_OF_RESULTS);
		List<T> re = (List<T>) criteria.list();
		transaction.commit();
		return re;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(ID id) {
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		T re = (T) currentSession().get(clazz, id);
		transaction.commit();
		return re;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T load(ID id) {
		
		Session s = currentSession();
		Transaction transaction = s.beginTransaction();
		T re = (T) currentSession().load(clazz, id);
		return re;
	}

}
