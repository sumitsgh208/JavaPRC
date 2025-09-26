package com.javaprc.feature11.java08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Feature01LambdaExpression01 {
	
	public static void main(String[] args) {
		
		List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "C++");  
		
		 System.out.println("Languages which starts with 'J':");  
		 filter(languages, (str) -> str.startsWith("J"));
	}
	
	public static void filter(List<String> languages, Predicate<String> condition) {
		for(String lan : languages) {
			if(condition.test(lan)) {
				System.out.println(lan + "");
			}
			
		}
		
	}

}
