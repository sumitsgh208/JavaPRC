package com.javaprc.feature11.java08;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Feature03FunctionalInterfacesExample02 {
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("hello", "world");
		List<Integer> lengths = words.stream()
		                             .map(String::length) // Transforms each String to its length (Integer)
		                             .collect(Collectors.toList());
		
		
		System.out.println("lengths : "+lengths);
		
		
		List<List<String>> nestedLists = Arrays.asList(
			    Arrays.asList("apple", "banana"),
			    Arrays.asList("orange", "grape")
			);
			List<String> flattenedList = nestedLists.stream()
			                                        .flatMap(Collection::stream) // Transforms each List<String> to a Stream<String> and flattens
			                                        .collect(Collectors.toList());
			// flattenedList will be ["apple", "banana", "orange", "grape"]
			
			
			System.out.println("flattenedList : "+flattenedList);
		
		
	}

}
