package practiceAndRepeat;

public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        String s = String.valueOf(n);
        int length = s.length();
        int[] array = new int[length];
        for ( int i = 0; i < length; i++){
            array[i] = (int) (s.charAt(length - i - 1)) - 48;
        }
        return array;
    }
}
