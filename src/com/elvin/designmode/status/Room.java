package com.elvin.designmode.status;

public class Room {
    private Status mStatus;

    public Room() {
        this.mStatus = new IdleStatus(this);
    }

    public void changeStatus(Status status) {
        this.mStatus = status;
    }

    public void reserve() {
        mStatus.reserve();
    }

    public void checkin() {
        mStatus.checkIn();
    }

    public void cancelReserve() {
        mStatus.cancelReserve();
    }

    public void checkOut() {
        mStatus.checkOut();
    }

}