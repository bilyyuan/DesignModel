package com.elvin.designmode.observerpattern.subject.concretesubject;

import com.elvin.designmode.observerpattern.subject.Status;
import com.elvin.designmode.observerpattern.subject.Subject;

public class ConcreteSubject extends Subject {

    public Status getStatus() {
        return mStatus;
    }
    
    public void setStatus(Status status) {
        this.mStatus = status;
        notifyUpdate();
    }
}
