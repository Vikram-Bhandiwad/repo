package com.example.demo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class ProjectData {

	public ProjectData() {
		
	}
	public ProjectData(String name, String describ) {
		super();
		this.name = name;
		this.describ = describ;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
@Column
	private String describ;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescrib() {
		return describ;
	}
	public void setDescrib(String describ) {
		this.describ = describ;
	}

	
}
