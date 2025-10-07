package com.javaprc.feature10.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Spliterator;

import com.javaprc.feature00.beans.Employee;
import com.javaprc.feature00.beans.EmployeeList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		// Iterable<Employee> itr=new ArrayList<>();
		
		
		Collection<Employee> coll=new ArrayList<>();
		
		
		
		coll.add(new Employee(56, "Aditya Singh", "IT", "User", 34500));
		System.out.println("add  method demo : "+coll);
		EmployeeList el=new EmployeeList();
		List<Employee> employees = el.employees;
		
		coll.addAll(employees);
		System.out.println("add all method demo : "+coll);
		
		Employee employee56 = new Employee(56, "Aditya Singh", "IT", "User", 34500);
		boolean contains = coll.contains(employee56);
		System.out.println("contains : "+contains); /// need to check
		
		
		boolean containsAll = coll.containsAll(employees);
		
		System.out.println("containsAll : "+containsAll); /// need to check
		
		
		System.out.println("-----------------for each loop -----------------------------");
		coll.forEach(System.out::println);
		
		
		
		
		System.out.println("-----------------to array -----------------------------");
		
		Object[] array = coll.toArray();
		
		for(int i=0;i<array.length;i++) {
			Employee  emp=(Employee)array[i];
			System.out.println(i+" th : "+emp);
		}
		
		
		System.out.println("-----------------spliterator loop -----------------------------");
		
		Spliterator<Employee> spliterator = coll.spliterator();

        System.out.println("Processing elements sequentially:");
        spliterator.forEachRemaining(System.out::println);
		
        
        System.out.println("-----------------spliterator loop -----------------------------");
        
        //coll.toArray(null)
        
        
        
        
	}

}
