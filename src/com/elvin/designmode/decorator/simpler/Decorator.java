package com.elvin.designmode.decorator.simpler;

public class Decorator extends ConcreteComponent{

    ConcreteComponent component;
    public Decorator(ConcreteComponent component) {
        // TODO Auto-generated constructor stub
        this.component = component;
    }
    
    @Override
    public void aOperation() {
        // TODO Auto-generated method stub
        
    }

}
