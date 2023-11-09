package P1;

public class AClass {
    private int a;
    private BClass b;

    public AClass() {
        a = 0;
        b = new BClass();
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(BClass b) {
        this.b = b;
    }

    public BClass getB() {
        return b;
    }

    public void print() {
        System.out.println("AClass: " + a);
        System.out.println("BClass: " + b);
    }

    public String toString() {
        return "Class AClass: \n\ta:" + a + "\n\tb: " + b;
    }
}
