// 18. program to convert days into month , weeks and day
import java.util.Scanner;

public class Prog18 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter days");
    int days = sc.nextShort();
    int year = days/365;
    int weeks = days/7;
    int month = days/30;
    System.out.println("Total number of year is  "+year);
    System.out.println("Total number of weeks is  "+weeks);
    System.out.println("Total number of month is "+month);
    }
}
