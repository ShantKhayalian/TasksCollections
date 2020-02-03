package Thread.Synchronizae;

public class Method {
    public static void main(String[] args) throws InterruptedException {
        MathClass2 mathClass = new MathClass2();
        mathClass.printNumbers(10);
    }

}
class MathClass2
{
    synchronized void printNumbers(int n) throws InterruptedException
    {
        for (int i = 1; i <= n; i++)
        {
            System.out.println(Thread.currentThread().getName() + " :: "+  i);
            Thread.sleep(500);
        }
    }
}
