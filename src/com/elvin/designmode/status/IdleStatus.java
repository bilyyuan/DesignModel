package com.elvin.designmode.status;

public class IdleStatus extends Status {

    public IdleStatus(Room room) {
        // TODO Auto-generated constructor stub
        this.mRoom = room;
    }
    @Override
    public void reserve() {
        // TODO Auto-generated method stub
        System.out.println("Idle zoom, reserve success.");
        mRoom.changeStatus(new ResevredStatus(mRoom));
    }

    @Override
    public void checkIn() {
        // TODO Auto-generated method stub

    }

    @Override
    public void cancelReserve() {
        // TODO Auto-generated method stub

    }

    @Override
    public void checkOut() {
        // TODO Auto-generated method stub

    }

}
