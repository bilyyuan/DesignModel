package com.elvin.designmode.observerpattern.javainnerintegrated;

import java.util.Observer;

public class CrudeOilFutures {
    public static void main(String[] args) {
        // Object
        OilFutures oil = new OilFutures();
        // Observer
        Observer bull = new Bull();
        Observer bear = new Bear();

        // reg
        oil.addObserver(bear);
        oil.addObserver(bull);

        // changed.
        oil.setPrice(8);
        oil.setPrice(-5);
    }
}
