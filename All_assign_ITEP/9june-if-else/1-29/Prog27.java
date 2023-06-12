/*27. Write a Java program to input basic salary of an employee and calculate its Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95%  */

import java.util.Scanner;
public class Prog27 {

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic salary : ");
        int salary = sc.nextInt();
       // System.out.println("Basic sallry : "+ salary);
        
        if(salary <= 10000){
            
        float hra = (salary * 20 ) / 100.0f;
        float da = (salary * 80) / 100.0f;
        float gross_salary = salary + hra + da ;
        System.out.println(" HRA          : " + hra);
        System.out.println(" DA           : " + da);
        System.out.println(" Gross Salary : " + gross_salary);

        } 
        else if (salary > 10000 && salary <= 20000){
     
        float hra = (salary * 25 ) / 100.0f;
        float da = (salary * 90) / 100.0f;
        float gross_salary = salary + hra + da ;
        System.out.println(" HRA          : " + hra);
        System.out.println(" DA           : " + da);
        System.out.println(" Gross Salary : " + gross_salary);

            
        }
        else{
       
        float hra = (salary * 30 ) / 100.0f;
        float da = (salary * 95) / 100.0f;
        float gross_salary = salary + hra + da ;
        System.out.println(" HRA          : "  + hra);
        System.out.println(" DA           : " + da);
        System.out.println(" Gross Salary : "   + gross_salary);

            
        }
    }
    
}

