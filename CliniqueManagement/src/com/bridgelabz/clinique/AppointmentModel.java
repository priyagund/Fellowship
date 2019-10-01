

/******************************************************************************
* 
 
Purpose:  appointment model
*
*  @author  Priyanka gund
*  @version 1.0
*  @since   30-09-2019
*
******************************************************************************/package com.bridgelabz.clinique;
import java.util.ArrayList;

public class AppointmentModel 
{

	private ArrayList<Appointment> appointments;

	public ArrayList<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(ArrayList<Appointment> appointments) {
		this.appointments = appointments;
	}

	@Override
	public String toString() {
		return "AppointmentModel [appointments=" + appointments + ", getAppointments()=" + getAppointments()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
