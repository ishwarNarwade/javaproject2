package com.rabbit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Stud2 {
	
	
	private int sid;
	private String name;
	private String add;
	private String email;
	private String contact;
	private String gender;
	private String contry;
	

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
		public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	@Override
	public String toString() {
		return "Stud1 [sid=" + sid + ", name=" + name + ", add=" + add + ", email=" + email + ", contact=" + contact
				+ ", gender=" + gender + ", contry=" + contry + "]";
	}
	
	
//	@Override
//	public String toString() {
//		return "Stud1 [sid=" + sid + ", name=" + name + ", add=" + add + ", email=" + email + ", contact=" + contact
//				+ "]";
//	}
	
	
	
	
}
