package Thread.CallingThredMethod2;

public class CallingRunnable {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Counter(10));
        Thread thread2 = new Thread(new Counter(20));

        thread1.start();
        thread2.start();

    }
}
