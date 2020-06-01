package com.elvin.designmode.decorator.simpler;

public class DecoratorTester {
    public static void main(String[] args) {

        ConcreteComponent component = new ConcreteDecoratorA(new Decorator(new ConcreteComponent()));
    }
}
