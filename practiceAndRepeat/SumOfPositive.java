package practiceAndRepeat;

public class SumOfPositive {

    public static int sum(int[] arr) {
        int result = 0;
        String str = "uper";
        str.toUpperCase();
        for (int i : arr) {
            if (i > 0) {
                result += i;
            }
        }
        return result;
    }
}


//
//    You get an array of numbers, return the sum of all of the positives ones.
//
//        Example [1,-4,7,12] => 1 + 7 + 12 = 20
//
//        Note: if there is nothing to sum, the sum is default to 0.