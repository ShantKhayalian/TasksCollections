package StarsPatterns;

public class Pattern020 {
    public static void main(String[] args) {
        for (int i=5; i>=1; i--)
        {

            for (int j=1; j <=(i * 2) -1; j++)
            {
                if( j == 1 || j == (i * 2) -1 || i == 5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

            for (int k = 5; k >= i; k--)
            {
                System.out.print(" ");
            }

        }
    }
}
