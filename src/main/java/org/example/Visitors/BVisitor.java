package org.example.Visitors;

import P1.BClass;

public class BVisitor {
    public BVisitor() {
    }
    public void visit(BClass bClass) {
        bClass.setValue("i am of class BClass and i have been visited");
    }
}
