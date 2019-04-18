package fundamentals;

public class DecTools {

    public static int Digits(long n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
//        Determine number of decimal digits in an unsiged integer.
//        For example, 9 is a single digit, 66 has 2 digits and 128685 has 6 digits.
//        Be careful to avoid overflows/underflows.
