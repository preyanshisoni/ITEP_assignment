// prog_12 Perform all relational operation:
import java.util.Scanner;
class Prog12{
    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the first number");
    int a = sc.nextInt();
    
    System.out.println("Enter the second number");
    int b = sc.nextInt();

        boolean result1=(a==b);
        boolean result2=(a<b);
        boolean result3=(a>b);
        boolean result4=(a<=b);
        boolean result5=(a>=b);
        System.out.println("The result is "  + result1);
        System.out.println("The result is "  + result2);
        System.out.println("The result is "  + result3);
        System.out.println("The result is "  + result4);
        System.out.println("The result is "  + result5);
    }
}
