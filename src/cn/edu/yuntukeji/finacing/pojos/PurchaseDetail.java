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
@Table(name="purchase_detail")
public class PurchaseDetail implements Serializable{
private Integer purchaseDetailId;
private PurchaseMaster purchaseId;
private Product productId;
private Float purchaseQuantity = 0.0f;
private Float purchaseUnitPrice = 0.0f;
private Float purchaseAmount = 0.0f;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="purchase_detail_id")
public Integer getPurchaseDetailId() {
	return purchaseDetailId;
}
public void setPurchaseDetailId(Integer purchaseDetailId) {
	this.purchaseDetailId = purchaseDetailId;
}
@ManyToOne(cascade=CascadeType.REMOVE)
@JoinColumn(name="purchase_id")
public PurchaseMaster getPurchaseId() {
	return purchaseId;
}
public void setPurchaseId(PurchaseMaster purchaseId) {
	this.purchaseId = purchaseId;
}
@ManyToOne
@JoinColumn(name="product_id")
public Product getProductId() {
	return productId;
}
public void setProductId(Product productId) {
	this.productId = productId;
}
@Column(name="purchase_quantity")
public Float getPurchaseQuantity() {
	return purchaseQuantity;
}
public void setPurchaseQuantity(Float purchaseQuantity) {
	this.purchaseQuantity = purchaseQuantity;
}
@Column(name="purchase_unit_price")
public Float getPurchaseUnitPrice() {
	return purchaseUnitPrice;
}
public void setPurchaseUnitPrice(Float purchaseUnitPrice) {
	this.purchaseUnitPrice = purchaseUnitPrice;
}
@Column(name="purchase_amount")
public Float getPurchaseAmount() {
	return purchaseAmount;
}
public void setPurchaseAmount(Float purchaseAmount) {
	this.purchaseAmount = purchaseAmount;
}
@Override
public String toString() {
	return "PurchaseDetail [purchaseDetailId=" + purchaseDetailId + ", purchaseId=" + purchaseId + ", productId="
			+ productId + ", purchaseQuantity=" + purchaseQuantity + ", purchaseUnitPrice=" + purchaseUnitPrice
			+ ", purchaseAmount=" + purchaseAmount + "]";
}



}
