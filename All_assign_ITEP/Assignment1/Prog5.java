// Write a proram to input the marks of 5 subject of student. then calculate the percentage. if percentage is greater then 60 print you are passed with 1st divistion , if percetnage is between 50 to 59 then print 2nd division, if percentage is between 33 to 49 then print 3rd division otherwise failed. You have print the marksheet with proper formate with total marks obtained and division.
import java.util.Scanner;
public class Prog5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of maths");
        int maths = sc.nextInt();
        System.out.println("enter the marks of Physics");
        int physics = sc.nextInt();
        System.out.println("enter the marks of chemistry");
        int chemistry = sc.nextInt();
        System.out.println("enter the marks of Hindi");
        int hindi = sc.nextInt();
        System.out.println("enter the marks of english");
        int english = sc.nextInt();
        int total= maths+physics+chemistry+hindi+english;
        double percentage= total/5;
        System.out.println("Percentage = " +  percentage);
        String division = (percentage>60)? "1st division" : ((percentage<59)&& 
        (percentage>50)) ? "2nt division" 
        : ((percentage>33)&& (percentage<49))? "3rst division":"you are fail";
          System.out.println(division );
        } 
}
