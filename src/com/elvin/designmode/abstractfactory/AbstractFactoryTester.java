package com.elvin.designmode.abstractfactory;

import com.elvin.designmode.abstractfactory.factory.DellFactory;
import com.elvin.designmode.abstractfactory.factory.HpFactory;
import com.elvin.designmode.abstractfactory.factory.IPcFactory;
import com.elvin.designmode.abstractfactory.product.IKeyboard;

public class AbstractFactoryTester {
	public static void main(String[] args) {
		
		IPcFactory hpFactory = new HpFactory();
		IKeyboard hpKeyboard = hpFactory.createKeyboard();
		hpKeyboard.sayHi();
		hpFactory.createMouse().sayHi();;
		
		IPcFactory dellFactory = new DellFactory();
		dellFactory.createKeyboard().sayHi();;
		dellFactory.createMouse().sayHi();
	}
}
