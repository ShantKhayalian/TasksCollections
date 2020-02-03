package Thread.Synchronizae;

public class Block {
    public static void main(String[] args) throws InterruptedException {
        MathClass mathClass = new MathClass();
        mathClass.printNumbers(10);
    }

}
class MathClass
{
    void printNumbers(int n) throws InterruptedException
    {
        synchronized (this)
        {
            for (int i = 1; i <= n; i++)
            {
                System.out.println(Thread.currentThread().getName() + " :: "+  i);
                Thread.sleep(500);
            }
        }
    }
}

