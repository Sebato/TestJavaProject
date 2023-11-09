package P2;

import P1.AClass;
import P1.BClass;
import org.example.Visitors.BVisitor;

public class CClass {

    public String value;


    public CClass() {
        value = "i am of class CClass";
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void actionWithClassA(AClass a) {
        System.out.println("AClass: " + a);
        a.setA(10);
    }

    public void actionWithClassB(BClass bClass) {
        BVisitor visitor = new BVisitor();
        System.out.println("BClass: " + bClass);

        bClass.accept(visitor);
        System.out.println("BClass: " + bClass);
    }
}
