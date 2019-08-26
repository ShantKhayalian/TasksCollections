package Exceptions.OwnException;

public class AgeException extends Exception {

    private int age;

    public AgeException(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AgeException{" +
                "age=" + age +
                '}';
    }
}
