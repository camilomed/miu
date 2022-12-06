package sixClass;

class Parent {
    void myMethod() {
        System.out.println("super class");
    }
}
public class Derived extends Parent {
    void myMethod() {
        System.out.println("derived class");
    }
    public static void main(String[] args) {
        Derived derived = (Derived) new  Parent ();
        derived.myMethod();
    }
}
