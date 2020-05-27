package com.elvin.designmode.abstractfactory.factory;

import com.elvin.designmode.abstractfactory.product.AsusKeybard;
import com.elvin.designmode.abstractfactory.product.AsusMouse;
import com.elvin.designmode.abstractfactory.product.IKeyboard;
import com.elvin.designmode.abstractfactory.product.IMouse;

public class AsusFactory implements IPcFactory {

	@Override
	public IMouse createMouse() {
		// TODO Auto-generated method stub
		return new AsusMouse();
	}

	@Override
	public IKeyboard createKeyboard() {
		// TODO Auto-generated method stub
		return new AsusKeybard();
	}
}
