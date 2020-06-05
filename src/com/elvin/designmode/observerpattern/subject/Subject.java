package com.elvin.designmode.observerpattern.subject;

import java.util.ArrayList;
import java.util.List;

import com.elvin.designmode.observerpattern.observer.Observer;

public abstract class Subject {

    List<Observer> observerList = new ArrayList<>();
    
    public void attach(Observer o) {
        if (!observerList.contains(o)) {
            observerList.add(o);
        }
    }
    
    public void detach(Observer o) {
        observerList.remove(o);
    }
    
    protected Status mStatus;
    protected void notifyUpdate() {
        for (Observer observer : observerList) {
            observer.update(mStatus);
        }
    }
    
    public abstract void setStatus(Status status);
}
