package com.gensoft.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Employee details.
 * <P>
 * 
 * @author Anand Golechha
 *
 */
@Entity
@Table(name = "employee")
@PrimaryKeyJoinColumn(name = "id")
public class Employee extends Person {

	/** Organization */
	@Column(name = "organization")
	private String organization;

	/** Salary */
	@Column(name = "salary")
	private float salary;

	/** Joining date */
	@Column(name = "joiningDate")
	private Date joiningDate;

	/**
	 * @return the organization
	 */
	public String getOrganization() {
		return organization;
	}

	/**
	 * @param organization
	 *            the organization to set
	 */
	public void setOrganization(String organization) {
		this.organization = organization;
	}

	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	/**
	 * @return the joiningDate
	 */
	public Date getJoiningDate() {
		return joiningDate;
	}

	/**
	 * @param joiningDate
	 *            the joiningDate to set
	 */
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
}
