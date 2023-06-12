//2 .A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
// Suppose, one unit will cost 100.
// Judge and print total cost for user.
import java.util.Scanner;
public class Prog2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("please enter the quantity of item you purchase");
        int quantity = sc.nextInt();
        int total = quantity*100;

        if(total>1000){
        double discount=(total*10)/100;
    
        System.out.println(total-discount);
        }
        else{
        System.out.println(total);
        }
    
    }
}