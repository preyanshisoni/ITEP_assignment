import java.util.Scanner;
public class Prog8{public static void main(String[] args) {
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
        System.out.println("do you have medical certificate ans in 'Y' or 'N");
        char medical = sc.next().charAt(0);
        if(medical=='Y')
        System.out.println("you are allowed");
        else{
            System.out.println("you are not allowed");
        }
}
}