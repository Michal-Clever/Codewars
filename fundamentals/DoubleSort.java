package fundamentals;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleSort {
    public static class DoubleSortA {
        public static Object[] dbSort(Object[] a){
            Object[] result = new Object[a.length];
            if (a instanceof Integer[] || a instanceof String[]) {
                Arrays.sort(a);
                result = a;
            } else {
                List<Integer> numbersPart = new ArrayList<>();
                List<String> stringsPart = new ArrayList<>();
                for (Object element : a) {
                    if (element instanceof Integer) {
                        numbersPart.add((Integer) element);
                    } else {
                        stringsPart.add((String) element);
                    }
                }
                Collections.sort(numbersPart);
                Collections.sort(stringsPart);

                for (int i = 0; i  < numbersPart.size(); i++) {
                    result[i] = numbersPart.get(i);
                }
                for (int i = numbersPart.size(); i  < (stringsPart.size() + numbersPart.size()); i++) {
                    result[i] = stringsPart.get((i - numbersPart.size()));
                }
            }
            return result;
        }

}}
//        Simple enough this one - you will be given an array.
//        The values in the array will either be numbers or strings, or a mix of both. You will not get an empty array, nor a sparse one.
//
//        Your job is to return a single array that has first the numbers sorted in ascending order,
//        followed by the strings sorted in alphabetic order. The values must maintain their original type.
//
//        Note that numbers written as strings are strings and must be sorted with the other strings.