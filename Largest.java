
public class Largest {

    public static int getLagrest(int number[]) {
        int Largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < number.length; i++) {
            if (Largest < number[i]) {
                Largest = number[i];
            }

        }
        return Largest;
    }

    public static void main(String[] args) {
        int number[] = {5, 8, 19, 6, 5, 1, 7};
        System.out.println("Largest Value is : " + getLagrest(number));
        //System.out.println("Smallest Value is : " + getSmallest(number));
    }
}
