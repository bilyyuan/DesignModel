package com.elvin.designmode.decorator.standard;

/**
 * 装饰角色
 * @author spring
 *
 */
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component) {
        // TODO Auto-generated constructor stub
        this.component = component;
    }
    @Override
    public void aOperation() {
        // TODO Auto-generated method stub
        component.aOperation();
    }

}
