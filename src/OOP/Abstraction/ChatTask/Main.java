package OOP.Abstraction.ChatTask;

public class Main {
    public static void main(String[] args) {
        Person[] marder = {new Pozitiv(), new Stuped(), new Realist(), new Stuped(), new Realist()};
        Controller kontrol=new Controller();
        kontrol.Method(marder);
    }
}
