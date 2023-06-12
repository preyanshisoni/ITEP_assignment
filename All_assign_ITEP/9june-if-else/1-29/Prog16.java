//16  Write a java program  to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. 
import java.util.Scanner;
public class Prog16{
public static void main(String[]args){
Scanner sc =  new Scanner(System.in);
System.out.println("Enter 'c' or 'C' to convert fehrenheit to celcius and enter 'f' or 'F' to convert celcius to fehrenheit");
char temp = sc.next().charAt(0);

if(temp=='c'||temp=='C'){
    System.out.println("enter  temperture");
    double fehrenheit = sc.nextDouble();
    double celsius =(fehrenheit - 32) * 5 / 9;
    System.out.println(celsius);
}
if(temp=='f'||temp=='F'){
    System.out.println("enter  temperture");
    double celsius = sc.nextDouble();
    double fahrenheit = (celsius * 9 / 5) + 32;
    System.out.println(fahrenheit);
}
else{
    System.out.println("Invalid !! please check");
}
}
}