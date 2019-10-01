package com.bridgelabz.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.IPerson;
import com.bridgelabz.model.Person;
import com.bridgelabz.model.PersonModel;
import com.bridgelazs.utility.Utility;
import java.lang.*;

public class AddressBook implements IPerson {

	static ArrayList<Person> person = new ArrayList<>();
	static PersonModel model = new PersonModel();
	ArrayList<PersonModel> personList;

	static ObjectMapper mapper = new ObjectMapper();

	static String pathPerson = "/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/newFile.json";
     
	static String addName = "";
	
	static ArrayList<Person> listOfPerson;
	
	static File jsonFileName1 = new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/priyanka.json");

	public static void creatAddressBook() throws JsonGenerationException, JsonMappingException, IOException {
		Person person = new Person();
		System.out.println("enter addressbook name");
		addName = Utility.getStr();
		// String absolutePath
		// ="/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/";
		// System.out.println("Eneter file name");
		// File filenew=new File(absolutePath);
		// System.out.println(filenew.createNewFile());
		// if(filenew.createNewFile())
		// {
		  File jsonFilename = new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/" + addName + ".json");

		if (!jsonFilename.exists()) {
			mapper.writeValue(jsonFilename, person);
			System.out.println("Person:" + person);
		} else
			System.out.println("file is already exist");

		System.out.println("Address book is created " + addName + ".json");
		// FileWriter wr=new FileWriter(filenew);
		// System.out.println("Address book is created "+addName+".json");
		// wr.write("[]");
//			person = mapper.readValue(jsonFilename, new TypeReference<ArrayList<Person>>() {
//			});

		// }

//		mapper.writeValue(new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/newFile.json"), person);
//		System.out.println("enter how many person add in addressbook");
	}

	public static void openAddressBook() throws JsonParseException, JsonMappingException, IOException {

		File file = new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/");
		File[] filelist = file.listFiles();
		for (int i = 0; i < filelist.length; i++) {
			if (filelist[i].isFile()) {
				System.out.println(
						(i + 1) + " " + filelist[i].getName().substring(0, filelist[i].getName().lastIndexOf(".")));

			}
		}

		System.out.println("enter addressbook name you want to open");
		String addressbookname = Utility.getStr();
		Boolean isfound = false;
		for (int i = 0; i < filelist.length; i++) {
			if (filelist[i].isFile()) {
				if (filelist[i].getName().substring(0, filelist[i].getName().lastIndexOf("."))
						.equalsIgnoreCase(addressbookname)) {
					File jsonFilename = filelist[i];
					isfound = true;
//					person = mapper.readValue(filelist[i], model.getClass());
				}
			}
		}

	}

	public void addPerson(ArrayList<Person> listOfPerson) throws JsonGenerationException, JsonMappingException, IOException {
		Person personobj = new Person();
		Address address = new Address();
		System.out.println("enter first name");
		personobj.setName(Utility.getStr());
		System.out.println("enter last name");
		personobj.setLastname(Utility.getStr());
		System.out.println("enter phone number");
		personobj.setPhoneno(Utility.getStr());
		System.out.println("enter state name");
		address.setState(Utility.getStr());
		System.out.println("enter city name ");
		address.setCity(Utility.getStr());
		System.out.println("enter zip code");
		address.setZip(Utility.getStr());
		personobj.setAddress(address);
		person.add(personobj);
		System.out.println("If you want to save than press 1 otherwise press 0");
		int choice = Utility.getInt();
		if(choice==1)
		{
			listOfPerson.add(personobj);
			saveAddressBook();
		}
		
		else
			System.exit(0);
		// return personobj;
//		return person;

	}

