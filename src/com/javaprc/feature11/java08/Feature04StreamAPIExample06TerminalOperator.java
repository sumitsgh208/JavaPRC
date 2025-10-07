package com.javaprc.feature11.java08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.javaprc.feature00.beans.Employee;
import com.javaprc.feature00.beans.EmployeeList;
import com.javaprc.feature00.beans.Product;

public class Feature04StreamAPIExample06TerminalOperator {
	public static void main(String[] args) {
		
		// Example 1: Averaging a list of Doubles directly
        List<Double> numbers = Arrays.asList(3.0, 8.0, 4.0, 11.0);
        
        Double average = numbers.stream().collect(Collectors.averagingDouble(Double:: doubleValue));
		
        System.out.println("Average of numbers: " + average); // Output: 6.5
		
		EmployeeList el=new EmployeeList();
		List<Employee> employees = el.employees;
		
		Double avgSal = employees.stream().collect(Collectors.averagingDouble(Employee::getSal));
		System.out.println("Average Employees salary: " + avgSal); // Output: ~13.93
		
		// Example 2: Averaging a property of custom objects
        List<Product> products = Arrays.asList(
            new Product("Milk", 3.60),
            new Product("Eggs", 1.20),
            new Product("Olive oil", 37.0)
        );
        
        Double averagePrice = products.stream()
                .collect(Collectors.averagingDouble(Product::getPrice));
        System.out.println("Average product price: " + averagePrice); // Output: ~13.93
		
        
        //numbers.stream().collect(Collectors.groupingBy(Employee::getSal));
        
        Collector<Employee, ?, Map<String, List<Employee>>> groupingBy = Collectors.groupingBy(Employee::getDeptName);
        
        System.out.println(groupingBy);
        
        Map<String, List<Employee>> groupingByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDeptName));
        System.out.println("groupingByDept : "+groupingByDept);
        
        System.out.println("========Employees by group by dept======== : ");
        groupingByDept.forEach((deptName, list)->{
        	System.out.println("========DeptName======== : "+deptName);
        	list.forEach(Employee :: toString);
        });
	}

}
