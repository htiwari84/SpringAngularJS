package com.myapp.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TestDTO")
public class TestDTO {

	@XmlElement
	private long id;
	@XmlElement
	private String content;

	public TestDTO() {
	}

	public TestDTO(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

}
