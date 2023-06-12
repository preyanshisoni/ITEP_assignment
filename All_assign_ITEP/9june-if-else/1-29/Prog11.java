// Find even odd using switch case 
import java.util.Scanner;
public class Prog11{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in); 
System.out.print("Enter the number");
int num=sc.nextInt();
switch(num%2){
case 0:
    System.out.println(num+" is a Even");
    break;
case 1:
    System.out.println(num+" is a Odd");
}
}
}  

