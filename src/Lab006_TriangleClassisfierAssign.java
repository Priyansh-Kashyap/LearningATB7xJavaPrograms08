import java.util.Scanner;

public class Lab006_TriangleClassisfierAssign {
    public static void main(String[] args) {

        //// Write a program that classifies a triangle based on its side lengths.
        //
        //// Given three input values representing the lengths of the sides, determine
        //
        //
        //
        //// if the triangle is equilateral (all sides are equal),
        //
        //// isosceles (exactly two sides are equal), or
        //
        //// scalene (no sides are equal).
        //
        //// Use an if-else statement to classify the triangle.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first side of triangle");
        int first_side = sc.nextInt();

        System.out.println("Enter second side of triangle");
        int second_side = sc.nextInt();

        System.out.println("Enter third side of triangle");
        int third_side = sc.nextInt();

        if (first_side == second_side && first_side == third_side && second_side==third_side) {
            System.out.println("It is an equilateral triangle");
        } else if (first_side == second_side || first_side == third_side || second_side == third_side) {
            System.out.println("Its an equilateral triangle");
        } else {
            System.out.println("Its an scalene triangle");

        }
        sc.close();
    }

}
