package com.elvin.designmode.factorymethod.extra;

import com.elvin.designmode.factorymethod.IFactory;
import com.elvin.designmode.factorymethod.ISender;

public class InstantSenderFactory implements IFactory {

    @Override
    public ISender produce() {
        // TODO Auto-generated method stub
        return new InstantSender();
    }

}
