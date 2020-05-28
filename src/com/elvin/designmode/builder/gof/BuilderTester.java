package com.elvin.designmode.builder.gof;

public class BuilderTester {
    public static void main(String[] args) {
        IVirtualBuilder builder = new ConcreteBuilder();
        Director director = new Director();
        director.setBuilder(builder);
        director.createComputer();
        
        Computer computer1 = director.getComputer();
        System.out.println(computer1);
        
        builder = new ConcreteBuilder2();
        director.setBuilder(builder);
        director.createComputer();
        
        Computer computer2 = director.getComputer();
        System.out.println(computer2);
        
    }
}
