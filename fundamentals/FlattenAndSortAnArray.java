package fundamentals;
import java.util.Arrays;

public class FlattenAndSortAnArray {
    public static int[] flattenAndSort(int[][] array) {
        int length = 0;
        for(int[] line: array)
            length = length + line.length;

        //debug
        System.out.println("length = " + length);

        int[] out = new int[length];

        int i = 0;
        for(int[] line: array)
            for(int cell: line) {
                out[i] = cell;
                i++;
            }

        Arrays.sort(out);

        return out;
    }
}

//    Given a two-dimensional array of integers,
//        return the flattened version of the array with all the integers in the sorted (ascending) order.
//
//        Example:
//
//        Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].