package com.javaprc.feature11.java08;

import java.util.Optional;

public class Feature11OptionalMainExample01 {
	public static void main(String[] args) {

		String[] str = new String[10]; // Initialize an array of strings with default null values.
		str[5] = "Hello, Optional!"; // Uncomment this line to test with a non-null value.

		Optional<String> checkNull = Optional.ofNullable(str[5]);

		if (checkNull.isPresent()) {

			String word = str[5].toLowerCase();
			System.out.println(word); // Print the lowercase string.
		} else {
			System.out.println("string is null"); // Indicate that the string is null.
		}

	}

}
