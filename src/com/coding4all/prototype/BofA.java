package com.coding4all.prototype;

public class BofA implements CreditCard{
	
	public BofA() {
		System.out.println("BofA Card info is made");
	}
	
	public CreditCard makeCopy() {
		
		System.out.println("BofA Card info is being made");
		BofA BofAObject = null;
		
		try {
			BofAObject = (BofA) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return BofAObject;
	}
	
	public String toString() {
		return "Bank card is updated";
	}

}
