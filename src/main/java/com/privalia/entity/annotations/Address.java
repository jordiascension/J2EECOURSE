package com.privalia.entity.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Address")
public class Address {
	
	
	private int idAddress;
	
	private String street;
	/**
	 * @return the idAddress
	 */
	public int getIdAddress() {
		return idAddress;
	}
	/**
	 * @param idAddress the idAddress to set
	 */
	@Autowired
	@Value("1")
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	@Autowired
	@Value("Calle Industria")
	public void setStreet(String street) {
		this.street = street;
	}
	
	public Address(){
		
	}
	
	public Address(int idAddress, String street) {
		super();
		this.idAddress = idAddress;
		this.street = street;
	}
	
	
}
