package com.elvin.designmode.adapter.dualadaptermode.adapter;

import javax.swing.Box;

import com.elvin.designmode.adapter.dualadaptermode.Maniputator;
import com.elvin.designmode.adapter.dualadaptermode.TextManiputator;
import com.elvin.designmode.adapter.dualadaptermode.adaptee.TextView;
import com.elvin.designmode.adapter.dualadaptermode.target.IShape;

public class TextShape extends TextView implements IShape  {
    public TextShape() {
    } 

    @Override
    public Box boundingBox() {
        // TODO Auto-generated method stub
        return getExtent();
    }

    @Override
    public Maniputator CreateManiputatorr() {
        // TODO Auto-generated method stub
        return new TextManiputator();
    }

}
