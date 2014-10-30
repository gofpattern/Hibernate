package com.vaannila.student;

import java.util.Set;

// Generated Sep 3, 2009 7:20:37 PM by Hibernate Tools 3.2.4.GA

/**
 * This class contains student details.
 */
public class Student implements java.io.Serializable {

	private long studentId;
	private String studentName;
	private Address studentAddress;
	private Set<Course> courses;

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Student() {
	}

	public Student(String studentName, Address studentAddress,
			Set<Course> courses) {
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.courses = courses;
	}

	public long getStudentId() {
		return this.studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getStudentAddress() {
		return this.studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

}
