// W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides. 

import java.util.Scanner;

public class Prog19{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the lengths of the sides of the triangle:");

        System.out.print("Side 1 ");
        double side1 = sc.nextDouble();

        System.out.print("Side 2 ");
        double side2 = sc.nextDouble();

        System.out.print("Side 3 ");
        double side3 = sc.nextDouble();

        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is an equilateral triangle.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is an isosceles triangle.");
        } else {
            System.out.println("The triangle is a scalene triangle.");
        }
    }
    
}
