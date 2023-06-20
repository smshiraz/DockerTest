package com.docker.test;

public class Employee {

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDepartment=" + empDepartment + ", empExp=" + empExp + "]";
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public int getEmpExp() {
		return empExp;
	}
	public void setEmpExp(int empExp) {
		this.empExp = empExp;
	}
	public Employee(String empName,	String empDepartment,int empExp)
	{
		this.empName=empName;
		this.empDepartment=empDepartment;
		this.empExp=empExp;
		
	}
	
	String empName;
	String empDepartment;
	int empExp;
	
	
	
}
