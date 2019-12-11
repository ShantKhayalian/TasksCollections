package OOP.Abstraction.ChatTask;

public class Realist extends Person {
    public Realist() {super();
    }

    @Override
    public String Barev(Person person) {
        String barev="";
        if (person.getAge()<25)
            barev = getName()+" : " + "Barev " + person.getName();
        else barev = getName()+" : " + "Voxjuyn " + person.getName();
        return barev;
    }

    @Override
    public void Info() {
        System.out.println("Im anun@ " + getName()+ ", Tariq@   " + getAge()+ " es realist mard em");

    }
}
