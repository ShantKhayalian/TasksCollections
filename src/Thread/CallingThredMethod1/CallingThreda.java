package Thread.CallingThredMethod1;

public class CallingThreda {
    public static void main(String[] args) {
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter(20);

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        counter1.start();
        System.out.println("**************************");
        counter2.start();
        endTime = System.currentTimeMillis()-(startTime);
        System.out.println("Fibnal time " + endTime);
    }
}
