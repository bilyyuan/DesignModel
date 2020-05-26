package com.elvin.designmode.factory;

import java.util.ArrayList;
import java.util.List;

import com.elvin.designmode.factory.inter.IOperatingSystem;
import com.elvin.designmode.factory.osfactory.OsFactory;

public class FactoryPatternTester {
	public static void main(String[] args) {
		OsFactory osFactory = new OsFactory();
		
		List<String> products = new ArrayList<>();
		products.add("Enterprise");
		products.add("HomeBasic");
		products.add("HomePremium");
		products.add("Professional");
		products.add("Starter");
		products.add("ultimate");
		
		for (String product : products) {
			IOperatingSystem os = osFactory.getOperationSystem(product);
			os.publish();
		}
	}
	
	
}
