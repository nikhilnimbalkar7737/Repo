package com.web;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien
{
	@Id
int aid;
String aname;
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
String tech;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
}
public void setAname(String aname) {
	this.aname = aname;
}
}
