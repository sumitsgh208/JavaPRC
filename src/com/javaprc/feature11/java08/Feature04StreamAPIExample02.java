package com.javaprc.feature11.java08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.javaprc.feature00.beans.Employee;

public class Feature04StreamAPIExample02 {
public static void main(String[] args) {
		
		
		List<Employee>  list=new ArrayList<>();
		
		List<Employee> collect = list.stream().filter(emp-> emp.getSal()>100).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve","max string length : find programm");
		Predicate<String> startsWithA = name -> name.startsWith("A");
        Predicate<String> hasLengthFive = name -> name.length() == 5;
     // Combine predicates using and()
        List<String> result = names.stream()
                                  .filter(startsWithA.and(hasLengthFive))
                                  .collect(Collectors.toList());
        
        
        
       int len=0; 
        
        Optional<String> max = names.stream().max(Comparator.comparingInt(String::length));
        if(max.isPresent()) {
        	System.out.println("max string length : "+max.get());
        	
        }
        
        Predicate<String> hasLengthMinTwo = name -> name.length() == 2;
        
        boolean allMatch = names.stream().allMatch(hasLengthMinTwo);
        System.out.println("allMatch demo : "+allMatch);
        
        
        Optional<String> reduce = names.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);
        System.out.println("reduce demo : "+reduce);
        
        
        List<String> words = Arrays.asList("apple", "banana", "apricot", "berry", "cat");
        words.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0))); 
        
        // Result: {a=[apple, apricot], b=[banana, berry], c=[cat]}
        
        words.stream()
        .collect(Collectors.groupingBy(s -> s.charAt(0)));
        
        
        
	}

}
