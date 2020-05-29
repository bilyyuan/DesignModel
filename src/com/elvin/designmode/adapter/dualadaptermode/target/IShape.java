package com.elvin.designmode.adapter.dualadaptermode.target;

import javax.swing.Box;

import com.elvin.designmode.adapter.dualadaptermode.Maniputator;


public interface IShape {
    public Box boundingBox();
    public Maniputator CreateManiputatorr();

}
