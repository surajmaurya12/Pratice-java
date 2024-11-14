
public class fabanicci {

    public static void main(String[] args) {
        int n = 5;
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        System.out.print("Fibonacci Series is : ");
        System.out.print(fib[0] + " ");
        System.out.print(fib[1] + " ");
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + " ");
        }
    }
}
