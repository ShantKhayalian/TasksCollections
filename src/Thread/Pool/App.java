package Thread.Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Pool extends Thread {
    private String name;

    public Pool(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting thread: "+name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Thread ended: "+name);
    }

}

public class App {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(8);


        Pool thread1 = new  Pool("Thread 1");
        Pool thread2 = new  Pool("Thread 2");
        Pool thread3 = new  Pool("Thread 3");
        Pool thread4 = new  Pool("Thread 4");
        Pool thread5 = new  Pool("Thread 5");
        Pool thread6 = new  Pool("Thread 6");
        Pool thread7 = new  Pool("Thread 7");
        Pool thread8 = new  Pool("Thread 8");
        Pool thread9 = new  Pool("Thread 9");
        Pool thread10 = new  Pool("Thread 10");
        Pool thread11 = new  Pool("Thread 11");
        Pool thread12 = new  Pool("Thread 12");
        Pool thread13 = new  Pool("Thread 13");
        Pool thread14 = new  Pool("Thread 14");
        Pool thread15 = new  Pool("Thread 15");
        Pool thread16 = new  Pool("Thread 16");


        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);

        executorService.execute(thread5);
        executorService.execute(thread6);
        executorService.execute(thread7);
        executorService.execute(thread8);
        executorService.execute(thread9);
        executorService.execute(thread10);
        executorService.execute(thread11);
        executorService.execute(thread12);
        executorService.execute(thread13);
        executorService.execute(thread14);
        executorService.execute(thread15);
        executorService.execute(thread16);

        executorService.shutdown();

    }

}
