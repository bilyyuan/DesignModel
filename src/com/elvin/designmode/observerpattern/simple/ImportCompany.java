package com.elvin.designmode.observerpattern.simple;

public class ImportCompany implements Company {

    @Override
    public void response(int number) {
        // TODO Auto-generated method stub
        if (number > 0) {
        System.out.println("Import: Rate up, cost down, profile up");
        } else if (number < 0) {
            System.out.println("Import: Rate down, cost up, profile down");
        }
    }

}
