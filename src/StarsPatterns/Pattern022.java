package StarsPatterns;

public class Pattern022 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                if( j == 1 || j == i )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i=1; i<=5-1; i++)
        {

            for (int j = 5-1; j >= i; j--)
            {
                if( j == 5-1 || j == i || i == 5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            for (int k = 1; k < i; k++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
