package com.comfortatyourdoorstep.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class ServiceDto {
	
	private String firstname;
	private String lastname;
	
	@NotBlank(message = "Email must be supplied ...")
	@Email(message = "Invalid Email Format")
	private String email;
	private String phonenumber;
	private String experience;
	private String servicename;
	private String shortdescription;
	private String city;
	private String state;
	private String pincode;
	private String servicecharge;
	private String packages;
	private String categoryName;
	
	
	private int empid;

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
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
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
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
	@Override
	public String toString() {
		return "ServiceDto [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", phonenumber="
				+ phonenumber + ", experience=" + experience + ", servicename=" + servicename + ", shortdescription="
				+ shortdescription + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", servicecharge="
				+ servicecharge + ", packages=" + packages + ", categoryName=" + categoryName + ", employee=" 
				+ "]";
	}
	
	

}
