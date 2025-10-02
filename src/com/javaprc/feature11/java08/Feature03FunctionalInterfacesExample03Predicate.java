package com.javaprc.feature11.java08;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class Feature03FunctionalInterfacesExample03Predicate {
	public static void main(String[] args) {
		
		// Predicate to check if a number is even
		Predicate<Integer> isEven= num -> num%2==0;
		
        System.out.println("Is 4 even? " + isEven.test(4)); // true
        System.out.println("Is 7 even? " + isEven.test(7)); // false
        
        BiPredicate<Integer, String> isLenthGreater = (len,str) -> str.length()>len;
        
        System.out.println("Is lenth 4 for str : sumit " + isLenthGreater.test(4,"sumit")); // true
        System.out.println("Is lenth 7 for str : sumit " + isLenthGreater.test(7,"sumit")); // true
        
        
        DoublePredicate is = num-> num>2;
        System.out.println("Is 4 is greater than 2 : " + is.test(4)); // true
        System.out.println("Is 1.5 is greater than  2 : " + is.test(1.5)); // true
        
     // Create a LongPredicate to check if a number is greater than 100
        LongPredicate isGreaterThan100 = (longNumber) -> longNumber > 100;

        // Test the predicate
        long testValue1 = 50L;
        long testValue2 = 150L;

        System.out.println(testValue1 + " is greater than 100: " + isGreaterThan100.test(testValue1)); // Output: 50 is greater than 100: false
        System.out.println(testValue2 + " is greater than 100: " + isGreaterThan100.test(testValue2)); // Output: 150 is greater than 100: true
	}

}
