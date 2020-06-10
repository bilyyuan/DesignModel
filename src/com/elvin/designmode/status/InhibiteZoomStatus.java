package com.elvin.designmode.status;

public class InhibiteZoomStatus extends Status {

    public InhibiteZoomStatus(Room room) {
        // TODO Auto-generated constructor stub
        this.mRoom = room;
    }
    @Override
    public void reserve() {
        // TODO Auto-generated method stub
        System.out.println("Inhibite zoom, reserve failed");
    }

    @Override
    public void checkIn() {
        // TODO Auto-generated method stub
        System.out.println("Inhibite zoom, check failed");
    }

    @Override
    public void cancelReserve() {
        // TODO Auto-generated method stub
        System.out.println("Inhibite zoom, reserve failed");
    }

    @Override
    public void checkOut() {
        // TODO Auto-generated method stub
        System.out.println("Inhibite zoom, checkout success");
        mRoom.changeStatus(new IdleStatus(mRoom));
    }

}
