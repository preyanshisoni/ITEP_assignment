import java.util.Scanner;

public class Prog26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for the five subjects:");

        System.out.print("Physics: ");
        double physics = sc.nextDouble();

        System.out.print("Chemistry: ");
        double chemistry = sc.nextDouble();

        System.out.print("Biology: ");
        double biology = sc.nextDouble();

        System.out.print("Mathematics: ");
        double mathematics = sc.nextDouble();

        System.out.print("Computer: ");
        double computer = sc.nextDouble();

        double tMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (tMarks*100)/500;

        String grade;

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else if (percentage >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }

        System.out.println("Your percentage is "+percentage + " and your grade is " 
        +grade);
        
    }
}
