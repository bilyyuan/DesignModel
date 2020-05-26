package com.elvin.designmode.staticfactory;

public class StaticFactoryTester {
	
	public static void main(String[] args) {
		ISender mailSender = SendFactory.produceMail();
		ISender smsSender = SendFactory.produceSMS();
		
		mailSender.send();
		smsSender.send();
	}

}
