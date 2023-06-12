//WAP to enter 2 number and both numbers are equal or not, if not then find out greater number.
import java.util.Scanner;
 class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter 1st number : ");
        int n1=sc.nextInt();
        System.out.printf("Enter 1st number : ");
        int n2=sc.nextInt();

        String s= (n1==n2)?"Given numbers are equal":"Given numbers are not Equal.";
        int g=(n1>n2)?n1:n2;

        System.out.println(s);

        System.out.println("Greatest number between these numbers is : "+g);
        }
    }
