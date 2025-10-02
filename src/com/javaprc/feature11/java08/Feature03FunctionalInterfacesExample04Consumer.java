package com.javaprc.feature11.java08;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Feature03FunctionalInterfacesExample04Consumer {
	public static void main(String[] args) {
		
        // Consumer to print a string in uppercase
        Consumer<String> printUppercase = s -> System.out.println(s.toUpperCase());
        
        // Consumer to add a prefix and print
        Consumer<String> addPrefixAndPrint = s -> System.out.println("Item: " + s);

        List<String> fruits = Arrays.asList("apple", "banana", "orange");

        // Using Consumer with forEach
        fruits.forEach(printUppercase);

        System.out.println("---");

        // Chaining Consumers with andThen
        Consumer<String> combinedConsumer = addPrefixAndPrint.andThen(printUppercase);
        fruits.forEach(combinedConsumer);
        
        Consumer<Integer> isEven = num -> System.out.println(num+" is an even number : "+(num%2==0));
        System.out.println("---isEven--");
        isEven.accept(129);
        isEven.accept(508);
        
        System.out.println("---isEvenLenthCheck--");
        BiConsumer<Integer,String> isEvenLenthCheck = (num, str)-> System.out.println("string length is greater than len : "+(str.length()>=num));
        isEvenLenthCheck.accept(5, "sumit");
        isEvenLenthCheck.accept(5, "sumit kumar");
        
	}

}
