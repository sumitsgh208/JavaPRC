package com.javaprc.feature11.java08;

import java.util.HashMap;
import java.util.Map;

public class Feature10ForEachMapExample01 {
	
	public static void main(String[] args) { 
		
        // Create a map of Integer keys and String values  
        Map<Integer, String> map = new HashMap();  
        map.put(1, "One");  
        map.put(2, "Two");  
        map.put(3, "Three");  
        map.put(4, "Four");  
        // Use forEach to iterate over the map and print each key-value pair  
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));  
    }  

}
