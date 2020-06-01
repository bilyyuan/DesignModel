package com.elvin.designmode.decorator.usage.decorator;

import com.elvin.designmode.decorator.usage.component.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape shape;
    
    public ShapeDecorator(Shape shape) {
        // TODO Auto-generated constructor stub
        this.shape = shape;
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        shape.draw();
    }

}
