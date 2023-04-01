import java.util.Arrays;

public class CumulativeProduct {
    public static void main(String[] args) {
        int[] arrayNum1 = {5, 3, 4, 2, 0, 8};

        try {
            int product = 1;
            for (int i = 0; i < arrayNum1.length; i++) {
                product *= arrayNum1[i];
                arrayNum1[i] = product;
            }
            System.out.println(Arrays.toString(arrayNum1));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
