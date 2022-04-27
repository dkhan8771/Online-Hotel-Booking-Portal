package com.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "bookonline")
public class BookOnline {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "b_id")
	private Integer bId;
	@Column(name = "name")	
	private String name;
	
	@Column(name = "email")	
	private String email;
	
	@Column(name = "phonenumber")
	private String phonenumber;
	@Column(name = "cityname")
	private String cityname;
	
	
	@Column(name = "arrivaldate")
	private String arrivaldate;
	
	@Column(name = "departuredate")
	private String departuredate;
	
	@Column(name = "arrivaltime")
	private String arrivaltime;
	
	@Column(name = "departuretime")
	private String departuretime;

	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getArrivaldate() {
		return arrivaldate;
	}

	public void setArrivaldate(String arrivaldate) {
		this.arrivaldate = arrivaldate;
	}

	public String getDeparturedate() {
		return departuredate;
	}

	public void setDeparturedate(String departuredate) {
		this.departuredate = departuredate;
	}

	public String getArrivaltime() {
		return arrivaltime;
	}

	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}

	public String getDeparturetime() {
		return departuretime;
	}

	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}
	
	
	

}
