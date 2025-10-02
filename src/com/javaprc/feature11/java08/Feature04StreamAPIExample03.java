package com.javaprc.feature11.java08;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.javaprc.feature00.beans.Employee;
import com.javaprc.feature00.beans.EmployeeList;

public class Feature04StreamAPIExample03 {
	
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeList.employees;
		
		Map<String, List<Employee>> empByDept = employees.stream().collect(Collectors.groupingBy(emp -> emp.getDeptName()));
		
		System.out.println(empByDept);
		
		empByDept.forEach((dept, empList) -> {
		    System.out.println("Department: " + dept);
		    empList.forEach(System.out::println); // iterate employees
		    System.out.println("-------------------------");
		});
		
		
		Map<String, List<Employee>> empByRole = employees.stream().collect(Collectors.groupingBy(emp -> emp.getRoleName()));
		
		System.out.println(empByRole);
		
		Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDeptName));
		
		System.out.println(collect);
		
		
		for (Map.Entry<String, List<Employee>> entry : empByDept.entrySet()) {
		    String dept = entry.getKey();
		    List<Employee> empList = entry.getValue();

		    System.out.println("Department: " + dept);
		    for (Employee e : empList) {
		        System.out.println(e);
		    }
		}
	}

}
