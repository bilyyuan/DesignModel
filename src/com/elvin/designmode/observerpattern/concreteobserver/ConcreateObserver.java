package com.elvin.designmode.observerpattern.concreteobserver;

import com.elvin.designmode.observerpattern.observer.Observer;
import com.elvin.designmode.observerpattern.subject.Status;

public class ConcreateObserver extends Observer {
    
    @Override
    public void update(Status status) {
        // TODO Auto-generated method stub
        System.out.print("Status changed as " + status.name());
    }
}
