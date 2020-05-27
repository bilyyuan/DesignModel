package com.elvin.designmode.abstractfactory.factory;

import com.elvin.designmode.abstractfactory.product.DellKeyboard;
import com.elvin.designmode.abstractfactory.product.DellMouse;
import com.elvin.designmode.abstractfactory.product.IKeyboard;
import com.elvin.designmode.abstractfactory.product.IMouse;

public class DellFactory implements IPcFactory {

	@Override
	public IMouse createMouse() {
		// TODO Auto-generated method stub
		return new DellMouse();
	}

	@Override
	public IKeyboard createKeyboard() {
		// TODO Auto-generated method stub
		return new DellKeyboard();
	}


}
