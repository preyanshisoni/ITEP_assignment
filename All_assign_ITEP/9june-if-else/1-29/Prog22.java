//  Write a Java program to check whether a number is divisible by 5 and 11 or not. 

    import java.util.Scanner;

public class Prog22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	 System.out.print(" Enter any Number to Check whether it is Divisible by 5 and 11 : ");
	int	num = sc.nextInt();	
		
		if((num % 5 == 0) && (num % 11 == 0))
		{
		System.out.println(num + " is Divisible by 5 and 11"); 
		}
		else
		{
		System.out.println(num + " is Not Divisible by 5 and 11"); 
		}	


    }
}


