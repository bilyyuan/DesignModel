package com.elvin.designmode.observerpattern.simple;

public class RMBRate extends Rate {
    
    @Override
    public void change(int number) {
        // TODO Auto-generated method stub
        for (Company com: companies) {
            com.response(number);
        }
    }
}
