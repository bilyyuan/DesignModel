package com.elvin.designmode.factorymethod;

import com.elvin.designmode.factorymethod.extra.InstantSenderFactory;

public class FactoryMethodTester {
    public static void main(String[] args) {
        
        IFactory factory = new MailSenderFactory();
        ISender sender = factory.produce();
        sender.send();
        
        IFactory factory1 = new SMSSenderFactory();
        ISender sender1 = factory1.produce();
        sender1.send();
        
        // We can simple use new factory.
        IFactory factory2 = new InstantSenderFactory();
        ISender sender2 = factory2.produce();
        sender2.send();
    }
}
