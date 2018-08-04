/**
 * 
 */
package com.luv2code.jackson.json.demo.entities;

import java.util.Arrays;

/**
 * Entity class for student
 * @author Mihai-Tudor Popescu
 *
 */
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private Address address;
	private String[] languages;
	private boolean active;
	
	public Student() {
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", languages=" + Arrays.toString(languages) + ", active=" + active + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the languages
	 */
	public String[] getLanguages() {
		return languages;
	}

	/**
	 * @param languages the languages to set
	 */
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
