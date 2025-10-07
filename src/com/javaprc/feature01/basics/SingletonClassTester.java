package com.javaprc.feature01.basics;

public class SingletonClassTester {
	public static void main(String[] args) {
		
		
		System.out.println("Hello");
		
		
		SingletonClass instance = SingletonClass.getInstance();
		System.out.println("instance : "+instance.hashCode());
		
		SingletonClass instance1 = SingletonClass.getInstance();
		System.out.println("instance1 : "+instance1.hashCode());
		
		System.out.println("comparing the instances : ");
		System.out.println("instance == instance1 : "+(instance == instance1)); // This will print 'true'
		
	}

}
