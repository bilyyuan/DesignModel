package com.elvin.designmode.adapter.dualadaptermode.adapter;

import javax.swing.Box;

import com.elvin.designmode.adapter.dualadaptermode.Maniputator;
import com.elvin.designmode.adapter.dualadaptermode.target.IShape;

public class LineShape implements IShape {

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
