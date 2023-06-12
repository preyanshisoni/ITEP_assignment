// 3. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
// Ask user for their salary and year of service and print the net bonus amount.
import java.util.Scanner;
public class Prog3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your salary please");
        int salary = sc.nextInt();

        System.out.print("How many years do you completed in our company");
        int years = sc.nextInt(); 
    
        if(years>5){
        double bonus= (salary*5)/100;
        System.out.println(salary+bonus);
    }
        else{
        System.out.println(salary);
    }
}
}
