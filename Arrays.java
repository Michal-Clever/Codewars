public class Arrays {
    public static int findSmallest(final int[] numbers, final String toReturn) {
        int smallest = numbers[0];
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
                index = i;
            }
        }
        if (toReturn.equals("value")) {
            return smallest;
        } else if (toReturn.equals("index")) {
            return index;
        } else {
            return smallest; // default returns value
        }
    }
}

