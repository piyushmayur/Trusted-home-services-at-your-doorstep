package com.comfortatyourdoorstep.dto;

public class AvailableServiceDto {
	
	private String title;
	private String tagLine;
	private String shortDescription;
	private String branch_name;
	private String branch_address;
	private String branch_phone;
	private String city;
	
	
	public AvailableServiceDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AvailableServiceDto(String title, String tagLine, String shortDescription, String branch_name,
			String branch_address, String branch_phone, String city) {
		super();
		this.title = title;
		this.tagLine = tagLine;
		this.shortDescription = shortDescription;
		this.branch_name = branch_name;
		this.branch_address = branch_address;
		this.branch_phone = branch_phone;
		this.city = city;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTagLine() {
		return tagLine;
	}
	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_address() {
		return branch_address;
	}
	public void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}
	public String getBranch_phone() {
		return branch_phone;
	}
	public void setBranch_phone(String branch_phone) {
		this.branch_phone = branch_phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
