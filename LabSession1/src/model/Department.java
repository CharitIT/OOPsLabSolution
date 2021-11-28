package model;

import java.util.Scanner;

public class Department {
	public static String dept;
	public Department() {
		System.out.println("Please enter the department from the following: \n1. Technical \n2. Admin \n3. Human Resource \n4. Legal");
		Scanner sc = new Scanner(System.in);
		String eInput  = sc.nextLine();		
		sc.close();
		//Get the User input and set-out the department
		switch(eInput) {
		case "1":
			System.out.println("You've selected Technical");
			dept = "tech";
			break;
		case "2":
			System.out.println("You've selected Admin");
			dept = "admin";
			break;
		case "3":
			System.out.println("You've selected Human Resource");
			dept = "hr";
			break;
		case "4":
			System.out.println("You've selected Legal");
			dept = "legal";
			break;
		default:
		    System.out.println("Please select the number on the department");
		    break;
		}
	}

}
