package com.elvin.designmode.builder.gof;

/**
 * Game machine configuration.
 * @author spring
 *
 */
public class ConcreteBuilder implements IVirtualBuilder {

    Computer computer;
    /**
     * Add key elements(must set) as constructor parameter
     */
    public ConcreteBuilder() {
        computer = new Computer();
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
        // System.out.println("Add asus board");
        computer.setBoard("ASUS");
    }

    @Override
    public void addCPU() {
        // TODO Auto-generated method stub
        // System.out.println("Add Intel CPU");
        computer.setCpu("Inter 10xxx");
    }

    @Override
    public void addMemory() {
        // TODO Auto-generated method stub
        // System.out.println("Add 16G memory");
        computer.setMemory("16G");
    }

    @Override
    public void addDisplayCard() {
        // TODO Auto-generated method stub
        // System.out.println("Add NVIDA Ultimate DisplayCard");
        computer.setDisplayCard("NVIDA Ultimate");
    }

    @Override
    public void addPower() {
        // TODO Auto-generated method stub
        // System.out.println("Add huntkey power");
        computer.setPower("Huntkey");
    }

    @Override
    public void addDisk() {
        // TODO Auto-generated method stub
        // System.out.println("SAMSUNG 980 Pro SSD");
        computer.setDisk("SAMSUNG 980 Pro");
    }

    @Override
    public void connectLines() {
        // TODO Auto-generated method stub
        // System.out.print("Add connect lines");
        computer.setLines("Lines");
    }
    
    @Override
    public void addIO() {
        // System.out.println("Add Game keyboard and mouse");
        computer.setIo("Game keyboard and mouse");
    }
    
    @Override
    public void addDisplay() {
        // System.out.println("Add 24' display");
        computer.setDisplay("24'");
    }
    
    @Override
    public void addSpeaker() {
        // System.out.print("No speaker");
        computer.setSpeaker("No");;
    }

    
    public Computer getComputer() {
        return computer;
    }
}
