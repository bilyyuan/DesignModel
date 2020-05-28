package com.elvin.designmode.builder.gof;

/**
 * For home configuration.
 * @author spring
 *
 */
public class ConcreteBuilder2 implements IVirtualBuilder {

    Computer computer = null;
    public ConcreteBuilder2() {
        // TODO Auto-generated constructor stub
        this.computer = new Computer();
    }
    @Override
    public void confirmBox() {
        // TODO Auto-generated method stub
        // System.out.println("Prepare ATX Box");
        computer.setBox("ATX");
    }

    @Override
    public void addBoard() {
        // TODO Auto-generated method stub
        // System.out.println("Add MSI board");
        computer.setBoard("MSI");
    }

    @Override
    public void addCPU() {
        // TODO Auto-generated method stub
        // System.out.println("Add Intel CPU");
        computer.setCpu("Inter 87xx");
    }

    @Override
    public void addMemory() {
        // TODO Auto-generated method stub
        // System.out.println("Add 8G memory");
        computer.setMemory("8G");
    }

    @Override
    public void addDisplayCard() {
        // TODO Auto-generated method stub
        // System.out.println("Add NVIDA Basic DisplayCard");
        computer.setDisplayCard("NVIDA Basic");
    }

    @Override
    public void addPower() {
        // TODO Auto-generated method stub
        // System.out.println("Add Golden Field power");
        computer.setPower("Golden Field");
    }

    @Override
    public void addDisk() {
        // TODO Auto-generated method stub
        // System.out.println("Kingston SSD");
        computer.setDisk("Kingston");
    }

    @Override
    public void connectLines() {
        // TODO Auto-generated method stub
        // System.out.print("Add connect lines");
        computer.setLines("lines");
    }
    
    @Override
    public void addIO() {
        // System.out.println("Add home keyboard and mouse");
        computer.setIo("Home keyboard and mouse");
    }
    
    @Override
    public void addDisplay() {
        // System.out.println("Add 22' display");
        computer.setDisplay("22'");
    }
    
    @Override
    public void addSpeaker() {
        // TODO Auto-generated method stub
        // System.out.append("Add Sony sound box.");
        computer.setSpeaker("Sony sound box");
    }

    public Computer getComputer() {
        return computer;
    }
}
