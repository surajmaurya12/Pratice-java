
public class duplicate {

    public static void main(String[] args) {
        int n[] = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7};
        int temp[] = new int[n.length];
        int j = 0;
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] != n[i + 1]) {
                temp[j] = n[i];
            }
        }
        temp[j] = n[n.length - 1];
        System.out.println(j);

    }
}
