package Thread.CallingThreadMethod3;

public class CallingNewThreadInRunnable {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("the thread in " + i);
                }
            }
        }).start();
    }
}
