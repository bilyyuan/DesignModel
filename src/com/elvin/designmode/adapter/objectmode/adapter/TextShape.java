package com.elvin.designmode.adapter.objectmode.adapter;

import javax.swing.Box;

import com.elvin.designmode.adapter.objectmode.Maniputator;
import com.elvin.designmode.adapter.objectmode.TextManiputator;
import com.elvin.designmode.adapter.objectmode.adaptee.TextView;
import com.elvin.designmode.adapter.objectmode.target.Shape;

public class TextShape extends Shape {
    TextView text;
    public TextShape() {
        this.text = new TextView();
    } 

    @Override
    public Box boundingBox() {
        // TODO Auto-generated method stub
        return text.getExtent();
    }

    @Override
    public Maniputator CreateManiputatorr() {
        // TODO Auto-generated method stub
        return new TextManiputator();
    }

}
