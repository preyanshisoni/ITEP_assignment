// Write A Java Program to input an age of person and check he is eligible for voting or not.
import java.util.Scanner;
class Prog3{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your age");
    int age = sc.nextInt();
    String eligible = (age>=18) ?  "eligible" : "Noteligible";
    System.out.println(eligible);
    
    }
}
