package com.elvin.designmode.observerpattern.javainnerintegrated;

import java.util.Observable;

/**
 * concrete object
 * 具体的目标类
 * @author spring
 *
 */
public class OilFutures extends Observable {
    private float price;

    public float getPrice() {
        return this.price;
    }
    
    public void setPrice(float price) {
        super.setChanged();
        super.notifyObservers(price);
        this.price = price;
    }
}
