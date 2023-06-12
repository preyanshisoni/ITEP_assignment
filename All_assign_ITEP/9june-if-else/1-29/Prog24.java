// write a Java program to input day number and print week day
import java.util.Scanner;
public class Prog24 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day number (1-7): ");
        int dayNumber = sc.nextInt();

        String weekday;

        if (dayNumber == 1) {
            weekday = "Monday";
        } else if (dayNumber == 2) {
            weekday = "Tuesday";
        } else if (dayNumber == 3) {
            weekday = "Wednesday";
        } else if (dayNumber == 4) {
            weekday = "Thursday";
        } else if (dayNumber == 5) {
            weekday = "Friday";
        } else if (dayNumber == 6) {
            weekday = "Saturday";
        } else if (dayNumber == 7) {
            weekday = "Sunday";
        } else {
            weekday = "Invalid ";
        }

        System.out.println("weekday is: " + weekday);
    }
}


