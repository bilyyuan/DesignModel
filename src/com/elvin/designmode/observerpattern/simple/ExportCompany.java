package com.elvin.designmode.observerpattern.simple;

public class ExportCompany implements Company {

    @Override
    public void response(int number) {
        // TODO Auto-generated method stub
        if (number > 0) {
        System.out.println("Export: Rate up, income down, profile down");
        } else if (number < 0) {
            System.out.println("Export: Rate down, income up, profile up");
        }
    }

}
