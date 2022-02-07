package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="cdmcardinfo")
public class TicketEntity {
	 
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="id")
      private Long id;
	
	 @Column(name="cdm_cardnum")
      private String cdm_cardnum ;
	 
	 @Column(name="cdm_username")
      private String  cdm_username;
	 
	 @Column(name="cdm_cardname")
      private String cdm_cardname;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCdm_cardnum() {
		return cdm_cardnum;
	}

	public void setCdm_cardnum(String cdm_cardnum) {
		this.cdm_cardnum = cdm_cardnum;
	}

	public String getCdm_username() {
		return cdm_username;
	}

	public void setCdm_username(String cdm_username) {
		this.cdm_username = cdm_username;
	}

	public String getCdm_cardname() {
		return cdm_cardname;
	}

	public void setCdm_cardname(String cdm_cardname) {
		this.cdm_cardname = cdm_cardname;
	}

	@Override
	public String toString() {
		return "TicketEntity [id=" + id + ", cdm_cardnum=" + cdm_cardnum + ", cdm_username=" + cdm_username
				+ ", cdm_cardname=" + cdm_cardname + "]";
	}
	 
      

     
}
