package com.elvin.designmode.status;

public abstract class Status {
    protected Room mRoom;
    
    public abstract void reserve();
    
    public abstract void checkIn();
    
    public abstract void cancelReserve();
    
    public abstract void checkOut();
}
