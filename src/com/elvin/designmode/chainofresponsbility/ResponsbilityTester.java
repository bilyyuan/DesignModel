package com.elvin.designmode.chainofresponsbility;

public class ResponsbilityTester {
    public static void main(String[] args) {
        EventHandler clickEvent = new ClickEventHandler();
        EventHandler doubleClickEvent = new DoubleClickEventHandler();
        EventHandler longclickEvent = new LongClickEventHandler();
        EventHandler touchEventHandler = new TouchEventHandler();
        EventHandler moveEvent = new MoveEventHandler();
        
        
        clickEvent.setNext(doubleClickEvent);
        doubleClickEvent.setNext(longclickEvent);
        longclickEvent.setNext(touchEventHandler);
        touchEventHandler.setNext(moveEvent);
        
        clickEvent.handleEvent(EventType.LONG_CLICK);
    }

}
