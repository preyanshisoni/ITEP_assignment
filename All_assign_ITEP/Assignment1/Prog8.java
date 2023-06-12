//Write a program to swap two number;
import java.util.Scanner;
public class Prog8{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int firstNum = sc.nextInt();
    
    System.out.println("Enter the second number");
    int secondNum = sc.nextInt();
    int thirdNum;
    thirdNum=firstNum;
    firstNum=secondNum;
    secondNum=thirdNum;

System.out.println("After swapping the value of first and second num is");
System.out.println("firstnum = "+firstNum);
System.out.println("secondnum = "+secondNum);

}
}

