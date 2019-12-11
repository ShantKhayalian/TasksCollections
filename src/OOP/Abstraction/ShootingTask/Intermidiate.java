package OOP.Abstraction.ShootingTask;

public class Intermidiate extends Shooters {
    public Intermidiate(String name, int age, int staj) {
        super(name, age, staj);
    }

    @Override
    public boolean Fire() {
        if (Math.random()<=getStaj()*0.05)
            return true;
        else return false;
    }

    @Override
    public void Info() {
        super.Info();
    }
}

