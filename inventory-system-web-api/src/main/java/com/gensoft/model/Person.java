package com.gensoft.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.springframework.util.StringUtils;

/**
 * Person base properties bean class.
 * <p>
 * 
 * @author Anand Golechha
 */
@Entity
@Table(name = "person")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

	/** Identifier of a Person */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	/** First name */
	@Column(name = "firstName", length = 50)
	private String firstName;

	/** Middle name */
	@Column(name = "middleName", length = 50)
	private String middleName;

	/** Last name */
	@Column(name = "lastName", length = 50)
	private String lastName;

	/** Sex (One of the constant from Sex enumeration class) */
	@Column(name = "sex", length = 1)
	private int sex;

	/** Birth date */
	@Column(name = "birthDate")
	private Date birthDate;

	/** Email address */
	@Column(name = "emailAddress", length = 50, unique = true)
	private String emailAddress;

	/** Address */
	@Column(name = "address", length = 250)
	private String address;

	/** City */
	@Column (name = "city", length = 50)
	private String city;

	/** State */
	@Column (name = "state", length = 50)
	private String state;

	/** Country */
	@Column (name = "country", length = 50)
	private String country;

	/** Contact number */
	@Column (name = "phoneNumber", length = 15, unique = true)
	private String phoneNumber;

	/** Age */
	@Column(name = "age", length = 3)
	private int age;

	/** Image path */
	@Column(name = "imagePath")
	private String imagePath;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return StringUtils.trimWhitespace(firstName);
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return StringUtils.trimWhitespace(middleName);
	}

	/**
	 * @param middleName
	 *            the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return StringUtils.trimWhitespace(lastName);
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the sex
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate
	 *            the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return StringUtils.trimWhitespace(emailAddress);
	}

	/**
	 * @param emailAddress
	 *            the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return StringUtils.trimWhitespace(address);
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return StringUtils.trimWhitespace(city);
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return StringUtils.trimWhitespace(country);
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return StringUtils.trimWhitespace(phoneNumber);
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath
	 *            the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return getFirstName() + " " + getLastName();
	}
}
