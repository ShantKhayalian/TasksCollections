package OOP.Abstraction.ChatTask;

public class Stuped extends Person {
    public Stuped() {super();
    }

    @Override
    public String Barev(Person person) {
        String barev = getName()+" : " + "Barev " + person.getName();
        return barev;
    }

    @Override
    public void Info() {
        System.out.println("Im anun@ " + getName()+ ", Tariq@" + getAge()+ " es himar mard em");

    }
}
