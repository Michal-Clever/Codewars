package fundamentals;

import java.util.Arrays;


public class DescendingOrder {
    public static int sortDesc(final int num) {
        String finalNumber = "";
        char[] chars = ("" + num).toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            finalNumber += "" + String.valueOf(chars[i]);
        }
        return Integer.parseInt(finalNumber);
    }

}

//    Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order.
//        Essentially, rearrange the digits to create the highest possible number.
//
//        Examples:
//        Input: 21445 Output: 54421
//
//        Input: 145263 Output: 654321
//
//        Input: 1254859723 Output: 9875543221