package com.elvin.designmode.observerpattern.observer;

import com.elvin.designmode.observerpattern.subject.Status;
import com.elvin.designmode.observerpattern.subject.Subject;

public abstract class Observer {
    public abstract void update(Status status);
}
