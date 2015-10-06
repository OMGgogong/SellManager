package cn.edu.yuntukeji.finacing.vo;

import java.util.Date;


public class PurchaseVo {
	private Integer purchaseId;
	private Date purchaseDate;
	private String supplierSimpleName;
	private Float sumAmount;
	private Integer purchaseProperty;
	
	public PurchaseVo() {
	}
	public PurchaseVo(Integer purchaseId, Date purchaseDate, String supplierSimpleName, Float sumAmount,
			Integer purchaseProperty) {
		this.purchaseId = purchaseId;
		this.purchaseDate = purchaseDate;
		this.supplierSimpleName = supplierSimpleName;
		this.sumAmount = sumAmount;
		this.purchaseProperty = purchaseProperty;
	}
	@Override
	public String toString() {
		return "PurchaseVo [purchaseId=" + purchaseId + ", purchaseDate=" + purchaseDate + ", supplierSimpleName="
				+ supplierSimpleName + ", sumAmount=" + sumAmount + ", purchaseProperty=" + purchaseProperty + "]";
	}
	public Integer getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getSupplierSimpleName() {
		return supplierSimpleName;
	}
	public void setSupplierSimpleName(String supplierSimpleName) {
		this.supplierSimpleName = supplierSimpleName;
	}
	public Float getSumAmount() {
		return sumAmount;
	}
	public void setSumAmount(Float sumAmount) {
		this.sumAmount = sumAmount;
	}
	public Integer getPurchaseProperty() {
		return purchaseProperty;
	}
	public void setPurchaseProperty(Integer purchaseProperty) {
		this.purchaseProperty = purchaseProperty;
	}
	
}
