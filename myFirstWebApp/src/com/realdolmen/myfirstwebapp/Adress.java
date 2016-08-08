package com.realdolmen.myfirstwebapp;

public class Adress {
	String city;
	String street;
	int nr;
	public Adress(String city, String street, int nr) {
		super();
		this.city = city;
		this.street = street;
		this.nr = nr;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	
	
}
