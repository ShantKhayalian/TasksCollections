package StarsPatterns;

public class Pattern006 {
    public static void main(String[] args) {
        for(int i=1; i <=5; i++){
            for (int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int k = 9; k>=(i*2)-1; k--){
                System.out.print("*");
            }System.out.println();
        }
    }

}
