package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private int uid;
	private String uname;
	private int uamt;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUamt() {
		return uamt;
	}

	public void setUamt(int uamt) {
		this.uamt = uamt;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uamt=" + uamt + "]";
	}

}
