//65, 85, 70, 90, 105;
import java.util.Scanner;
public class Prog6{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size");
    int size = sc.nextInt();

    System.out.println("Enter first number");
    int first = sc.nextInt();
    
    System.out.println("Enter second number");
    int second = sc.nextInt();
    
    System.out.println("Enter third number");
    int third = sc.nextInt();
    
    System.out.println("Enter fourth  number");
    int fourth = sc.nextInt();

    System.out.println("Enter fifth number");
    int fifth = sc.nextInt();
    double average=(first+second+third+fourth+fifth)/size;
    System.out.println("The  average is " +average);
    
}

}
