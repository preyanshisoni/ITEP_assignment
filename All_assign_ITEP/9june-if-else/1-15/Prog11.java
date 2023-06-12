// 11. Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
// if employee is female, then she will work only in urban areas.
// if employee is a male and age is in between 20 to 40 then he may work in anywhere
// if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
// And any other input of age should print "ERROR".  
import java.util.Scanner;
public class Prog11{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age ");
        int age = sc.nextInt();
        
        System.out.print("are you male or female ans in F or M");
        char gender = sc.next().charAt(0);

        
        System.out.print("are you married or not ans in Y or N");
        char mstatus = sc.next().charAt(0);


        if(gender=='F'){
            System.out.println("you work place is urban area");
        }
        else if(gender=='M')
        if ((age>=20)&&(age<=40)){
            System.out.println("you are allow to work anywhere");
        }
        else if((age>40)&&(age<=60)){
            System.out.println("you are allow to work urban area only");
        }
        else{
            System.out.println("error");
        }
        }


    }