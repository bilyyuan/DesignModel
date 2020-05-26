package com.elvin.designmode.factorymethod.extra;

import com.elvin.designmode.factorymethod.ISender;

/**
 * This is for demo, no need to add extra package in real.
 * @author spring
 *
 */
public class InstantSender implements ISender{

    @Override
    public void send() {
        // TODO Auto-generated method stub
        System.out.println("This is a Instant Sender.");
    }

}
