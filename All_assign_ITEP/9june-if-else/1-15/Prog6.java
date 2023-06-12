//6. Write a program to print absolute vlaue of a number entered by user. E.g.-
// INPUT: 1        OUTPUT: 1
// INPUT: -1        OUTPUT: 1
import java.util.Scanner;
public class Prog6{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value");
        int value = sc.nextInt();

if(value<0){
    System.out.println(Math.abs(value));
}
else{
System.out.println(value);
}
}
}