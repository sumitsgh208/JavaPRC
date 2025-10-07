package com.javaprc.feature01.basics;

public class SingletonClass {

	private static SingletonClass instance;
	
	private SingletonClass() {
        
    }
	
	
	public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass(); // Create instance only if it doesn't exist
        }
        return instance;
    }
}
