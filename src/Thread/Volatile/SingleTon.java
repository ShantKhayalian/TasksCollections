package Thread.Volatile;

public class SingleTon {
    private static volatile SingleTon instance;
    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }

}
