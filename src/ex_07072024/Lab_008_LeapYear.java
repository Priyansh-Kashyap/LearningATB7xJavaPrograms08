package ex_07072024;

import java.util.Scanner;

public class Lab_008_LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Year");
        int year = sc.nextInt();

        if (year % 400 == 0 || year%4==0) {
            System.out.println("This year is Leap Year");
        } else {
            System.out.println("This is non Leap Year");
        }
    }
}

