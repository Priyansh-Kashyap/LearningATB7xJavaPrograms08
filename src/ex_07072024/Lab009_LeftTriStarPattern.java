package ex_07072024;

public class Lab009_LeftTriStarPattern {
    public static void main(String[] args) {
            int k=5;
        for (int i = k; i >= 1; i--) {
            for(int j =1; j<=i; j++) {

                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println("");
            k--;

        }
    }
}



/**   *   *   *
*   *   *
*   *
**/