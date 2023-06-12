// Program to convert uppercase to lowercase..
import java.util.Scanner;
class Prog13{
    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter string in uppercase");
    String upperCase = sc.nextLine();
    String lowerCase = upperCase.toLowerCase();
    System.out.println("The result is " +lowerCase);
     }
}