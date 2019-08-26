package NestedClasses;

public class StaticNestedClass {
    public static void main(String[] args) {
        Outer.Nested_Demo nested = new Outer.Nested_Demo();
        nested.my_method();
    }
}

class Outer {
    static class Nested_Demo {
        public void my_method() {
            System.out.println("This is my nested class");
        }
    }
}

