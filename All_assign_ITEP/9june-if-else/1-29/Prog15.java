import java.util.Scanner;
public class Prog15 {

public static void main(String args[]){
    Scanner sc=new Scanner(System.in); 
    System.out.print("Enter any calender year");
    int year =sc.nextInt();

    if((year%4 != 0)||(year%4==0)&&(year%100!=0)){
       System.out.print("year is leap year");  
    }
    else{
    System.out.println("enter year is not leap year");
    }
}
}