	/*
	 * public void editperson() {
	 * System.out.println("enter mobnumber for finding person"); String
	 * mob=Utility.getStr(); int personloc=0; boolean isFound=false;
	 * ArrayList<Person> personList; for(int i=0;i<personList.size();i++) { String
	 * personmob=person.get(i).getPhoneno(); if(mob.equals(personmob)) {
	 * isFound=true; System.out.println("person found"); break; } personloc++;
	 * 
	 * } if(!isFound) { System.out.println("person not found");
	 * 
	 * } System.out.println("enter a choice 1.edit zip\n 2.edit city  ");
	 * System.out.println("enter your choice"); int choice3=Utility.getInt();
	 * switch(choice3) {
	 * 
	 * case 1://edit zip System.out.println("enter new zipcode"); String
	 * zip=Utility.getStr(); person.get(personloc).getAddress().setZip(zip);
	 * 
	 * case 2://edit city System.out.println("enter new city"); String
	 * city=Utility.getStr(); person.get(personloc).getAddress().setCity(city); }
	 */

	public void editperson() {
		System.out.println("enter person details you want to edit");
		String mob = Utility.getStr();
		int personloc = 0;
		boolean isFound = false;
		for (int i = 0; i < person.size(); i++) {
			String personmob = person.get(i).getPhoneno();
			if (mob.equals(personmob)) {
				isFound = true;
				System.out.println("person found");
				break;
			}
			personloc++;

			if (!isFound) {
				System.out.println("person not found");
			}

			System.out.println("what do you want to edit 1.zip\n 2.name\n 3.city");
			int choice = Utility.getInt();

			switch (choice) {

			case 1: // zip
				String zip = Utility.getStr();
				person.get(personloc).getAddress().setZip(zip);
				break;
			case 2:// name
				String name = Utility.getStr();
				person.get(personloc).setName(name);
				break;

			case 3:// city
				String city = Utility.getStr();
				person.get(personloc).getAddress().setCity(city);
				break;
			}

		}

	}

	@Override
	public void deletePerson() {
		System.out.println("enter mob number of person you want to delete");
		int personloc = 0;
		String mobno = Utility.getStr();
		boolean isFound = false;
		for (int i = 0; i < person.size(); i++) {
			isFound = false;
			String personmob = person.get(i).getPhoneno();
			if (mobno.equals(personmob)) {
				if (isFound) {
					System.out.println("person is found in addressbook");
					person.remove(personloc);
					break;
				} else {
					personloc++;
				}

			}
		}

		if (!isFound) {
			System.out.println("person is not found in addressbook");

		}

	}

	@Override
	public ArrayList<Person> sortByLastName() {
		for (int i = 0; i < person.size() - 1; i++) {
			for (int j = i + 1; j < person.size(); j++) {
				Person person1 = person.get(j);
				Person person2 = person.get(j + 1);

				if (person2.getLastname().compareTo(person1.getLastname()) > 0) {
					Person temp = person1;
					person.set(j, person2);
					person.set(j + 1, temp);
				}
			}
		}
		System.out.println("AddressBook successfully sorted using LastName");
		return person;

	}

	@Override
	public ArrayList<Person> sortByZip() {
		for (int i = 0; i < person.size() - 1; i++) {

			for (int j = i + 1; j < person.size(); j++) {
				Person person1 = person.get(j);
				Person person2 = person.get(j + 1);

				if (person1.getAddress().getZip().compareTo(person2.getAddress().getZip()) > 0) {
					Person temp = person1;
					person.set(j, person2);
					person.set(j + 1, temp);
				}
			}
		}
		System.out.println("AddressBook successfully sorted using LastName");
		return person;
	}

	public static void saveAddressBook() {
		try {
			System.out.println("inside save method");
			System.out.println("person:" + person);
			//File jsonFilename = null;
			//model.setPerson(person);
			//JsonGenerator jsonFilename = null;
			
			//ArrayList<Person> listOfPerson = mapper.readValue(jsonFileName1, new TypeReference<List<Person>>(){});
			//listOfPerson.stream().forEach(person -> mod);
			PersonModel listOfPerson=mapper.readValue(jsonFileName1,PersonModel.class);
			//listOfPerson.getPerson().addAll(person);
			//System.out.println("ListofPerson:"+listOfPerson.getPerson());
		  //listOfPerson.addAll(person);
			//model.setPerson(listOfPerson.getPerson().addAll(person));
			System.out.println("ListofPerson:"+listOfPerson);
			System.out.println("Model:"+model);
			mapper.writeValue(jsonFileName1, model);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void addPerson() throws JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		
	}

}
