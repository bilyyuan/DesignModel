package com.elvin.designmode.chainofresponsbility;

public class ClickEventHandler implements EventHandler {

    EventHandler mNext;
    @Override
    public void setNext(EventHandler next) {
        // TODO Auto-generated method stub
        this.mNext = next;
    }

    @Override
    public EventHandler getNext() {
        // TODO Auto-generated method stub
        return mNext;
    }

    @Override
    public void handleEvent(EventType type) {
        // TODO Auto-generated method stub
        if (type == EventType.CLICK) {
            System.out.println("Event type: " + type + " is handled by : " + this.getClass().getSimpleName());
        } else {
            getNext().handleEvent(type);
        }
    }

}
