package com.elvin.designmode.abstractfactory.factory;

import com.elvin.designmode.abstractfactory.product.HpKeyboard;
import com.elvin.designmode.abstractfactory.product.HpMouse;
import com.elvin.designmode.abstractfactory.product.IKeyboard;
import com.elvin.designmode.abstractfactory.product.IMouse;

public class HpFactory implements IPcFactory {

	@Override
	public IMouse createMouse() {
		// TODO Auto-generated method stub
		return new HpMouse();
	}

	@Override
	public IKeyboard createKeyboard() {
		// TODO Auto-generated method stub
		return new HpKeyboard();
	}

}
