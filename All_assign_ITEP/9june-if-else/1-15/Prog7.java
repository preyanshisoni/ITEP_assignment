// A student will not be allowed to sit in exam if his/her attendence is less than 75%.
// Take following input from user
// Number of classes held
// Number of classes attended.
// And print
// percentage of class attended
// Is student is allowed to sit in exam or not.
import java.util.Scanner;
public class Prog7{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of classes held");
        int classesHeld = sc.nextInt();

        System.out.print("Enter number of classes attended");
        int classesAttend = sc.nextInt();
 
        double percentage = (classesAttend*100)/classesHeld;
        System.out.println("your percentage is "+percentage);

        if(percentage>=75){
                
                System.out.println("you are allowed to sit in exam");
        }
        else{
                System.out.println("you are not allowed to sit in exam");
        }
}
}