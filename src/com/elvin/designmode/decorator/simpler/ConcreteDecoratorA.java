package com.elvin.designmode.decorator.simpler;


public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Decorator decorator) {
        super(decorator);
    }
    
    @Override
    public void aOperation() {
        
    }
}
