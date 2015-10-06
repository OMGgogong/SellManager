/**
 * 
 */
package cn.edu.yuntukeji.common.service;

import java.io.Serializable;
import java.util.List;


public interface BaseService<T , ID > {
	

	
	/**
	 * 保存实体
	 * 
	 * @param entity
	 * @return
	 */
	public void save(T entity);
	/**
	 * 查询全部
	 * 
	 * @param 
	 * @return list
	 */
	public List<T> findAll();
	/**
	 * 根据ID删除实体对象
	 * 
	 * @param id
	 */
	public void removeById(ID id);
	
	public void remove(T entity);

	/**
	 * 删除多条记录
	 * 
	 * @param ids
	 *    
	 */
	public void removeMultiRecords(String ids);

	/**
	 * 修改实体对象
	 * 
	 * @param entity
	 */
	public void update(T entity);

	/**
	 * 根据ID获取唯一对象
	 * 
	 * @param id
	 * @return
	 */
	public T findById(ID id);
	
	
	
}