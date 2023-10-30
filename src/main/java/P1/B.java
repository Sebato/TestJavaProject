package P1;

import org.example.Visitors.BVisitor;

public class B {

    public String value;

    public B() {
        value = "i am of class B";
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void accept(BVisitor visitor) {
        visitor.visit(this);
    }

    public String toString() {
        return "Class B: \n\tvalue:" + value;
    }

}
