package org.example;

import P1.A;
import P1.B;
import P2.C;

public class Main {
    public static void main(String[] args) {

        A a = new A();
        a.setA(-5);
        System.out.println(a.getA());

        B b = new B();
        C c = new C();

        c.actionWithClassA(a);
        c.actionWithClassB(b);
    }
}