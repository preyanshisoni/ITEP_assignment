//  Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
import java.util.Scanner;
public class Prog9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character");
        char ch = sc.next().charAt(0);


        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("character is upper case");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("character is lower case");
        } 

        }
    }
