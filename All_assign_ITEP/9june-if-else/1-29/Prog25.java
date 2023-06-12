//25. Write a Java program to calculate profit or loss. 
import java.util.Scanner;
public class Prog25{

    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter C.P : ");
    int cost_price = sc.nextInt();
    System.out.print("Enter S.P : ");
    int selling_price = sc.nextInt();
    System.out.println(" C.P is : " + cost_price);
    System.out.println(" S.P is : " + selling_price);

    if(selling_price > cost_price)
        System.out.print("Profit");
    else if (selling_price < cost_price)
        System.out.print("Loss");
    else
        System.out.print("No Profit , No Loss");

    }
}

