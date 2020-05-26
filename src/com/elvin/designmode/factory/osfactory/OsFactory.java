package com.elvin.designmode.factory.osfactory;

import com.elvin.designmode.factory.inter.IOperatingSystem;
import com.elvin.designmode.factory.product.Enterprise;
import com.elvin.designmode.factory.product.HomeBasic;
import com.elvin.designmode.factory.product.HomePremium;
import com.elvin.designmode.factory.product.Professional;
import com.elvin.designmode.factory.product.Starter;
import com.elvin.designmode.factory.product.Ultimate;

public class OsFactory {
	
	public IOperatingSystem getOperationSystem(String type) {
		if (type == null) {
			return null;
		}
		
		if (type.equalsIgnoreCase(Enterprise.class.getSimpleName())) {
			return new Enterprise();
		} else if (type.equalsIgnoreCase(HomeBasic.class.getSimpleName())) {
			return new HomeBasic();
		} else if (type.equalsIgnoreCase(HomePremium.class.getSimpleName())) {
			return new HomePremium();
		} else if (type.equalsIgnoreCase(Professional.class.getSimpleName())) {
			return new Professional();
		} else if (type.equalsIgnoreCase(Starter.class.getSimpleName())) {
			return new Starter();
		} else if (type.equalsIgnoreCase(Ultimate.class.getSimpleName())) {
			return new Ultimate();
		}
		return null;
	}

}
