package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Person;
import com.bridgelabz.services.AddressBookNew;
import com.bridgelazs.utility.OopsUtility;
import com.bridgelazs.utility.Utility;

public class AddressBookManager {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		AddressBookNew addressBook = new AddressBookNew();
		File addressbookFilename = null;

		List<Person> listOfPersons = null ;
		
		

		System.out.println("enter choice \n\n1.create addressbook\n2.open addressbook \n");
		int outerchoice = Utility.getInt();
		boolean responce=true;
		while (responce) {
			switch (outerchoice) {
			case 1:// create addressbook
				addressBook.createAddressBook();
				System.out.println("you want to add person in new addressbook press 1 otherwise press 0");
				int choice = Utility.getInt();

				if (choice == 0)
					return;

				else {
					addressBook.addPerson();
					responce = OopsUtility.isExit();
				}
				OopsUtility.isExit();
				break;

			case 2:// open addressbook
				listOfPersons=addressBook.openAddressBook();

				
                
							while(responce) 
							{
								System.out.println(
										"enter choice \n\n1.add person\n2.delete person\n3.edit person\n4.sort by last name\n5.sort by zipcode\n6.Show all user of addressBook");
								int innerchoice = Utility.getInt();
								
								switch (innerchoice) {
								case 1:// add person
									addressBook.addPerson(listOfPersons);
									responce=OopsUtility.isExit();
									break;
			
								case 2: // delete person
									addressBook.deletePerson(listOfPersons);
									responce=OopsUtility.isExit();
									break;
			
								case 3:// edit person
									addressBook.editPerson(listOfPersons);
									responce=OopsUtility.isExit();
									break;
			
								case 4:// sort by last name
									addressBook.sortByLastName(listOfPersons);
									System.out.println(listOfPersons);
						            //addressBook.saveAddressBook(listOfPerson, filename);
									responce=OopsUtility.isExit();
									break;
			
								case 5: // sort by zipcode
									addressBook.sortByZipCode(listOfPersons);
									responce=OopsUtility.isExit();
									break;
			
								case 6://show all user in addressbook
									addressBook.showAllAddressBook(listOfPersons);
									responce=OopsUtility.isExit();
									break;
									
								default:
									System.out.println("you enter wrong choice");
									break;
								}
								
								
							 }
				
			
			}
		}

//		addressBook.addPerson(listOfPersons);
//		addressBook.editPerson(listOfPersons);
//		addressBook.deletePerson(listOfPersons);
//		addressBook.sortByLastName(listOfPersons);
//		addressBook.sortByZipCode(listOfPersons);
//		addressBook.createAddressBook();
//		addressBook.openAddressBook();
		// addressBook.showAllAddressBook(listOfPersons);
//		System.out.println("save address book");
		// addressBook.saveAddressBook(listOfPersons, addressbookFilename);
	}
}