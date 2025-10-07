package com.javaprc.feature02.controlstatement;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		
		int num = 0; 
		
		switch (num){ 
		
			case 0:    
				int x=0; Scanner sc=new Scanner(System.in);
				int y=sc.nextInt();
				int z=sc.nextInt();
				if(x>y)
				System.out.println("printing the case 0"); 
				else
				System.out.println("number is 0");    
				break;
            
			case 1:    
	            System.out.println("number is 1");    
	            break;  
	            
            default:    
            	System.out.println(num);  
		
		}
		
		
		
	}

}
