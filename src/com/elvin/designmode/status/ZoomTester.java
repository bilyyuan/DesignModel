package com.elvin.designmode.status;

public class ZoomTester {
    public static void main(String[] args) {
        Room room = new Room();
        room.checkin();

        room.cancelReserve();

        room.checkin();

        room.checkOut();

        room.reserve();

        room.checkOut();
        
        room.checkin();
        
        room.reserve();
        
        room.cancelReserve();
        
        room.checkOut();
    }
}
