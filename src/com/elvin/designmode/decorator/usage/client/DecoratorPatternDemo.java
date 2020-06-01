package com.elvin.designmode.decorator.usage.client;

import com.elvin.designmode.decorator.usage.component.Shape;
import com.elvin.designmode.decorator.usage.component.concretecomponent.Circle;
import com.elvin.designmode.decorator.usage.component.concretecomponent.Rectangle;
import com.elvin.designmode.decorator.usage.decorator.BlackShapeDecorator;
import com.elvin.designmode.decorator.usage.decorator.RedShapeDecorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        
        System.out.println("Let's draw a red rectangle:");
        Shape redRectorage = new RedShapeDecorator(new Rectangle());
        redRectorage.draw();
        
        System.out.println("\nLet's draw a red circle:");
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
        
        System.out.println("\nLet's draw a black circle:");
        Shape blackCircle = new BlackShapeDecorator(new Circle());
        blackCircle.draw();
    }
}
