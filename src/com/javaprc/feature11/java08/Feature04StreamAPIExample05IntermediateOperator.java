package com.javaprc.feature11.java08;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.javaprc.feature00.beans.Employee;
import com.javaprc.feature00.beans.EmployeeList;

public class Feature04StreamAPIExample05IntermediateOperator {
	public static void main(String[] args) {
		
		EmployeeList el=new EmployeeList();
		List<Employee> employees = el.employees;
		
		
		/**  
			filter(Predicate<T>): Selects elements from a stream that match a given condition.

			flatMap(Function<T, Stream<R>>): Transforms each element into a new stream and then "flattens" the resulting streams into a single stream.
			
			sorted(): Sorts the elements in the stream.
			limit(long maxSize): Truncates the stream to a specified maximum size.
			skip(long n): Discards the first n elements of the stream.
			peek(Consumer<T>): Allows you to perform an action on each element as it passes through the stream. It's often used for debugging.
		
		
		*/
		List<Employee> list = employees.stream().filter(emp->emp.getDeptName()=="IT").toList();
		list.forEach(System.out::println);
		//List<Employee> list = employees.stream().filter(emp->emp.getDeptName()=="IT" ).toList();
		
		
		Map<String, Double> avgSalEachDept = employees.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.averagingDouble(Employee::getSal)));
	
		System.out.println(avgSalEachDept);
		
		Double itAvgSal = avgSalEachDept.get("IT");
		System.out.println(itAvgSal);
		
		List<Employee> collect = list.stream().filter(emp-> emp.getSal()>=itAvgSal).collect(Collectors.toList());
	
		System.out.println(collect);
		
		System.out.println("=======================================map==========================================");
		/*  
		map(Function<T, R>): 
		Transforms each element in the stream by applying a function to it, producing a new element.
		
		*/
		List<Employee> collect2 = list.stream().
			map(emp -> { emp.setDeptName("Dept : "+emp.getDeptName()); return emp;})
			.collect(Collectors.toList());
		
		
		collect2.forEach(System.out::println);
		
		
		//list.stream().mapMulti((emp,sal)-> {})
		
		
		System.out.println("=======================================flat map==========================================");
	
		/*
		 	distinct(): Returns a stream with only the unique elements from the original stream.
		 
		 */
		
		//list.stream().fl
		
		
		
	
	
	
		System.out.println("=======================================flat map==========================================");
		
	
	}
	
}
