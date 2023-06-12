
// W.A.P to check whether given number is even or odd Without using % operator.public class 

import java.util.Scanner;

public class Prog18{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        

        if ((num & 1) == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
    

