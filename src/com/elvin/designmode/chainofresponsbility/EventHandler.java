package com.elvin.designmode.chainofresponsbility;

public interface EventHandler {
    void setNext(EventHandler next);

    EventHandler getNext();

    void handleEvent(EventType type);
}
