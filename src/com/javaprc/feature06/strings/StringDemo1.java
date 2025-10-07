package com.javaprc.feature06.strings;

public class StringDemo1 {
	public static void main(String[] args) {
		
		
		char[] ch={'t','p','o','i','n','t'};    
		String s=new String(ch);    
		
		String str="tpoint";
		String str1=new String(ch); 
		String str2=new String(ch); 
		String s3 = new String("Hello"); // A new string object is created in the heap 
		String s4 = new String("Hello").intern(); // Ensures use of the string pool  
		
		//System.out.println(ch==s); // incompatible type
		
		System.out.println("== demo : "+(s==str));
		System.out.println("================================");
		
		//  both str1 and str2 is being created in heap with different hashcode
		System.out.println("== demo : "+(str1==str2));
		System.out.println("hashcode demo : "+(str1.hashCode()==str2.hashCode()));
		System.out.println("hashcode str1 : "+str1.hashCode());
		System.out.println("hashcode str2 : "+str2.hashCode());
		
		System.out.println("str==str1 demo : "+(str==str1));
		
		System.out.println("================================");
		System.out.println("equals demo : "+str1.equals(str2));
		System.out.println();
		
		
		/**
		 * 
		 	String s1 = "tpoint"; // Creates one object in the String Constant Pool.
		 	String s2 = "tpoint"; // Does not create a new object; reuses the existing "tpoint" in the pool.
			String s3 = new String("tpoint"); // Creates one object in the heap and may also create "tpoint" in the pool.

		  
		 	s1 == s2 returns true (same reference)
			s1 == s3 returns false (different references)
			s1.equals(s3) returns true (same content) 
		 * 
		 * 
		 * 
		 */
	}

}
