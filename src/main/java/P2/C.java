package P2;

import P1.A;
import P1.B;
import org.example.Visitors.BVisitor;

public class C {

    public String value;


    public C() {
        value = "i am of class C";
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void actionWithClassA(A a) {
        System.out.println("A: " + a);
        a.setA(10);
    }

    public void actionWithClassB(B b) {
        BVisitor visitor = new BVisitor();
        System.out.println("B: " + b);

        b.accept(visitor);
        System.out.println("B: " + b);
    }
}
