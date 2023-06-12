// Program to calculate simple interest
import java.util.Scanner;
public class Prog7{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of principal");
    double principal = sc.nextDouble();
    
    System.out.println("Enter the value of rate");
    double rateOfInterest = sc.nextDouble();

    System.out.println("Enter the time");
    double time = sc.nextDouble();
    
    double SimpleInterest = principal*rateOfInterest*time/100;
     System.out.println("The simple interest is " + SimpleInterest);
    }
}
