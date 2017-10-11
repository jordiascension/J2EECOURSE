package com.privalia.entity;

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
	public void setStreet(String street) {
		this.street = street;
	}
	
	public Address(int idAddress, String street) {
		super();
		this.idAddress = idAddress;
		this.street = street;
	}
	
	
}
