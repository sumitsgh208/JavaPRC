package com.javaprc.feature11.java08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.javaprc.feature00.beans.Employee;

public class Feature04StreamAPIExample01 {
	public static void main(String[] args) {
		
		
		List<Employee>  list=new ArrayList<>();
		
		List<Employee> collect = list.stream().filter(emp-> emp.getSal()>100).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
		Predicate<String> startsWithA = name -> name.startsWith("A");
        Predicate<String> hasLengthFive = name -> name.length() == 5;
     // Combine predicates using and()
        List<String> result = names.stream()
                                  .filter(startsWithA.and(hasLengthFive))
                                  .collect(Collectors.toList());
        
        
        
        
        
        
        
        
	}

}
