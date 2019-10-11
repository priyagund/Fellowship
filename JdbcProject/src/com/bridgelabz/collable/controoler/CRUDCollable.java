package com.bridgelabz.collable.controoler;

import java.util.Scanner;

import com.bridgelabz.collable.model.Student;
import com.bridgelabz.collable.services.JdbcCollable;

public class CRUDCollable {
	public static void main(String[] args) {
		JdbcCollable jdbc = new JdbcCollable();
		Scanner scanner = new Scanner(System.in);
		boolean exit = true;

		while (exit) {

			System.out.println(
					"enter choice\n1.insert value into table\n2.update value\n3.delete value\n4.read table\n5.exit ");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:// insert data

				Student student = new Student();
				System.out.println("Enter student id  : ");
				student.setId(scanner.nextInt());
				System.out.println("Enter student name : ");
				student.setName(scanner.next());
				System.out.println("Enter student address  : ");
				student.setAddress(scanner.next());
				System.out.println(jdbc.insertDataCollable(student) + "data inserted successfully");
				break;

			case 2:// Updata data
				Student studentUpdate = new Student();
				jdbc.readDataCollable();
				System.out.println("enter id for update");
				int id = scanner.nextInt();
				System.out.println("enter new name");
				studentUpdate.setName(scanner.next());
				System.out.println("enter new address");
				studentUpdate.setAddress(scanner.next());
				jdbc.readDataCollable();
				System.out.println(jdbc.updateDataCollable(id, studentUpdate) + "data updated successfully");
				break;

			case 3:// delete data

				jdbc.readDataCollable();
				System.out.println("enter id for delete the data");
				int id1 = scanner.nextInt();
				System.out.println(jdbc.deleteDataCollable(id1) + "data deleted successfully");
				jdbc.readDataCollable();
				break;

			case 4:// read data
				jdbc.readDataCollable();
				break;

			case 5:
				exit = false;
				break;

			default:
				System.out.println("you enter wrong choice");

			}

		}
		scanner.close();
	}

}
