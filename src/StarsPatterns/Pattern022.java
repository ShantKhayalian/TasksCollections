package StarsPatterns;

public class Pattern022 {
    public static void main(String[] args) {
       for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {

                if (j == 0 || j == i || i == 5) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 5; i >= 0 ; i--) {
            for (int j = 0; j < i+1; j++) {

                if (j == 0 || j == i || j == 5) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
