package com.elvin.designmode.builder.normal;

public class BuilderTester {
    public static void main(String[] args) {
        String cpu = "Intel";
        String board = "Asus";
        Computer computer = 
                new Computer.ConcreteBuilder(cpu, board).addDisk("Sumsung 980pro")
                .addDisplay("24'")
                .connectLines("lines")
                .addDisplayCard("NVIDA")
                .addIO("Key board & mouse")
                .getComputer();
        
        System.out.println(computer);
    }
}
