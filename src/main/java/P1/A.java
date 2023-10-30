package P1;

public class A {
    private int a;
    private B b;

    public A() {
        a = 0;
        b = new B();
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void print() {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }

    public String toString() {
        return "Class A: \n\ta:" + a + "\n\tb: " + b;
    }
}
