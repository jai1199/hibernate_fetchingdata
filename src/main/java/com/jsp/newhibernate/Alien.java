package com.jsp.newhibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Entity//(name="alien_table")//if you want to change the entity name 
//@Table(name="nailen_table") if u want to change only table name
public class Alien 
{
	@Id
  private int aid;
	//@Column(name="animal")//it will change the column name
  private String aname;
  private String address;
  private long phno;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + ", address=" + address + ", phno=" + phno + "]";
}
  
}
