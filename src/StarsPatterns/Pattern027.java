package StarsPatterns;

public class Pattern027 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++)
        {
            for (int j = i; j <= 5; j++)
            {
                System.out.print("*");
            }
            for (int k = 1; k <= i*2-2; k++)
            {
                System.out.print(" ");
            }
            for (int l = i; l <= 5; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int k = i*2-2; k < 5*2-2; k++)
            {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
