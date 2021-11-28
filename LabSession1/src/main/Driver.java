package main;

import model.Department;
import model.Employee;
import service.CredentialService;

public class Driver {
	public static void main(String[] args) {
		String empName;
		String department;
		//Call Emp Model to get employee name
		Employee emp = new Employee();
		empName = emp.empName;
		//Derive the department by employee choice
		Department dept = new Department();
		department = dept.dept;
		//Use CredentialService  to show the emp credentials
		CredentialService cs = new CredentialService();
		cs.showCredentials(empName, department);
		
	}
}
