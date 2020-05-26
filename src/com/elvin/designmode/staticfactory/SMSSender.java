package com.elvin.designmode.staticfactory;

public class SMSSender implements ISender {
	public void send() {
		System.out.println("This is a SMS sender");
	}
}
