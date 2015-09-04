package com.myapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@XmlRootElement(name = "TestDTO")
@Entity
@Table(name = "test")
public class TestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6947895310799525012L;
	// @XmlElement
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	// @XmlElement
	@Column(name = "content")
	private String content;

	public TestDTO() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public TestDTO(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

}
