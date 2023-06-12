// Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180. 

import java.util.Scanner;
public class Prog21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three angles of the triangle:");

        System.out.print("Angle 1: ");
        double angle1 = sc.nextDouble();

        System.out.print("Angle 2: ");
        double angle2 = sc.nextDouble();

        System.out.print("Angle 3: ");
        double angle3 = sc.nextDouble();

        double sum = angle1 + angle2 + angle3;

        if (sum == 180) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}

