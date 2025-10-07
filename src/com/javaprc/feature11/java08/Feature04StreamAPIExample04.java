package com.javaprc.feature11.java08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Feature04StreamAPIExample04 {
	public static void main(String[] args) {
		
	    List<String> words = Arrays.asList("apple", "banana", "apricot", "berry", "cat");
	    Map<Character, List<String>> groupedByFirstLetter = words.stream()
	            .collect(Collectors.groupingBy(s -> s.charAt(0))); 
	    
	    // Result: {a=[apple, apricot], b=[banana, berry], c=[cat]} 
	    
	    
	    System.out.println("groupedByFirstLetter : "+groupedByFirstLetter);
	    
	    
	    
	    String str=new String("Sumit Kumar Singh");
	    
	    
	    
	}

}
