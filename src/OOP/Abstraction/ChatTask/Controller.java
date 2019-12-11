package OOP.Abstraction.ChatTask;

public class Controller {
    int count = 0;

    public void Method(Person[] person) {
        for (int j = 0; j < 5; j++) {
            person[j].Info();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                System.out.println(person[i].Barev(person[j]));
                System.out.println(person[j].Barev(person[i]));
                count++;
                System.out.println(count);

            }

        }
    }
}
