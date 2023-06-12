// prog1. Take values of length and breadth of a rectangle from user and check if it is square or not

import java.util.Scanner;

public class Prog1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }
    }
}
