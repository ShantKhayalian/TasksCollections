package OOP.Abstraction.ShootingTask;

public class Amatur extends Shooters  {
    public Amatur(String name, int age, int staj) {
        super(name, age, staj);
    }

    @Override
    public boolean Fire() {
        if (Math.random() <= getStaj() * 0.01)
            return true;
        else return false;
    }

    @Override
    public void Info() {
        super.Info();
    }

}
