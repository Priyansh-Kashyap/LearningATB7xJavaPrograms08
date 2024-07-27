package ex_07072024;

public class Lab_010_RightTriStarPattern {
    public static void main(String[] args) {

        int k=1;
        for (int i= k; i <=5 ; i++) {

            for (int j = 1; j<=i ; j++) {

                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println("");
            k++;
        }
    }
}
