package com.javaprc.feature11.java08;

import java.util.function.Function;

public class Feature03FunctionalInterfacesExample01 {
	public static void main(String[] args) {
        // Define a Function to square an integer
        Function<Integer, Integer> square = x -> x * x;

        // Apply the function
        int result = square.apply(5);
        System.out.println("Square of 5: " + result); // Output: Square of 5: 25

        // Define a Function to convert an integer to its string representation
        Function<Integer, String> intToString = Object::toString;

        // Apply the function
        String strResult = intToString.apply(123);
        System.out.println("Integer to String: " + strResult); // Output: Integer to String: 123
    }

}
