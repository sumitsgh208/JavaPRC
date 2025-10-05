package com.javaprc.feature11.java08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lam {
	public static void main(String[] args) {
		
	    List<String> words = Arrays.asList("apple", "banana", "apricot", "berry", "cat");
	    Map<Character, List<String>> groupedByFirstLetter = words.stream()
	            .collect(Collectors.groupingBy(s -> s.charAt(0))); 
	    // Result: {a=[apple, apricot], b=[banana, berry], c=[cat]}
		
	    System.out.println(groupedByFirstLetter);
	    
	    
	    int[] arr= {  1,11,112, 3, 39,9,98,89, 41, 4, 50, 5, 6, 600, 673,599 };
	    
	    
	    
	   
	   	
	    // Method 1: Using Arrays.stream()
        List<Integer> list1 = Arrays.stream(arr) // Creates an IntStream
                                   .boxed()           // Boxes each int to Integer
                                   .collect(Collectors.toList());

        
        
        List<String> collect = list1.stream()
        .map(num -> ""+num)
        .collect(Collectors.toList());
        
        Map<Character, List<String>> collect2 = collect.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
	
        System.out.println(collect2);
        
        for(Map.Entry map : collect2.entrySet()) {
        	
        	System.out.println(map);
        	
        	 System.out.println("Key: " + map.getKey() + ", Value: " + map.getValue());
        	 List<String> list=(List<String>) map.getValue();
        	 
        	 System.out.println("--------printing lidt-----------");
        	 System.out.println(list);
        	 
        	 Map<Integer, List<String>> collect3 = list.stream().collect(Collectors.groupingBy(String::length));
        	
        	 System.out.println("--------Grouping by lidt-----------");
        	 System.out.println(collect3);
        }
        
        
        
        
	}

}
