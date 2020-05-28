package com.elvin.designmode.builder.gof;

public interface IVirtualBuilder {

    public void confirmBox();
    public void addBoard();
    public void addCPU();
    public void addMemory();
    public void addDisplayCard();
    public void addPower();
    public void addDisk();
    public void connectLines();
    public void addIO();
    public void addDisplay();
    public void addSpeaker();
    
    public Computer getComputer();
}
