package com.coding4all.prototype;

public class CloneFactory {

	public CreditCard getClone(CreditCard cardSample) {
		return cardSample.makeCopy();
	}
}
