
public class Smallest {

    public static int getSmallest(int number[]) {
        int Smallest = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < number.length; i++) {
            if (Smallest > number[i]) {
                Smallest = number[i];
            }

        }
        return Smallest;
    }

    public static void main(String[] args) {
        int number[] = {5, 8, 19, 6, 5, 1, 7};
        System.out.println("Smallest Value is : " + getSmallest(number));
        //System.out.println("Smallest Value is : " + getSmallest(number));
    }
}
