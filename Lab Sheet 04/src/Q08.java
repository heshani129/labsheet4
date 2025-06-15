
import java.util.Scanner;

public class Q08 {

    public static void main(String[] args) {
        float h, sal;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of hours worked in the week :");
        h = scan.nextInt();

        if (h > 55) {
            h = h - 55;
            sal = (h * 100) + (25 * 75) + (30 * 50);
            System.out.println("Your Salary is: Rs. " + sal);
        } else if (h > 30 && h <= 55) {
            h = h - 30;
            sal = (h * 75) + (30 * 50);
            System.out.println("Your Salary is: Rs. " + sal);
        } else if (h > 0 && h <= 30) {
            sal = h * 50;
            System.out.println("Your Salary is: Rs. " + sal);
        } else {
            System.out.println("Invalid Input");
        }

    }
}
