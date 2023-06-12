/* 28. Write a java program to input electricity unit charges and calculate total electricity bill according to the given condition: For first 50 units Rs. 0.50/unit. For next 100 units Rs. 0.75/unit. For next 100 units Rs. 1.20/unit. For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill. */
import java.util.Scanner;
class Prog28{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Unit : ");
        int unit = sc.nextInt();
    
    if(unit <= 50){
        float bill = unit * 0.50f ;
        System.out.println("Bill is : " + bill);
    } 
    else if(unit > 50 && unit <= 100){
        float bill = unit * 0.75f ;
        System.out.println("Bill is : " + bill);
    }   
    else if(unit > 100 && unit <= 250){
        float bill = unit * 1.20f ;
        System.out.println("Bill is : " + bill);
    }
    else if( unit > 250){
        float bill = unit * 1.50f ;
        float charge = (bill * 20) / 100.0f ;
        float total_bill = bill + charge ;
        System.out.println("Bill is : " + total_bill);
    }
    }
    
    
    
    
}