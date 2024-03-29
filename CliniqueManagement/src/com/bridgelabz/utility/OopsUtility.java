package com.bridgelabz.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.clinique.Appointment;
import com.bridgelabz.clinique.Doctor;
import com.bridgelabz.clinique.Patient;

public class OopsUtility
{
public static ObjectMapper mapper = new ObjectMapper();

	public static Doctor addDoctor(int doctorNumber) {

		Doctor doctor = new Doctor();
		System.out.println("Enter Doctor name");
		doctor.setName(Utility.getStr());
		System.out.println("When will you be available for patients i.e. am or pm");
		doctor.setAvailability(Utility.getStr());
		System.out.println("Give your specialization");
		doctor.setSpecialization(Utility.getStr());
		
		doctor.setId(doctor.getSpecialization() + "/" + doctorNumber);
		return doctor;
	}

	public static Patient addPatient(int patientNumber, String name, String mobileNumber,int age) {
		Patient patient = new Patient();

		patient.setMobileNumber(mobileNumber);
		patient.setAge(age);
		patient.setName(name);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM");
		LocalDateTime dateTimeNow = LocalDateTime.now();
		patient.setID("Patient " + dateTimeNow.format(dateFormatter) + "/" + patientNumber);

		return patient;
	}

	public static boolean isExit() {

		System.out.println("Do you want to continue?\n1.yes\n2.no");
		if (Utility.getInt() == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static Doctor searchDoctorByName(String name, ArrayList<Doctor> doctors) {

		Doctor doctor = new Doctor();

		for (int i = 0; i < doctors.size(); i++) {
			if (doctors.get(i).getName().equals(name)) {

				doctor = doctors.get(i);
				break;
			}

		}
		return doctor;
	}

	//method for searchDoctor by specialization
	public static ArrayList<Doctor> searchDoctorBySpecialization(String specialization, ArrayList<Doctor> doctors) {
		
		ArrayList<Doctor> doctorsBySpecialization = new ArrayList<>();
		for (int i = 0; i < doctors.size(); i++) {
			if (doctors.get(i).getSpecialization().equals(specialization)) {

				doctorsBySpecialization.add(doctors.get(i));

			}

		}

		return doctorsBySpecialization;
	}

	// method for searchdoctor by availability
	public static ArrayList<Doctor> searchDoctorByAvailability(String availability, ArrayList<Doctor> doctors) {
		
		ArrayList<Doctor> doctorsBySpecialization = new ArrayList<>();
		for (int i = 0; i < doctors.size(); i++) {
			if (doctors.get(i).getAvailability().equals(availability)) {

				doctorsBySpecialization.add(doctors.get(i));
			}

		}

		return doctorsBySpecialization;
	}

	// method search doctor by id
	public static Doctor searchDoctorByID(String ID, ArrayList<Doctor> doctors) {
		Doctor doctor = new Doctor();

		for (int i = 0; i < doctors.size(); i++) {
			if (doctors.get(i).getId().equals(ID)) {

				doctor = doctors.get(i);
				break;
			}

		}

		return doctor;
	}
	
	//searching patient by name
public static ArrayList<Patient> searchPatientByName(String name, ArrayList<Patient> patients) {
		
		ArrayList<Patient> patientsByName = new ArrayList<>();
		for (int i = 0; i < patients.size(); i++) {
			if (patients.get(i).getName().equals(name)) {

				patientsByName.add(patients.get(i));
			}

		}

		return patientsByName;
	}

// search patient by id
public static ArrayList<Patient> searchPatientById(String Id, ArrayList<Patient> patients) {
	ArrayList<Patient> patientsById = new ArrayList<>();
	for (int i = 0; i < patients.size(); i++) {
		if (patients.get(i).getID().equals(Id)) {

			patientsById.add(patients.get(i));
		}

	}

	return patientsById;
}

//search patient by mobile number
public static Patient searchPatientByMObile(String mobile, ArrayList<Patient> patients) {
	Patient patient=new Patient();
	for (int i = 0; i < patients.size(); i++) {
		if(patients.get(i).getMobileNumber().equals(mobile))
		{
			patient=patients.get(i);
			break;
		}
	}
	return patient;
}

//creating appointment 
public static Appointment createAnAppointment(Patient patientAppointment, Doctor doctorForAppointment,ArrayList<Appointment> appointments) {
	Appointment appointment=new Appointment();
	int appointmentNumber=appointments.size()+1;
	appointment.setAppointmentnumber(appointmentNumber);
	appointment.setDoctorId(doctorForAppointment.getId());
	appointment.setDoctorName(doctorForAppointment.getName());
	appointment.setPatientId(patientAppointment.getID());
	appointment.setPatientName(patientAppointment.getName());
	appointment.setSlot(doctorForAppointment.getAvailability());
	return appointment;
}

// show populer doctor
public static void showPopularDoctor(ArrayList<Doctor> doctors) {
	for (int i = 0; i < doctors.size(); i++) {
		Doctor doctor=doctors.get(i);
		for (int j = i+1; j < doctors.size(); j++) {
			Doctor doctornew=doctors.get(j);
			Doctor obj=doctornew;
			if(doctor.getNumberOfAppointments()>doctornew.getNumberOfAppointments())
			{
				doctors.set(j, doctor);
				doctors.set(i, obj);
			}
		}
		
	}
	System.out.println("Popular doctor is "+doctors.get(doctors.size()-1).getName());
}

// show populer specialization
public static void showPopularSpecialization(ArrayList<Doctor> doctors) {
	for (int i = 0; i < doctors.size(); i++) {
		Doctor doctor=doctors.get(i);
		for (int j = i+1; j < doctors.size(); j++) {
			Doctor doctornew=doctors.get(j);
			Doctor obj=doctornew;
			if(doctor.getNumberOfAppointments()>doctornew.getNumberOfAppointments())
			{
				doctors.set(j, doctor);
				doctors.set(i, obj);
			}
		}
		
	}
	System.out.println("Popular Specialization is "+doctors.get(doctors.size()-1).getSpecialization());
	
}

		
      
		
}