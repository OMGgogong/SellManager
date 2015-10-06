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
@Table(name="supplier")
public class Supplier implements Serializable{
private Integer supplierId;
private String supplierSimpleName;
private String supplierName;
private String owner;
private String tittle;
private String telePhone;
private String mobilePhone;
private String fax;
private String companyAddress;
private String factoryAddress;
private Date lastPurchaseDate;
@Id
@GenericGenerator(name = "generator", strategy = "increment")
@Column(name="supplier_id")
public Integer getSupplierId() {
	return supplierId;
}
public void setSupplierId(Integer supplierId) {
	this.supplierId = supplierId;
}
@Column(name="supplier_simple_name")
public String getSupplierSimpleName() {
	return supplierSimpleName;
}
public void setSupplierSimpleName(String supplierSimpleName) {
	this.supplierSimpleName = supplierSimpleName;
}
@Column(name="supplier_name")
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}
@Column(name="owner")
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
@Column(name="tittle")
public String getTittle() {
	return tittle;
}
public void setTittle(String tittle) {
	this.tittle = tittle;
}
@Column(name="tele_phone")
public String getTelePhone() {
	return telePhone;
}
public void setTelePhone(String telePhone) {
	this.telePhone = telePhone;
}
@Column(name="mobile_phone")
public String getMobilePhone() {
	return mobilePhone;
}
public void setMobilePhone(String mobilePhone) {
	this.mobilePhone = mobilePhone;
}
@Column(name="fax")
public String getFax() {
	return fax;
}
public void setFax(String fax) {
	this.fax = fax;
}
@Column(name="company_address")
public String getCompanyAddress() {
	return companyAddress;
}
public void setCompanyAddress(String companyAddress) {
	this.companyAddress = companyAddress;
}
@Column(name="factory_address")
public String getFactoryAddress() {
	return factoryAddress;
}
public void setFactoryAddress(String factoryAddress) {
	this.factoryAddress = factoryAddress;
}
@Temporal(TemporalType.TIMESTAMP)
@Column(name="last_purchase_date")
public Date getLastPurchaseDate() {
	return lastPurchaseDate;
}
public void setLastPurchaseDate(Date lastPurchaseDate) {
	this.lastPurchaseDate = lastPurchaseDate;
}

}
