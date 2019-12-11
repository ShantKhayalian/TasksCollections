package OOP.Abstraction.ShootingTask;

public abstract class Shooters {
    private int staj;
    private String Name;
    private int age;
    public abstract boolean Fire();

    public Shooters() {
    }

    public Shooters( String name, int age, int staj) {
        this.staj = staj;
        Name = name;
        this.age = age;
    }

    public int getStaj() {
        return staj;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }
    public void Info()
    {
        System.out.println("Anun " + Name + " Tariq " + age + " staj " + staj );
    }
}

