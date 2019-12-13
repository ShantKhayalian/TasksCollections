package StarsPatterns;

public class Pattern012 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i <= 5; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
