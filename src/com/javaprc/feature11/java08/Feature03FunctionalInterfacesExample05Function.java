package com.javaprc.feature11.java08;

import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Feature03FunctionalInterfacesExample05Function {
	public static void main(String[] args) {
		// Using a lambda expression to implement Function
		
		Function<String, Integer> stringLength = s-> s.length();
		
		Integer apply = stringLength.apply("sumit");
		Integer apply1 = stringLength.apply("sumit kumar");
		System.out.println("apply : "+apply);
		System.out.println("apply1 : "+apply1);
		System.out.println("----------------------------------------------"); 
		
        // Using a Function to transform a list
        Function<Integer, String> intToString = i -> "Number: " + i;
        System.out.println(intToString.apply(123)); // Output: Number: 123
        
        
        System.out.println("-------------------add than, compose demo---------------------------"); 
        // A function to add 5 to an integer
        Function<Integer, Integer> addFive = x -> x + 5;

        // A function to multiply an integer by 2
        Function<Integer, Integer> multiplyByTwo = x -> x * 2;

        // Use andThen() to perform operations in sequence
        Function<Integer, Integer> addThenMultiply = addFive.andThen(multiplyByTwo);
        Integer result1 = addThenMultiply.apply(10); // First: 10 + 5 = 15, Second: 15 * 2 = 30
        System.out.println("Result of addThenMultiply: " + result1); // Output: Result of addThenMultiply: 30

        // Use compose() to perform operations in the opposite sequence
        Function<Integer, Integer> multiplyThenAdd = addFive.compose(multiplyByTwo);
        Integer result2 = multiplyThenAdd.apply(10); // First: 10 * 2 = 20, Second: 20 + 5 = 25
        System.out.println("Result of multiplyThenAdd: " + result2); // Output: Result of multiplyThenAdd: 2
        
        System.out.println("-------------------identity() demo---------------------------"); 
        
        List<String> fruits = List.of("apple", "banana", "cherry");
        Map<String, Integer> collect = fruits.stream().collect(Collectors.toMap(Function.identity(), str-> str.length()));
        
        System.out.println("collect : "+collect);
        
        System.out.println("---------------------UnaryOperator Demo-------------------------"); 
        
        UnaryOperator<String> uop= str -> "Hello, "+str+" ji";
        String apply2 = uop.apply("Sumit");
        System.out.println("apply2 : "+apply2);
        
        
        System.out.println("--------------------BinaryOperator Demo--------------------------"); 
        BinaryOperator<String> bop = (a, b) -> a + b;
        String apply3 = bop.apply("Sumit","kumar");
        System.out.println("apply3 : "+apply3);
        
        System.out.println("----------------------------------------------"); 
        System.out.println("----------------------------------------------"); 
        
        
	}

}
