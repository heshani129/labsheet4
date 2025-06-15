
import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
        char c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Grade to see the definition :");
        c = scan.next().charAt(0);
        
        switch(c){
            case 'A': case 'a':
                System.out.println("Excellent");
                break;
                
            case 'B': case 'b':
                System.out.println("Well Done");
                break;
                
            case 'C': case 'c':
                System.out.println("Good");
                break;
                
            case 'D': case 'd':
                System.out.println("Pass");
                break;
                
            case 'F': case 'f':
                System.out.println("Better Try Again");
                break;
                
            default:
                System.out.println("Invalid Grade");
                
                
                
        }

    }
}
