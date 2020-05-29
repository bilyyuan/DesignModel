package com.elvin.designmode.adapter.dualadaptermode;

import com.elvin.designmode.adapter.dualadaptermode.adapter.LineShape;
import com.elvin.designmode.adapter.dualadaptermode.adapter.TextShape;
import com.elvin.designmode.adapter.dualadaptermode.target.IShape;

public class LineManiputator extends Maniputator {
    
    public static void main(String[] args) {
        IShape line = new LineShape();
        IShape text = new TextShape();
        
        line.boundingBox();
        text.boundingBox();
        
        Maniputator maniputator = line.CreateManiputatorr();
        Maniputator maniputator_text = text.CreateManiputatorr();
    }
}

