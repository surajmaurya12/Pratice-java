
public class Pair {

    public static void pairs(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i; j < numbers.length - 1; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j + 1] + ")" + " ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        pairs(numbers);
    }
}
