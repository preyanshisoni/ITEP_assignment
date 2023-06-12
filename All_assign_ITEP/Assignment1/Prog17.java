// .17 Program to convert person height from inches to cm.
import java.util.Scanner;
class Prog17{
    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println(" please enter height in inches");
    int height = sc.nextInt();
    float result = height*2.54f;
    System.out.println("The result is " + result);
    }
}

