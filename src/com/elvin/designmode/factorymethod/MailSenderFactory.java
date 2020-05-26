package com.elvin.designmode.factorymethod;

public class MailSenderFactory implements IFactory {
    @Override
    public ISender produce() {
        // TODO Auto-generated method stub
        return new MailSender();
    }
}
