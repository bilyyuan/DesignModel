package com.elvin.designmode.builder.normal;

/*
 * 
 * Product.
 */
public class Computer {

    /**
     * Let's think cpu & board is master.
     */
    private String cpu;
    private String board;
    private String box;
    private String memory;
    private String displayCard;
    private String disk;
    private String lines;
    private String io;
    private String display;
    private String power;
    private String speaker;
    private Computer() {
    }
    
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisplayCard() {
        return displayCard;
    }

    public void setDisplayCard(String displayCard) {
        this.displayCard = displayCard;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getLines() {
        return lines;
    }

    public void setLines(String lines) {
        this.lines = lines;
    }

    public String getIo() {
        return io;
    }

    public void setIo(String io) {
        this.io = io;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Computer [cpu=" + cpu + ", board=" + board + ", box=" + box + ", memory=" + memory + ", displayCard="
                + displayCard + ", disk=" + disk + ", lines=" + lines + ", io=" + io + ", display=" + display
                + ", power=" + power + ", speaker=" + speaker + "]";
    }

    
    /**
     * @author spring
     *
     */
    public static class ConcreteBuilder implements IVirtualBuilder {

        Computer computer;
        /**
         * Add key elements(must set) as constructor parameter
         */
        public ConcreteBuilder(String cpu, String board) {
            computer = new Computer();
            computer.setBoard(board);
            computer.setCpu(cpu);
        }
        @Override
        public ConcreteBuilder confirmBox(String box) {
            // TODO Auto-generated method stub
            // System.out.println("Prepare ATX Box");
            computer.setBox(box);
            return this;
        }

        @Override
        public ConcreteBuilder addMemory(String memory) {
            // TODO Auto-generated method stub
            // System.out.println("Add 16G memory");
            computer.setMemory(memory);
            return this;
        }

        @Override
        public ConcreteBuilder addDisplayCard(String displayCard) {
            // TODO Auto-generated method stub
            // System.out.println("Add NVIDA Ultimate DisplayCard");
            computer.setDisplayCard(displayCard);
            return this;
        }

        @Override
        public ConcreteBuilder addPower(String power) {
            // TODO Auto-generated method stub
            // System.out.println("Add huntkey power");
            computer.setPower(power);
            return this;
        }

        @Override
        public ConcreteBuilder addDisk(String disk) {
            // TODO Auto-generated method stub
            // System.out.println("SAMSUNG 980 Pro SSD");
            computer.setDisk(disk);
            return this;
        }

        @Override
        public ConcreteBuilder connectLines(String lines) {
            // TODO Auto-generated method stub
            // System.out.print("Add connect lines");
            computer.setLines(lines);
            return this;
        }
        
        @Override
        public ConcreteBuilder addIO(String io) {
            // System.out.println("Add Game keyboard and mouse");
            computer.setIo(io);
            return this;
        }
        
        @Override
        public ConcreteBuilder addDisplay(String display) {
            // System.out.println("Add 24' display");
            computer.setDisplay(display);
            return this;
        }
        
        @Override
        public ConcreteBuilder addSpeaker(String speaker) {
            // System.out.print("No speaker");
            computer.setSpeaker(speaker);
            return this;
        }

        
        public Computer getComputer() {
            return computer;
        }
    }

}
