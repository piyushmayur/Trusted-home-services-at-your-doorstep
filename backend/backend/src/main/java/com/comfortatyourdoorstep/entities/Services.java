package com.comfortatyourdoorstep.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name = "service_tbl")
public class Services {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serviceid;
	
	@Column(length = 50)
	private String servicename;
	
	@Column(length = 500)
	private String shortdescription;
	
	@Column(length = 30)
	private String city;
	
	@Column(length = 30)
	private String state;
	
	@Column(length = 10)
	private String pincode;

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	private String servicecharge;
	private String packages;
	private String categoryName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private ServiceProvider employee;

	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getServiceid() {
		return serviceid;
	}

	public void setServiceid(int serviceid) {
		this.serviceid = serviceid;
	}

	public String getServicename() {
		return servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename;
	}

	public String getShortdescription() {
		return shortdescription;
	}

	public void setShortdescription(String shortdescription) {
		this.shortdescription = shortdescription;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getServicecharge() {
		return servicecharge;
	}
	public void setServicecharge(String servicecharge) {
		this.servicecharge = servicecharge;
	}

	public String getPackages() {
		return packages;
	}

	public void setPackages(String packages) {
		this.packages = packages;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public ServiceProvider getEmployee() {
		return employee;
	}

	public void setEmployee(ServiceProvider employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Services [serviceid=" + serviceid + ", servicename=" + servicename + ", shortdescription="
				+ shortdescription + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", servicecharge="
				+ servicecharge + ", packages=" + packages + ", categoryName=" + categoryName + ", employee=" + employee
				+ "]";
	}
	
	
	
	
	
	
}
