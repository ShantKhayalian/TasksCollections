package Methods.OverloadMethods;

public class OverloadExample {
    public static void main(String[] args) {
       printSomething();
       printSomething("shant");
       printSomething(43);
       printSomething("shant","khayalian");
       printSomething("shant",43);
       printSomething("shant",43,true);
    }

    public static void printSomething(){
        System.out.println("inside printSomething()");
    }

    public static void printSomething(String name){
        System.out.println("inside printSomething(String name) " + name);
    }

    public static void printSomething(int age){
        System.out.println("printSomething(int age) " + age);
    }

    public static void printSomething(String name , String lastName){
        System.out.println("printSomething(String name , String lastName)" + name + " " + lastName);
    }

    public static void printSomething(String name , int age){
        System.out.println("printSomething(String name , int age) " + name + " age : " + age);
    }

    public static void printSomething(String name , int age, boolean isMan){
        System.out.println("printSomething(String name , int age, boolean isMan) " + name + " age : " + age + " is am man? " + isMan);
    }

}
