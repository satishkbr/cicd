package com.tsk.customersvcs1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String lastName;
	private String city;
	
	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param firtName
	 * @param lastName
	 * @param city
	 */
	public Customer(Integer id, String firtName, String lastName, String city) {
		super();
		this.id = id;
		this.firstName = firtName;
		this.lastName = lastName;
		this.city = city;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the firtName
	 */
	public String getFirtName() {
		return firstName;
	}
	/**
	 * @param firtName the firtName to set
	 */
	public void setFirtName(String firtName) {
		this.firstName = firtName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

}
