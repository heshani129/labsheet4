
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        int n1, n2, add, sub, mul, div;
        char c;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        n1 = scan.nextInt();

        System.out.println("Enter Second Number: ");
        n2 = scan.nextInt();

        System.out.println("Enter An Operator only + - * / are valid : ");
        c = scan.next().charAt(0);

        switch (c) {

            case '+':
                add = n1 + n2;
                System.out.println("Answer :" + add);
                break;

            case '-':
                sub = n1 - n2;
                System.out.println("Answer :" + sub);
                break;

            case '*':
                mul = n1 * n2;
                System.out.println("Answer :" + mul);
                break;

            case '/':
                div = n1 / n2;
                System.out.println("Answer :" + div);
                break;

            default:
                System.out.println("Invalid Operator!");

        }

    }
}
