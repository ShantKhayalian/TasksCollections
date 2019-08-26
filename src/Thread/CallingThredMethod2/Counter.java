package Thread.CallingThredMethod2;

public class Counter implements Runnable {
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
