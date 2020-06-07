package com.elvin.designmode.observerpattern.simple;

public class RMDRateTester {
    
    
    public static void main(String[] args) {
        Rate rate = new RMBRate();
        Company com1 = new ImportCompany(); 
        Company com2 = new ExportCompany();
        rate.addListener(com1);
        rate.addListener(com2);
        
        rate.change(7);
        rate.change(-5);
    }

}
