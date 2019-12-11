package OOP.Abstraction.ChatTask;

public class Pozitiv extends Person {

    public Pozitiv() {super();
    }

    @Override
    public String Barev(Person person) {
        String barev = getName()+" : " + "Voxjuyn " + person.getName();
        return barev;
    }

    @Override
    public void Info() {
        System.out.println("Im anun@ " + getName()+ ", Tariq@ " + getAge()+ " es positiv mard em");

    }
}
