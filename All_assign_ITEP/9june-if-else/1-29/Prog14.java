//  14. WAP to find lowest number among four different number
import java.util.Scanner;
public class Prog14 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in); 
    System.out.print("Enter the four numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    
    if((a<b)&&(a<c)&&(a<d)){
        System.out.println(+a + " is lowest");

    }
    else if((b<a)&&(b<c)&&(b<d)){
        System.out.println(+b+ " is lowest");

    }
   else if((c<a)&&(c<b)&&(a<d)){
        System.out.println(+c +" is lowest");
    }
    else{
    System.out.println(+c +" is lowest");
    }
}
}
