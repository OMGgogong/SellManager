package cn.edu.yuntukeji.finacing.vo;

public class PurchaseProductVo {
private Integer productId;
private String productName;
private Double quantity;
private Double amount;


public PurchaseProductVo() {
}
@Override
public String toString() {
	return "PurchaseProductVo [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
			+ ", amount=" + amount + "]";
}
public PurchaseProductVo(Integer productId, String productName, Double quantity, Double amount) {
	this.productId = productId;
	this.productName = productName;
	this.quantity = quantity;
	this.amount = amount;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Double getQuantity() {
	return quantity;
}
public void setQuantity(Double quantity) {
	this.quantity = quantity;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}

}
