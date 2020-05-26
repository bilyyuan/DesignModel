package com.elvin.designmode.factorymethod;

public class SMSSender implements ISender {
	public void send() {
		System.out.println("This is a SMS sender");
	}
}
