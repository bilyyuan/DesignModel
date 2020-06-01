package com.elvin.designmode.decorator.standard;

/**
 * 具体装饰角色
 * @author spring
 *
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        // other operation.
        super(component);
    }
    
    @Override 
    public void aOperation() {
        // TODO Auto-generated method stub
        super.aOperation();
        // 具体业务
    }
}
