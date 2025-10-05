package com.javaprc.feature06.strings;


public final class IMutableClassDemoEmployee {
	
	final String pancard; // assigned only once when object is being created

	public IMutableClassDemoEmployee(String pancard) {
		super();
		this.pancard = pancard;
	}

	public String getPancard() {
		return pancard;
	}
	
	
}
