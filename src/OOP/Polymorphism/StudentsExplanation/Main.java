package OOP.Polymorphism.StudentsExplanation;

public class Main {
    public static void main(String[] args) {
        Salary s = new Salary("Shant Khayalian", "Arkishti, YE", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();
    }
}
