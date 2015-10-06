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
@Table(name="customer")
public class Customer implements Serializable{

	private Integer id;
	private String customerSimpleName;
	private String customerName;
	private String owner;
	private String title;
	private String telephone;
	private String mobilephone;
	private String fax;
	private SalesMan salersManId;
	private String cutomerAddress;
	private String deliveryAddress;
	private String invoiceAddress;
	private Date lastDeliveryDate;
	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@Column(name="customer_id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="customer_simple_name",length=32,nullable=false)
	public String getCustomerSimpleName() {
		return customerSimpleName;
	}
	public void setCustomerSimpleName(String customerSimpleName) {
		this.customerSimpleName = customerSimpleName;
	}
	@Column(name="customer_name",length=64)
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Column(name="owner",length=32)
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Column(name="tittle",length=32)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name="telephone",length=32)
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Column(name="mobilephone",length=32)
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	@Column(name="fax",length=32)
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	@ManyToOne
	@JoinColumn(name="salers_man_id")
	public SalesMan getSalersManId() {
		return salersManId;
	}
	public void setSalersManId(SalesMan salersManId) {
		this.salersManId = salersManId;
	}
	@Column(name="customer_address",length=128)
	public String getCutomerAddress() {
		return cutomerAddress;
	}
	public void setCutomerAddress(String cutomerAddress) {
		this.cutomerAddress = cutomerAddress;
	}
	@Column(name="delivery_address",length=128)
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	@Column(name="invoice_address",length=128)
	public String getInvoiceAddress() {
		return invoiceAddress;
	}
	public void setInvoiceAddress(String invoiceAddress) {
		this.invoiceAddress = invoiceAddress;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_delivery_date")
	public Date getLastDeliveryDate() {
		return lastDeliveryDate;
	}
	public void setLastDeliveryDate(Date lastDeliveryDate) {
		this.lastDeliveryDate = lastDeliveryDate;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerSimpleName=" + customerSimpleName + ", customerName=" + customerName
				+ ", owner=" + owner + ", title=" + title + ", telephone=" + telephone + ", fax=" + fax
				+ ", salersManId=" + salersManId + ", cutomerAddress=" + cutomerAddress + ", deliveryAddress="
				+ deliveryAddress + ", InvoiceAddress=" + invoiceAddress + ", lastDeliveryDate=" + lastDeliveryDate
				+ "]";
	}
	
	
}
