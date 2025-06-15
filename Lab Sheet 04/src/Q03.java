
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        n1 = scan.nextInt();
        System.out.println("Enter 2nd Number");
        n2 = scan.nextInt();
        System.out.println("Enter 3rd Number");
        n3 = scan.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.printf("\n %d is a greatest number\n", n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.printf("\n %d is a greatest number\n", n2);
        } else {
            System.out.printf("\n %d is a greatest number\n", n3);
        }

    }

}
