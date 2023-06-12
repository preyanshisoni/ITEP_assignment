//  Program to perform arithmetic operation using switch case
import java.util.Scanner;
public class Prog13{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("enter two number");
int num1 = sc.nextInt() ;
int num2 = sc.nextInt() ;
System.out.println("enter your choice (+,-,*,/,%)");
char choice = sc.next().charAt(0);
switch(choice){
case '+': 
System.out.println(num1+num2);
break;
case '-': 
System.out.println(num1-num2);
break;
case '*': 
System.out.println(num1*num2);
break;
case '/': 
System.out.println(num1/num2);
break;
case '%': 
System.out.println(num1%num2);
break;
}
}
}
