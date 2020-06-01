package com.elvin.designmode.decorator.standard;

/**
 * 具体装饰角色
 * @author spring
 *
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
        // other operation.
    }
    
    @Override
    public void aOperation() {
        // TODO Auto-generated method stub
        super.aOperation();
        // 具体业务
    }
}
