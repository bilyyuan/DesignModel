package com.elvin.designmode.builder.normal;

public interface IVirtualBuilder {

    public IVirtualBuilder confirmBox(String str);
    // public IVirtualBuilder addBoard(String str);
    // public IVirtualBuilder addCPU(String str);
    public IVirtualBuilder addMemory(String str);
    public IVirtualBuilder addDisplayCard(String str);
    public IVirtualBuilder addPower(String str);
    public IVirtualBuilder addDisk(String str);
    public IVirtualBuilder connectLines(String str);
    public IVirtualBuilder addIO(String str);
    public IVirtualBuilder addDisplay(String str);
    public IVirtualBuilder addSpeaker(String str);
    
    public Computer getComputer();
}
