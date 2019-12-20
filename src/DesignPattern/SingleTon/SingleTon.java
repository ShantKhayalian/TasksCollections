package DesignPattern.SingleTon;

public class SingleTon {
    private static SingleTon instance = null;

    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    private SingleTon() {

    }

    public static SingleTon getInstance(){
        if(instance == null){
            instance = new SingleTon();
        }
        return instance;
    }
}
class App{
    public static void main(String[] args) {
        SingleTon x = SingleTon.getInstance();
        SingleTon y = SingleTon.getInstance();

        x.setS("shant");
        y.setS("shant2");
        System.out.println(x.getS());
        System.out.println(y.getS());

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
    }
}
