// Check given character is vowel or not using switch case ..

import java.util.Scanner;
public class Prog12{
public static void main(String args[]){
Scanner sc=new Scanner(System.in); 
System.out.print("Enter the character");
char ch =sc.next().charAt(0);
switch(ch){
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':

case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
System.out.println(ch+"character is vowel");
break;
default:
    System.out.println("Chracter is not vowel");
}
}
}
