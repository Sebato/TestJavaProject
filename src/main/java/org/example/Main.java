package org.example;

import P1.AClass;
import P1.BClass;
import P2.CClass;

public class Main {
    public static void main(String[] args) {

        AClass a = new AClass();
        a.setA(-5);
        System.out.println(a.getA());

        BClass b = new BClass();
        CClass c = new CClass();

        c.actionWithClassA(a);
        c.actionWithClassB(b);
    }
}