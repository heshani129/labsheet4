
import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

        int cp, sp, amount;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the cost price of the product:");
        cp = scan.nextInt();

        System.out.println("Enter the selling price of the product:");
        sp = scan.nextInt();
        amount = sp - cp;

        if (sp > cp) {

            System.out.println("There is a profit of Rs. " + amount);
        } else if (cp > sp) {
            System.out.println("There is a loss of Rs. " + Math.abs(amount));  // function for remove minus sign
        } else {
            System.out.println("There is no profit or loss");
        }

    }
}
