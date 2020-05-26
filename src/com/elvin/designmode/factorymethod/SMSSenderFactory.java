package com.elvin.designmode.factorymethod;

public class SMSSenderFactory implements IFactory {

    @Override
    public ISender produce() {
        // TODO Auto-generated method stub
        return new SMSSender();
    }

}
