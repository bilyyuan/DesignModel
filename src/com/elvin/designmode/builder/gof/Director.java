package com.elvin.designmode.builder.gof;

public class Director {

    
    private IVirtualBuilder builder = new ConcreteBuilder();
    
    public void setBuilder(IVirtualBuilder builder) {
        this.builder = builder;
    }
    
    public void createComputer() {
        builder.addBoard();
        builder.addCPU();
        builder.addDisk();
        builder.addDisplay();
        builder.addDisplayCard();
        builder.addIO();
        builder.addMemory();
        builder.addPower();
        builder.addSpeaker();
        builder.confirmBox();
        builder.connectLines();
    }
    
    public Computer getComputer() {
        return builder.getComputer();
    }
}
