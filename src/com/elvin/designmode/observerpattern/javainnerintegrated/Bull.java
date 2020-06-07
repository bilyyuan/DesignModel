package com.elvin.designmode.observerpattern.javainnerintegrated;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体的观察者 看多
 * @author spring
 *
 */
public class Bull implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        Float price = ((Float)arg).floatValue();
        
        if (price > 0) {
            System.out.println("Bull: Price Up, Good news");
        } else if (price < 0) {
            System.out.println("Bull: Price down, Bad news");
        }
    }
}
