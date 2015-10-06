package cn.edu.yuntukeji.finacing.pojos;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="purchase_master")
public class PurchaseMaster implements Serializable{
private Integer purchaseId;
private Date purchaseDate;
private Supplier supplierId;
private Integer purchaseProperty = 1;
private Float subTotal;

@Id
@GenericGenerator(name="generator",strategy="increment")
@Column(name="purchase_id")
public Integer getPurchaseId() {
	return purchaseId;
}
public void setPurchaseId(Integer purchaseId) {
	this.purchaseId = purchaseId;
}
@Temporal(TemporalType.TIMESTAMP)
@Column(name="purchase_date")
public Date getPurchaseDate() {
	return purchaseDate;
}
public void setPurchaseDate(Date purchaseDate) {
	this.purchaseDate = purchaseDate;
}
@ManyToOne
@JoinColumn(name="supplier_id")
public Supplier getSupplierId() {
	return supplierId;
}
public void setSupplierId(Supplier supplierId) {
	this.supplierId = supplierId;
}
@Column(name="purchase_property")
public Integer getPurchaseProperty() {
	return purchaseProperty;
}
public void setPurchaseProperty(Integer purchaseProperty) {
	this.purchaseProperty = purchaseProperty;
}
@Column(name="sub_total")
public Float getSubTotal() {
	return subTotal;
}
public void setSubTotal(Float subTotal) {
	this.subTotal = subTotal;
}


}
