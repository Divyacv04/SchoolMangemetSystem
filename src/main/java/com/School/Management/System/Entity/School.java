package com.School.Management.System.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class School {
	@Id
	private int SchoolId;
	public int getSchoolId() {
		return SchoolId;
	}
	public void setSchoolId(int schoolId) {
		SchoolId = schoolId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public long getContactNo() {
		return ContactNo;
	}
	public void setContactNo(long contactNo) {
		ContactNo = contactNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	private String StudentName;
	private long ContactNo;
	private String Address;
	@OneToOne
	private Schedule schedule;
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	

}
