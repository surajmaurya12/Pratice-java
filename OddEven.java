
import java.util.*;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("No is Even : " + n);
        } else {
            System.out.println("No is Odd : " + n);
        }
    }
}
