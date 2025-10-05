package com.javaprc.feature05.arrays;

import java.util.Arrays;

public class Array1DDemo {
	public static void main(String[] args) {
		
		int[] num= {23,45,9,67,99,39};

		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		Arrays.sort(num);

		System.out.println("\nAfter Sorting ");
		
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
	}

}
