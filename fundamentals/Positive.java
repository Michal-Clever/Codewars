package fundamentals;

public class Positive {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum = sum + 1;
            }
        }
        return sum;
    }
}
