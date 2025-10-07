package com.javaprc.feature02.controlstatement;

public class IfElseDemo {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 12; 
		
		if(x+y>20) {
			System.out.println("x + y is greater than 20");
		}
		else {
			System.out.println("x + y is greater than 20");
		}
		
		       

		String city="Delhi";
		
		if(city=="Meerut") {
			System.out.println("city is meerut");
		}
		else if(city == "Noida") {
			System.out.println("city is noida"); 
		}
		else if (city == "Agra") {
			System.out.println("city is agra");
		}
		else if (city == "Delhi") {
			System.out.println("city is Delhi");
		}else {
			System.out.println(city);
		}  
		
		
		
	}

}
