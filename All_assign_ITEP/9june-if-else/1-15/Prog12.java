// 12.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
// INPUT : 1234        OUTPUT : 4321
// INPUT : 5982        OUTPUT : 2895 


import java.util.Scanner;
public class Prog12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit number : ");
        int number = sc.nextInt();

        if ((number >= 1000) && (number <= 9999)) {
            int reverse = 0;
            while (number != 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }
            System.out.println("reverse number is      : " + reverse);
        } else
            System.out.println("Invalid input number ");

}
}