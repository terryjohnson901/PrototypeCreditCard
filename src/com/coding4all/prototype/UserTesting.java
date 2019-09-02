package com.coding4all.prototype;

public class UserTesting {
	public static void main(String [] args) {
		CloneFactory cardUpdate = new CloneFactory();
		
		BofA pin = new BofA();
		
		BofA cloneBofA = (BofA) cardUpdate.getClone(pin);
		
		System.out.println(pin);
		
		System.out.println(cloneBofA);
		
		System.out.println("Pin Hashcode: "+System.identityHashCode(System.identityHashCode(pin)));
		System.out.println("BofA Hashcode: "+System.identityHashCode(System.identityHashCode(cloneBofA)));
	}

}
