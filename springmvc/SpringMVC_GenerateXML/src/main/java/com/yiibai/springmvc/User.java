package com.yiibai.springmvc;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "User")
public class User {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	@XmlElement(name = "Name")
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@XmlElement(name = "Id")
	public void setId(int id) {
		this.id = id;
	}
}