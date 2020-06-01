package com.elvin.designmode.decorator.standard;

public class DecoratorTester {

    public static void main(String[] args) {
        
        Component component = new ConcreteComponent();
        Decorator concreteA = new ConcreteDecoratorA(component);
        Decorator concreteB = new ConcreteDecoratorB(concreteA);
    }
}
