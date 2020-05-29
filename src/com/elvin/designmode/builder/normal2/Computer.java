package com.elvin.designmode.builder.normal2;

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
    private Computer(ConcreteBuilder builder) {
        this.cpu = builder.cpu;
        this.board = builder.board;
        this.box = builder.box;
        this.memory = builder.memory;
        this.displayCard = builder.displayCard;
        this.disk = builder.disk;
        this.lines = builder.lines;
        this.io = builder.io;
        this.display = builder.display;
        this.power = builder.power;
        this.speaker = builder.speaker;
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

        // Set as final to confirm it initialed, or compile will failed.
        private final String cpu;
        private final String board;
        
        private String box;
        private String memory;
        private String displayCard;
        private String power;
        private String disk;
        private String lines;
        private String io;
        private String display;
        private String speaker;
        
        /**
         * Add key elements(must set) as constructor parameter
         */
        public ConcreteBuilder(String cpu, String board) {
            this.cpu = cpu;
            this.board = board;
        }
        @Override
        public ConcreteBuilder confirmBox(String box) {
            // TODO Auto-generated method stub
            // System.out.println("Prepare ATX Box");
            this.box = box;
            return this;
        }

        @Override
        public ConcreteBuilder addMemory(String memory) {
            // TODO Auto-generated method stub
            // System.out.println("Add 16G memory");
            this.memory = memory;
            return this;
        }

        @Override
        public ConcreteBuilder addDisplayCard(String displayCard) {
            // TODO Auto-generated method stub
            // System.out.println("Add NVIDA Ultimate DisplayCard");
            this.displayCard = displayCard;
            return this;
        }

        @Override
        public ConcreteBuilder addPower(String power) {
            // TODO Auto-generated method stub
            // System.out.println("Add huntkey power");
            this.power = power;
            return this;
        }

        @Override
        public ConcreteBuilder addDisk(String disk) {
            // TODO Auto-generated method stub
            // System.out.println("SAMSUNG 980 Pro SSD");
            this.disk = disk;
            return this;
        }

        @Override
        public ConcreteBuilder connectLines(String lines) {
            // TODO Auto-generated method stub
            // System.out.print("Add connect lines");
            this.lines = lines;
            return this;
        }
        
        @Override
        public ConcreteBuilder addIO(String io) {
            // System.out.println("Add Game keyboard and mouse");
            this.io = io;
            return this;
        }
        
        @Override
        public ConcreteBuilder addDisplay(String display) {
            // System.out.println("Add 24' display");
            this.display = display;
            return this;
        }
        
        @Override
        public ConcreteBuilder addSpeaker(String speaker) {
            // System.out.print("No speaker");
            this.speaker = speaker;
            return this;
        }

        
        public Computer getComputer() {
            return new Computer(this);
        }
    }

}
