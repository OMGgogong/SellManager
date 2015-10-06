package cn.edu.yuntukeji.finacing.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="sales_man")
public class SalesMan implements Serializable{
private Integer salesMamId;
private String chineseName;
private String englishName;
private String telePhone;
private String mobilePhone;
private String contactAddress;
private String email;

@Id
@GenericGenerator(name="sales_man_id",strategy="imcrement")
@Column(name="sales_man_id")
public Integer getSalesMamId() {
	return salesMamId;
}
public void setSalesMamId(Integer salesMamId) {
	this.salesMamId = salesMamId;
}
@Column(name="chinese_name",length=16)
public String getChineseName() {
	return chineseName;
}
public void setChineseName(String chineseName) {
	this.chineseName = chineseName;
}
@Column(name="english_name",length=16)
public String getEnglishName() {
	return englishName;
}
public void setEnglishName(String englishName) {
	this.englishName = englishName;
}
@Column(name="tele_phone",length=32)
public String getTelePhone() {
	return telePhone;
}
public void setTelePhone(String telePhone) {
	this.telePhone = telePhone;
}
@Column(name="mobile_phone",length=32)
public String getMobilePhone() {
	return mobilePhone;
}
public void setMobilePhone(String mobilePhone) {
	this.mobilePhone = mobilePhone;
}
@Column(name="cpmtact_address",length=64)
public String getContactAddress() {
	return contactAddress;
}
public void setContactAddress(String contactAddress) {
	this.contactAddress = contactAddress;
}
@Column(name="email",length=32)
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "SalesMan [salesMamId=" + salesMamId + ", chineseName=" + chineseName + ", englishName=" + englishName
			+ ", telePhone=" + telePhone + ", mobilePhone=" + mobilePhone + ", contactAddress=" + contactAddress
			+ ", email=" + email + "]";
}


}
