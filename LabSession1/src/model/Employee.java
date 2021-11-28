package model;

import java.util.Scanner;

public class Employee {
	public static String empName;
	public Employee(){
		System.out.println("Hello Trainee, please Enter your name <firstname>space<lastname>");
		Scanner sc = new Scanner(System.in);
		String a[] = sc.nextLine().split(" ");
		String fName = a[0];
		String lName = a[1];
		System.out.println("Welcome: "+lName+" "+fName);
		//Read the Last and First Name and create empName for Email
		empName =  lName.toLowerCase()+fName;
	}

}
