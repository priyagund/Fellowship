
/******************************************************************************
* 
 
Purpose:  doctor model
*
*  @author  Priyanka gund
*  @version 1.0
*  @since   13-09-2019
*
******************************************************************************/
package com.bridgelabz.clinique;

import java.util.ArrayList;

public class DoctorsModel 
{

	private ArrayList<Doctor> doctors;

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	@Override
	public String toString() {
		return "DoctorsModel [doctors=" + doctors + ", getDoctors()=" + getDoctors() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
