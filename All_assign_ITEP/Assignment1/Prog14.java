// program to convert lowercase to uppercase
import java.util.Scanner;
class Prog14{
    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter string in lowercase");
    String lowerCase = sc.nextLine();
    String upperCase = lowerCase.toUpperCase();
    System.out.println("The result is " + upperCase );
    }
}