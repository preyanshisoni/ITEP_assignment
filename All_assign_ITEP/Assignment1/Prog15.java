// 15. program to check whether entered character is in uppercase
public class Prog15{
    public static void main(String[] args) {
        int upr = 'A', lwr = 'b';   
        int ascii;  
        ascii = (char)upr + 32;  
        System.out.println(" character in Lower case is:" +ascii);  
        ascii = (char)lwr - 32;  
        System.out.println("  character in the Upper case is: " +ascii);  
    }
}
