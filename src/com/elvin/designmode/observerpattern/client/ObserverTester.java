package com.elvin.designmode.observerpattern.client;

import com.elvin.designmode.observerpattern.concreteobserver.ConcreateObserver;
import com.elvin.designmode.observerpattern.observer.Observer;
import com.elvin.designmode.observerpattern.subject.Status;
import com.elvin.designmode.observerpattern.subject.Subject;
import com.elvin.designmode.observerpattern.subject.concretesubject.ConcreteSubject;

public class ObserverTester {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreateObserver();
        subject.attach(observer);
        
       
        subject.setStatus(Status.OPENED);
        
    }
}
