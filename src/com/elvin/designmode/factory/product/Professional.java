package com.elvin.designmode.factory.product;

import com.elvin.designmode.factory.inter.IOperatingSystem;

public class Professional implements IOperatingSystem {

	@Override
	public void publish() {
		// TODO Auto-generated method stub
		System.out.println("This is a Professional version.");
	}

}
