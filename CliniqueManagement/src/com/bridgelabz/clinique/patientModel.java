
/******************************************************************************
* 
 
Purpose:  patientmodel
*
*  @author  Priyanka gund
*  @version 1.0
*  @since   13-09-2019
*
******************************************************************************/
package com.bridgelabz.clinique;

import java.util.ArrayList;

public class patientModel
{

	private ArrayList<Patient> patients;

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "PatientModel [patients=" + patients + ", getPatients()=" + getPatients() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
