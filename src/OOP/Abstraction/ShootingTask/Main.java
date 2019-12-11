package OOP.Abstraction.ShootingTask;

public class Main {
    public static void main(String[] args) {
        Shooters[] krakoxner = {
                new Amatur("Norek1", 18, 1),
                new Intermidiate("Pordzaru1", 25, 5),
                new Advanced("Profi1", 45, 20),
                new Intermidiate("Pordzaru2", 30, 10),
                new Amatur("Norek2", 20, 2)};

        for (Shooters krakox : krakoxner) {
            krakox.Info();
            if (krakox.Fire()) {
                System.out.println("Tirax@ xocela");
                System.exit(1);
            } else System.out.println("Chi kpel");
        }
    }
}
