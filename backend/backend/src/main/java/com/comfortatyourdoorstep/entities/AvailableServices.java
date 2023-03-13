package com.comfortatyourdoorstep.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "availableservices_tbl")
public class AvailableServices {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	private String tagLine;
	private String shortDescription;
	
	@ManyToOne
	@JoinColumn(name="service_provider_id")
	private Signup provider;
	
	public Signup getProvider() {
		return provider;
	}

	public void setProvider(Signup provider) {
		this.provider = provider;
	}

	public AvailableServices() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "AvailableServices [id=" + id + ", title=" + title + ", tagLine=" + tagLine + ", shortDescription="
				+ shortDescription + ", provider=" + provider + "]";
	}
	
	

}
