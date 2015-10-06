package cn.edu.yuntukeji.finacing.vo;

public class TradeStatistics {
private Integer supplierId ;
private String supplierSimpleName;
private String productName;
private Double tradeCount;
private Double tradeMonney;

public TradeStatistics(Integer supplierId, String supplierSimpleName, String productName, Double tradeCount,
		Double tradeMonney) {
	this.supplierId = supplierId;
	this.supplierSimpleName = supplierSimpleName;
	this.productName = productName;
	this.tradeCount = tradeCount;
	this.tradeMonney = tradeMonney;
}
public Integer getSupplierId() {
	return supplierId;
}
public void setSupplierId(Integer supplierId) {
	this.supplierId = supplierId;
}
public String getSupplierSimpleName() {
	return supplierSimpleName;
}
public void setSupplierSimpleName(String supplierSimpleName) {
	this.supplierSimpleName = supplierSimpleName;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Double getTradeCount() {
	return tradeCount;
}
public void setTradeCount(Double tradeCount) {
	this.tradeCount = tradeCount;
}
public Double getTradeMonney() {
	return tradeMonney;
}
public void setTradeMonney(Double tradeMonney) {
	this.tradeMonney = tradeMonney;
}
@Override
public String toString() {
	return "TradeStatistics [supplierId=" + supplierId + ", supplierSimpleName=" + supplierSimpleName + ", productName="
			+ productName + ", tradeCount=" + tradeCount + ", tradeMonney=" + tradeMonney + "]";
}


}
