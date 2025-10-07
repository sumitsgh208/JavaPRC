package com.javaprc.feature06.strings;

public class StringBufferDemo1 {
	public static void main(String[] args) {
		
		//Creating string buffer
		StringBuffer sb=new StringBuffer();
		
		sb.append("Wellcome ");
		sb.append("sumit");
		sb.insert(sb.length()-1, " you are entrooled in Java");
		sb.append(" Thanks");
	}

}
