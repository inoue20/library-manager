package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "LOGS")
public class Log {

	@Id
	@SequenceGenerator(name = "LOG_ID_GENERATOR", sequenceName="LOG_ID_SEQ",  allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "LOG_ID_GENERATOR")
	@Column(name = "ID")
	private Integer id;

	@Column(name = "LIBRARY_ID")
	private Integer libraryId;

	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "RENT_DATE")
	private Integer rentDate;

	@Column(name = "RETURN_DATE")
	private Integer returnDate;

	@Column(name = "RETURN_DUE_DATE")
	private Integer returnDue;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(Integer libraryId) {
		this.libraryId = libraryId;
	}
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getRentDate() {
		return rentDate;
	}

	public void setRentDate(Integer rentDate) {
		this.rentDate = rentDate;
	}
	public Integer getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Integer returnDate) {
		this.returnDate = returnDate;
	}
	public Integer getReDue() {
		return returnDue;
	}

	public void setReturnDue(Integer returnDue) {
		this.returnDue = returnDue;
	}
}
