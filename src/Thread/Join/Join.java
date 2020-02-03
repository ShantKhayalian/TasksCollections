package Thread.Join;

public class Join {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("inside main ");
        System.out.println("thread 1 stared");
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("inside Thread1 runnable");
            }
        });

        Thread t2 = new Thread(() ->

                System.out.println("inside second thread")

        );
        t.start();
        t.join();
        t2.start();

    }
}
