package OOP.Abstraction.ShootingTask;

public class Advanced extends Shooters {
    public Advanced(String name, int age, int staj) {
        super(name, age, staj);
    }

    @Override
    public boolean Fire() {
        if (Math.random()<=(0.9-0.01*getAge()))
            return true;
        else return false;
    }

    @Override
    public void Info() {
        super.Info();

    }
}
