// Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check both number is equal or not.
import java.util.Scanner;
class Prog29{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter oprator : ");
    char ch = sc.next().charAt(0);
    
    System.out.print("Enter 1st number : ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd number : ");
    int b = sc.nextInt();
    
     if(ch == '+'){
        System.out.println("Addition of a & b is : "+(a+b));
     }
    else if(ch == '>') {
        if ((a > b))
        System.out.println("a is greater");
    else 
        System.out.println("b is greater");
    
     }
     
    else if (ch == '='){
        if(a == b)
        System.out.println("a and b are equal " );
        else 
        System.out.println("a and b are not equal " );
    }
    else {
        System.out.println("Not a valid operator ");
    }

}
}

