package fundamentals;

public class Digitize {

    public static int[] Digitize(long n) {

        String s = String.valueOf(n);
        int length = s.length();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (s.charAt(length - i - 1)) - 48;
        }
        return array;
    }
}

//    Convert number to reversed array of digits
//        Given a random number:
//
//        C#: long;
//        C++: unsigned long;
//        You have to return the digits of this number within an array in reverse order.
//
//        Example:
//        348597 => [7,9,5,8,4,3]
