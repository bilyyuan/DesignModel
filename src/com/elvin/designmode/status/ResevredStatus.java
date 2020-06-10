package com.elvin.designmode.status;

public class ResevredStatus extends Status {

    public ResevredStatus(Room room) {
        // TODO Auto-generated constructor stub
        this.mRoom = room;
    }
    @Override
    public void reserve() {
        // TODO Auto-generated method stub
        System.out.println("Reserve zoom, reserve failed.");
    }

    @Override
    public void checkIn() {
        // TODO Auto-generated method stub
        System.out.println("Reserved room, check in success.");
        mRoom.changeStatus(new InhibiteZoomStatus(mRoom));
    }

    @Override
    public void cancelReserve() {
        // TODO Auto-generated method stub
        System.out.println("Reserved room, reserve success.");
        mRoom.changeStatus(new IdleStatus(mRoom));
    }

    @Override
    public void checkOut() {
        // TODO Auto-generated method stub
        System.out.println("Reserve zoom, do not checkin, so checkout failed.");
    }

}
