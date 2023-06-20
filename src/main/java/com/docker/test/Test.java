package com.docker.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ram", "IT", 5);
		Employee e2 = new Employee("Hari", "IT", 7);
		Employee e3 = new Employee("Syed", "HR", 3);
		Employee e4 = new Employee("Vivek", "admin", 7);

		List<Employee> empList = Arrays.asList(e1, e2, e3, e4);

		//List<Employee> e = empList.stream().filter(g -> g.getEmpDepartment().equals("IT")).sorted(Comparator.comparing(Employee::getEmpExp)).forEach(System.out::println);
		empList.stream().filter(g -> g.getEmpDepartment().equals("IT")).sorted(Comparator.comparing(Employee::getEmpExp)).forEach(System.out::println);
	}

}
