package cn.edu.yuntukeji.common.dao;

import java.util.List;

public interface BaseDao<T,ID> {
	/**
	 * 新增一条记录
	 * @param entity
	 */
	void save(T entity);
/**
 * 删除制定id的记录
 * @param id
 */
	void removeById(ID id);
/**
 * 删除一条记录
 * @param entity
 */
	void remove(T entity);
/**
 * 修改一条记录
 * @param entity
 */
	void update(T entity);

	/**
	 * 得到数据关闭数据连接
	 * @param id
	 * @return
	 */
	T get(ID id);

	/**
	 * 得到数据不关闭数据连接
	 * 
	 * @param id
	 * @return
	 * @throws NoRecordFoundException
	 */
	T load(ID id);

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	List<T> query();

}
