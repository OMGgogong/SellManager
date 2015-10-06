package cn.edu.yuntukeji.finacing.vo;

public class CustomerTradeStatistics {
private Integer customerId ;
private String customerSimpleName;
private Double tradeMonney;

public CustomerTradeStatistics(Integer customerId, String customerSimpleName, Double tradeMonney) {
	super();
	this.customerId = customerId;
	this.customerSimpleName = customerSimpleName;
	this.tradeMonney = tradeMonney;
}
public Integer getCustomerId() {
	return customerId;
}
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}
public String getCustomerSimpleName() {
	return customerSimpleName;
}
public void setCustomerSimpleName(String customerSimpleName) {
	this.customerSimpleName = customerSimpleName;
}
public Double getTradeMonney() {
	return tradeMonney;
}
public void setTradeMonney(Double tradeMonney) {
	this.tradeMonney = tradeMonney;
}
@Override
public String toString() {
	return "CustomerTradeStatistics [customerId=" + customerId + ", customerSimpleName=" + customerSimpleName
			+ ", tradeMonney=" + tradeMonney + "]";
}



}
