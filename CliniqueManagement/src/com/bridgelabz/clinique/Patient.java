package com.bridgelabz.clinique;

public class Patient 
{
	private String name;
	private String mobileNumber;
	private String ID;
	private int age;
	private Appointment appointment;
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", mobileNumber=" + mobileNumber + ", ID=" + ID + ", age=" + age
				+ ", appointment=" + appointment + "]";
	}
	
	
}
