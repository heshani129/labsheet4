
import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
        int marks;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks for check the grade:");
        marks = scan.nextInt();

        if (marks >= 0 && marks < 70) {
            System.out.println("Grade is: D");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade is C");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade is: B");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("Grade is A");
        } else {
            System.out.println("Invalid Marks");
        }

    }

}
