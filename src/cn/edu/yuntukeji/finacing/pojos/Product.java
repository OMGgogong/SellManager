package cn.edu.yuntukeji.finacing.pojos;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "product")
public class Product implements Serializable {

 private Integer productId;
 private String productName;
 private Float safeStok;
 private Date lastPurchaseDate;
 private Date lastDeliveryDate;
 private Float quantity;
 private Float suggestBuyPrice;
 private Float suggestSalePrice;
 
 @Id
 @GenericGenerator(name="generator",strategy="increment")
 @Column(name="product_id")
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer priductId) {
	this.productId = priductId;
}
@Column(name="product_name",length=32)
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
@Column(name="safe_stok",length=32)
public Float getSafeStok() {
	return safeStok;
}
public void setSafeStok(Float safeStok) {
	this.safeStok = safeStok;
}
@Temporal(TemporalType.TIMESTAMP)
@Column(name="last_purchase_date")
public Date getLastPurchaseDate() {
	return lastPurchaseDate;
}
public void setLastPurchaseDate(Date lastPurchaseDate) {
	this.lastPurchaseDate = lastPurchaseDate;
}
@Temporal(TemporalType.TIMESTAMP)
@Column(name="last_delivery_date")
public Date getLastDeliveryDate() {
	return lastDeliveryDate;
}
public void setLastDeliveryDate(Date lastDeliveryDate) {
	this.lastDeliveryDate = lastDeliveryDate;
}
@Column(name="quantity")
public Float getQuantity() {
	return quantity;
}
public void setQuantity(Float quantity) {
	this.quantity = quantity;
}

@Column(name="suggest_buy_price")
public Float getSuggestBuyPrice() {
	return suggestBuyPrice;
}
public void setSuggestBuyPrice(Float suggestBuyPrice) {
	this.suggestBuyPrice = suggestBuyPrice;
}
@Column(name="suggest_sale_price")
public Float getSuggestSalePrice() {
	return suggestSalePrice;
}
public void setSuggestSalePrice(Float suggestSalePrice) {
	this.suggestSalePrice = suggestSalePrice;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", safeStok=" + safeStok
			+ ", lastPurchaseDate=" + lastPurchaseDate + ", lastDeliveryDate=" + lastDeliveryDate + ", quantity="
			+ quantity + ", suggestBuyPrice=" + suggestBuyPrice + ", suggestSalePrice=" + suggestSalePrice + "]";
}

 
}