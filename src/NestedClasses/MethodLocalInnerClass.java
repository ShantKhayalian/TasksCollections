package NestedClasses;

public class MethodLocalInnerClass {
    public static void main(String[] args) {
        Outerclass outer = new Outerclass();
        outer.my_Method();
    }
}

class Outerclass {
    // instance method of the outer class
    void my_Method() {
        int num = 23;

        // method-local inner class
        class MethodInner_Demo {
            public void print() {
                System.out.println("This is method inner class " + num);
            }
        } // end of inner class

        // Accessing the inner class
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();
    }
}
