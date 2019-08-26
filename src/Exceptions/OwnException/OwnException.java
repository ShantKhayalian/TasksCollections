package Exceptions.OwnException;

public class OwnException {
    public static void main(String[] args) throws AgeException {
        checkAge(19);
        checkAge(15);
        sum();
    }

    private static void sum() {
        System.out.println(10+20);
    }

   /* private static void checkAge(int age) throws AgeException {
        if(age < 18){
            throw new AgeException(age);
        }
    }*/

    private static void checkAge(int age) {
        if(age < 18){
            try {
                throw new AgeException(age);
            } catch (AgeException e) {
                System.out.println(e);
            }
        }
    }

}
