package com.questionno1;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 2L;
	String EmployeeId ;
	 String EmployeeName ;
	 String EmployeePhone ;
	 String EmployeeAddress;
	 
	 int EmployeeSalary ;

	public Employee(String employeeId, String employeeName, String employeePhone, String employeeAddress,
			int employeeSalary) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeePhone = employeePhone;
		EmployeeAddress = employeeAddress;
		EmployeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeePhone="
				+ EmployeePhone + ", EmployeeAddress=" + EmployeeAddress + ", EmployeeSalary=" + EmployeeSalary + "]";
	}
	 
	 

}
