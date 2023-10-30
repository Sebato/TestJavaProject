package org.example.Visitors;

import P1.B;

public class BVisitor {
    public BVisitor() {
    }
    public void visit(B b) {
        b.setValue("i am of class B and i have been visited");
    }
}
