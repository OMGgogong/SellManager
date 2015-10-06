package cn.edu.yuntukeji.finacing.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
@Entity
@Table(name="a")
public class A implements Serializable{
/*
 * 年龄
 */
	private Integer age;

	@Id
	@Column(name="age")
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
