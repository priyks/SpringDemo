package com.demo;

import java.io.Serializable;

/**
 * This class is used spring.xml bean file to create object by spring bean container
 * @author priyankaku
 *
 */
public class Employee implements Serializable  {

	private int eId;
	private String eName;
	private float eSalary;
	/**
	 * Employee default constructor
	 */
	public Employee() {
		super();
	}
	/**
	 * @param eId
	 * @param eName
	 * @param eSalary
	 */
	public Employee(int eId, String eName, float eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	/**
	 * @return the eId
	 */
	public int geteId() {
		return eId;
	}
	/**
	 * @param eId the eId to set
	 */
	public void seteId(int eId) {
		this.eId = eId;
	}
	/**
	 * @return the eName
	 */
	public String geteName() {
		return eName;
	}
	/**
	 * @param eName the eName to set
	 */
	public void seteName(String eName) {
		this.eName = eName;
	}
	/**
	 * @return the eSalary
	 */
	public float geteSalary() {
		return eSalary;
	}
	/**
	 * @param eSalary the eSalary to set
	 */
	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}

}
