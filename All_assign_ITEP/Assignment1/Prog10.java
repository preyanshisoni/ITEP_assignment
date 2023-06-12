// Write to program to find out volume of cylinder.
import java.util.Scanner;
public class Prog10{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the value of radius");
double radius = sc.nextDouble();
System.out.println("enter the value of height");
double height = sc.nextDouble();
double pie = 3.14,volumeOFCylinder;
volumeOFCylinder=pie*radius*radius*height;
System.out.println("The volume of cylinder is " + volumeOFCylinder);

}

}