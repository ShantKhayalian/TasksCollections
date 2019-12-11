package StarsPatterns;

public class Pattern008 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 0; k <5; k++)
        {
            for(int g = 0; g < 4-k; g++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
