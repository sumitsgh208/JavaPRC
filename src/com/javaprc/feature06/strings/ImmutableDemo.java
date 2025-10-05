package com.javaprc.feature06.strings;

public class ImmutableDemo {
	public static void main(String[] args) {
		
		IMutableClassDemoEmployee emp=new IMutableClassDemoEmployee("TXBPS7627D");
		
		
		String pancard = emp.getPancard();
		
		System.out.println("Employee pancard : "+pancard);
		
	}

}
