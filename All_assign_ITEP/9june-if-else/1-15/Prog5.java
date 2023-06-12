// 5.Take input of age of 3 people by user and determine oldest and youngest among them
import java.util.Scanner;
public class Prog5 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age of 1st person in year");
        int age1 = sc.nextInt();

        System.out.println("Enter the age of 2nd person in year");
        int age2 = sc.nextInt();

        System.out.println("Enter the age of 3rd  person in year");
        int age3 = sc.nextInt();

if((age1>age2)&&(age1>age3)){
        System.out.println(+age1 +" is oldest");
}

else if((age2>age1)&&(age2>age3)){
        System.out.println(+age2 +" is oldest");
}

else if((age3>age1)&&(age3>age2)){
        System.out.println(+age3 +" is oldest");
}

if((age1<age2)&&(age1<age3)){
        System.out.println(+age1 +" is yougest");
}

else if((age2<age1)&&(age2<age3)){
        System.out.println(+age2 +" is yougest");
}

else if((age3<age1)&&(age3<age2)){
        System.out.println(+age3 +" is yougest");
}


}
}