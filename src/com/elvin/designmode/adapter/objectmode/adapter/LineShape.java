package com.elvin.designmode.adapter.objectmode.adapter;

import javax.swing.Box;

import com.elvin.designmode.adapter.objectmode.Maniputator;
import com.elvin.designmode.adapter.objectmode.target.Shape;

public class LineShape extends Shape {

    @Override
    public Box boundingBox() {
        // TODO Auto-generated method stub
        return new Box(0);
    }

    @Override
    public Maniputator CreateManiputatorr() {
        // TODO Auto-generated method stub
        return null;
    }

}
