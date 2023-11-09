package P1;

import org.example.Visitors.BVisitor;

public class BClass {

    public String value;

    public BClass() {
        value = "i am of class BClass";
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
        return "Class BClass: \n\tvalue:" + value;
    }

}
