package com.student.entities;

import jakarta.persistence.Entity;

public class Student {

	private String studentID;
	private String firstName;
	private String lastName;
	private String currentAddress;
	private String email;
	private String permanentAddress;
	private Integer parentContact;
	private Integer studenContact;
	private String education;
	private String collegeName;

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public Integer getParentContact() {
		return parentContact;
	}

	public void setParentContact(Integer parentContact) {
		this.parentContact = parentContact;
	}

	public Integer getStudenContact() {
		return studenContact;
	}

	public void setStudenContact(Integer studenContact) {
		this.studenContact = studenContact;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

}
