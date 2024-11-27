
import java.util.*;

public class ChaeckNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("No is Positive : " + n);
        } else if (n < 0) {
            System.out.println("No is Negative : " + n);
        } else {
            System.out.println("No is Zero : " + n);
        }
    }
}

//------Output------//
// Enter the no 
// -5
// No is Negative : -5
