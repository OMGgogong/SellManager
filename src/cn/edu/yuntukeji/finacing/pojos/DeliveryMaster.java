package cn.edu.yuntukeji.finacing.pojos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "delivery_master")
public class DeliveryMaster implements Serializable{
private Integer deliveryId;
private Integer  deliveryProperty = 1;
private Date deliveryDate;
private Customer customerId;
private SalesMan salesManId;
private String deliveryAddress;
private Integer subTotal;



public DeliveryMaster() {
}
public DeliveryMaster(Integer deliveryId, Integer deliveryProperty, Customer customerId, SalesMan salesManId,
		String deliveryAddress, Integer subTotal) {
	this.deliveryId = deliveryId;
	this.deliveryProperty = deliveryProperty;
	this.customerId = customerId;
	this.salesManId = salesManId;
	this.deliveryAddress = deliveryAddress;
	this.subTotal = subTotal;
}
@Id
@GenericGenerator(name = "generator", strategy = "increment")
@Column(name="delivery_id")
public Integer getDeliveryId() {
	return deliveryId;
}
public void setDeliveryId(Integer deliveryId) {
	this.deliveryId = deliveryId;
}
@Column(name ="delivery_property")
public Integer getDeliveryProperty() {
	return deliveryProperty;
}
public void setDeliveryProperty(Integer deliveryProperty) {
	this.deliveryProperty = deliveryProperty;
}
@ManyToOne()
@JoinColumn(name = "customer_id")
public Customer getCustomerId() {
	return customerId;
}
public void setCustomerId(Customer customerId) {
	this.customerId = customerId;
}
@ManyToOne()
@JoinColumn(name = "sales_man_id")
public SalesMan getSalesManId() {
	return salesManId;
}
public void setSalesManId(SalesMan salesManId) {
	this.salesManId = salesManId;
}
@Column(name="delivery_address",length=128)
public String getDeliveryAddress() {
	return deliveryAddress;
}
public void setDeliveryAddress(String deliveryAddress) {
	this.deliveryAddress = deliveryAddress;
}
@Column(name="sub_total")
public Integer getSubTotal() {
	return subTotal;
}
public void setSubTotal(Integer subTotal) {
	this.subTotal = subTotal;
}
@Temporal(TemporalType.TIMESTAMP)
@Column(name="delivery_date")
public Date getDeliveryDate() {
	return deliveryDate;
}
public void setDeliveryDate(Date deliveryDate) {
	this.deliveryDate = deliveryDate;
}

}
