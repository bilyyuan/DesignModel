package com.elvin.designmode.decorator.usage.decorator;

import com.elvin.designmode.decorator.usage.component.Shape;

public class BlackShapeDecorator extends ShapeDecorator {

    public BlackShapeDecorator(Shape shape) {
        super(shape);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        // super.draw();
        // equals shape.draw.
        shape.draw();
        setRedBorder();
    }
    
    private void setRedBorder() {
        System.out.println("Border color: black");
    }
    
}
