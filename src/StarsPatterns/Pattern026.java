package StarsPatterns;

public class Pattern026 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int k = i*2; k <= 5*2-1; k++)
            {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1; i<=5-1; i++)
        {
            for (int j = 5-1; j >= i; j--)
            {
                System.out.print("*");
            }
            for (int k = 1; k <= i*2; k++)
            {
                System.out.print(" ");
            }
            for (int l = 5-1; l >= i; l--)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
