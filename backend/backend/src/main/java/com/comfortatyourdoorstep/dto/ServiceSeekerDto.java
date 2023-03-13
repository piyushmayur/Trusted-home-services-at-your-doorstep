package com.comfortatyourdoorstep.dto;

import java.util.Date;

public class ServiceSeekerDto {

	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private String altphone;
	private String address;
	private String country;
	private String state;
	private String city;
	private String pincode;
	private String categoryName;
	private String servicename;
	private String servicecharge;
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getServicecharge() {
		return servicecharge;
	}

	public void setServicecharge(String servicecharge) {
		this.servicecharge = servicecharge;
	}

	@Override
	public String toString() {
		return "ServiceSeekerDto [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", phone=" + phone + ", altphone=" + altphone + ", address=" + address + ", country=" + country
				+ ", state=" + state + ", city=" + city + ", pincode=" + pincode + ", categoryName=" + categoryName
				+ ", servicename=" + servicename + ", servicecharge=" + servicecharge + ", date=" + date + "]";
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getServicename() {
		return servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAltphone() {
		return altphone;
	}

	public void setAltphone(String altphone) {
		this.altphone = altphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
