package Thread.CallingThredMethod1;

public class Counter extends Thread {
    private int number;

    @Override
    public void run() {
        count();
    }

    public Counter(int number) {
        this.number = number;
    }

    private void count(){
        for (int i = 0; i <10 ; i++) {

            System.out.println("this is thread number " + i + " with thread " + number);
        }
    }
}
