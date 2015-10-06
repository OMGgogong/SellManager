package cn.edu.yuntukeji.finacing.pojos;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="delivery_detail")
public class DeliveryDetail implements Serializable{
private Integer deliveryDetailId;
private DeliveryMaster deliveryId;
private Product productId;
private Float salesQuantity  = 0.0f;
private Float salesUnitPrice = 0.0f;
private Float salesAmount = 0.0f;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="delivery_detail_id")
public Integer getDeliveryDetailId() {
	return deliveryDetailId;
}
public void setDeliveryDetailId(Integer deliveryDetailId) {
	this.deliveryDetailId = deliveryDetailId;
}
@ManyToOne(cascade=CascadeType.REMOVE)
@JoinColumn(name="delivery_id")
public DeliveryMaster getDeliveryId() {
	return deliveryId;
}
public void setDeliveryId(DeliveryMaster deliveryId) {
	this.deliveryId = deliveryId;
}
@ManyToOne
@JoinColumn(name="product_id")
public Product getProductId() {
	return productId;
}
public void setProductId(Product productId) {
	this.productId = productId;
}
@Column(name="sales_quantity")
public Float getSalesQuantity() {
	return salesQuantity;
}
public void setSalesQuantity(Float salesQuantity) {
	this.salesQuantity = salesQuantity;
}
@Column(name="sales_unit_price")
public Float getSalesUnitPrice() {
	return salesUnitPrice;
}
public void setSalesUnitPrice(Float salesUnitPrice) {
	this.salesUnitPrice = salesUnitPrice;
}
@Column(name="sales_amount")
public Float getSalesAmount() {
	return salesAmount;
}
public void setSalesAmount(Float salesAmount) {
	this.salesAmount = salesAmount;
}



}
