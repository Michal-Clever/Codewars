package fundamentals;
import java.util.Arrays;

public class MeanVsMedian {

    public static String meanVsMedian(int[] numbers) {
        Arrays.sort(numbers);

        final double mean = Arrays.stream(numbers).average().getAsDouble();
        final double median = numbers[numbers.length / 2];
        return mean > median ? "mean" : (median > mean ? "median" : "same");
    }

}

//    Your goal is to implement the method meanVsMedian which accepts an odd-length array of integers and returns one of the following:
//
//        'mean' - in case mean value is larger than median value
//        'median' - in case median value is larger than mean value
//        'same' - in case both mean and median share the same value
//        Reminder: Median
//
//        Array will always be valid (odd-length >= 3)