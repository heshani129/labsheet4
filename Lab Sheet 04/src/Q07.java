
import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
        int spd;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your speed for calculate the fine:");
        spd = scan.nextInt();

        if (spd > 80 && spd < 91) {
            System.out.println("Your Fine is: Rs 500");
        } else if (spd > 90 && spd < 101) {
            System.out.println("Your Fine is: Rs 750");
        } else if (spd > 100) {
            System.out.println("Your Fine is: Rs 1000");
        } else {
            System.out.println("No Fine! your speed is under Limit");
        }

    }
}
