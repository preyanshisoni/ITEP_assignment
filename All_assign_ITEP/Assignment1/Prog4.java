// Write a program to Convert temperature from fahrenheit to celcius.
import java.util.Scanner;
public class Prog4{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the temperature in ferenheit");
    double fehrenheit = sc.nextDouble();
    double celsius = (fehrenheit-32)*5/9;
    System.out.println("The fehrenheit  to celcius is " +  celsius);
    }
}
