package com.bridgelabz.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.ImplPerson;
import com.bridgelabz.model.Person;
import com.bridgelazs.utility.Utility;

public class AddressBookNew implements ImplPerson {
	Person person = new Person();
	Address address = new Address();
	ObjectMapper mapper = new ObjectMapper();
	File addressbookFilename;

	// method for addPerson
	public void addPerson(List<Person> listOfPerson) {

		System.out.println("Enter First name");
		person.setName(Utility.getStr());
		System.out.println("Enter Last Name");
		person.setLastname(Utility.getStr());
		System.out.println("Enter Phone Number");
		person.setPhoneno(Utility.getStr());
		System.out.println("Enter City");
		address.setCity(Utility.getStr());
		System.out.println("Enter State");
		address.setState(Utility.getStr());
		System.out.println("Enter zipCode");
		address.setZip(Utility.getStr());
		person.setAddress(address);

		listOfPerson.add(person);
		try {
			saveAddressBook(listOfPerson, addressbookFilename);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
	public Person addPerson() {

		System.out.println("Enter First name");
		person.setName(Utility.getStr());
		System.out.println("Enter Last Name");
		person.setLastname(Utility.getStr());
		System.out.println("Enter Phone Number");
		person.setPhoneno(Utility.getStr());
		System.out.println("Enter City");
		address.setCity(Utility.getStr());
		System.out.println("Enter State");
		address.setState(Utility.getStr());
		System.out.println("Enter zipCode");
		address.setZip(Utility.getStr());
		person.setAddress(address);
		return person;
	}
	
	//method for edit person
	@Override
	public void editPerson(List<Person> person) {
		System.out.println("Enter person Phone number which details you want to edit");
		String mob = Utility.getStr();
		int personlocation = 0;
		boolean isFound = false;
		for (int i = 0; i < person.size(); i++) {
			String personmob = person.get(i).getPhoneno();
			if (mob.equals(personmob)) {
				isFound = true;
				System.out.println("person found");
				break;
			}
			personlocation++;
		}
		if (!isFound) {
			System.out.println("person not found");
		} else {

			System.out.println("what do you want to edit 1.zip\n 2.name\n 3.city");
			int choice = Utility.getInt();

			switch (choice) {

			case 1: // zip
				String zip = Utility.getStr();
				person.get(personlocation).getAddress().setZip(zip);
				break;
			case 2:// name
				String name = Utility.getStr();
				person.get(personlocation).setName(name);
				break;

			case 3:// city

				String city = Utility.getStr();
				person.get(personlocation).getAddress().setCity(city);
				break;
			}
    
		}
		try {
			mapper.writeValue(addressbookFilename,person );
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// saveAddressBook(listOfPerson,addressbookFilename);

	}

	// method for delete person
	@Override
	public void deletePerson(List<Person> person) {
		// TODO Auto-generated method stub

		System.out.println("enter mobile number of person which you want to delete");
		int personloc = 0;
		String mobno = Utility.getStr();
		boolean isFound = false;
		for (int i = 0; i < person.size(); i++) {
			String personmob = person.get(i).getPhoneno();
			if (mobno.equals(personmob)) {
				isFound = true;
				System.out.println("person is found in addressbook");
				person.remove(personloc);
				System.out.println("Person deleted successfully");
				break;
			}
			personloc++;
		}
		if (!isFound) {
			System.out.println("person is not found in addressbook");
		}else {
			try {
				mapper.writeValue(addressbookFilename,person );
			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block 
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// sav
		}
		
		

	}
	
//method for sortBylstName 
	
	@Override
	public void sortByLastName(List<Person> person) {
		// TODO Auto-generated method stub
		for (int i = 0; i < person.size(); i++) {
			for (int j = i + 1; j < person.size(); j++) {
				Person person1 = person.get(i);
				Person person2 = person.get(j);

				if (person1.getLastname().compareTo(person2.getLastname()) > 0) {
					Person temp = person1;
					person.set(i, person2);
					person.set(j, temp);
				}
			}
		}
		System.out.println("AddressBook successfully sorted using LastName");
		try {
			mapper.writeValue(addressbookFilename,person );
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//method for sortByZipCode
	@Override
	public void sortByZipCode(List<Person> person) {
		// TODO Auto-generated method stub
		for (int i = 0; i < person.size(); i++) {
			for (int j = i + 1; j < person.size(); j++) {
				Person person1 = person.get(i);
				Person person2 = person.get(j);

				if (person1.getAddress().getZip().compareTo(person2.getAddress().getZip()) > 0) {
					Person temp = person1;
					person.set(i, person2);
					person.set(j, temp);
				}
			}
		}
		System.out.println("AddressBook successfully sorted using ZipCode");

		try {
			mapper.writeValue(addressbookFilename,person );
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//method for createAddressBook
	@Override
	public void createAddressBook() throws JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		System.out.println("enter addressbook name");
		String addName = Utility.getStr();

		File jsonFilename = new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/" + addName + ".json");
		addressbookFilename=jsonFilename;
		if (!jsonFilename.exists()) {
			System.out.println("New Address Book Open Successfully");
		} else {
			System.out.println("file is already exist");
		}

	}

	// method for open addressbook
	@Override
	public List<Person> openAddressBook() throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		List<Person> listOfPersons = null;

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
					addressbookFilename = jsonFilename;
					isfound = true;
					listOfPersons = new ArrayList<Person>(
							Arrays.asList(mapper.readValue(jsonFilename, Person[].class)));
//					person = mapper.readValue(filelist[i], Person.class);
				}
			}
		}

		return listOfPersons;
	}

	// method for save addressbook
	@Override
	public void saveAddressBook(List<Person> listOfPerson, File filename)
			throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		mapper.writeValue(filename,listOfPerson);
	}

	@Override
	public void showAllAddressBook(List<Person> listOfPerson) {
		// TODO Auto-generated method stub
		Iterator<Person> itr = listOfPerson.iterator();
	//	System.out.println("Person Details : ");
		System.out.println("Person Details : ");
		System.out.println("Name"+"  LastName"+"  PhoneNumber"+"  State"+" City"+"  Zip");
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
//			System.out.println(itr.next().getName()+" details");
//			System.out.println(itr.next());
//			System.out.println("***************************************\n\n");
		}
	}

	///  method for creat addressbook
	
	public void creatAddressBook() throws JsonGenerationException, JsonMappingException, IOException {
		Person person = new Person();
		System.out.println("enter addressbook name");
		String addName = Utility.getStr();

		File jsonFilename = new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/" + addName + ".json");

		if (jsonFilename.createNewFile()) {
			FileWriter wr = new FileWriter(jsonFilename);
			String emptyString = "[{}]";
			wr.write(emptyString);
			mapper.writeValue(jsonFilename, person);
			System.out.println("Person:" + person);
		} else
			System.out.println("file is already exist");

	}

}
