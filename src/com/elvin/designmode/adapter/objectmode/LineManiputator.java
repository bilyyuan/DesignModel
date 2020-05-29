package com.elvin.designmode.adapter.objectmode;

import com.elvin.designmode.adapter.objectmode.adapter.LineShape;
import com.elvin.designmode.adapter.objectmode.adapter.TextShape;
import com.elvin.designmode.adapter.objectmode.target.Shape;

public class LineManiputator extends Maniputator {
    
    public static void main(String[] args) {
        Shape line = new LineShape();
        Shape text = new TextShape();
        
        line.boundingBox();
        text.boundingBox();
        
        Maniputator maniputator = line.CreateManiputatorr();
        Maniputator maniputator_text = text.CreateManiputatorr();
    }
}

