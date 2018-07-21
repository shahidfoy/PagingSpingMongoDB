package com.mongodb.data.paging.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "country")
public class Country {

	@Id
	private String id;

	private String name;
	private String capital;

	public Country() {
	}

	public Country(String name, String capital) {
		this.name = name;
		this.capital = capital;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Country{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", capital='" + capital + '\'' +
				'}';
	}
}
