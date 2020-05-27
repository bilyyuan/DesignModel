package com.elvin.designmode.abstractfactory.factory;

import com.elvin.designmode.abstractfactory.product.IKeyboard;
import com.elvin.designmode.abstractfactory.product.IMouse;

public interface IPcFactory {
	IMouse createMouse();
	IKeyboard createKeyboard();
}
