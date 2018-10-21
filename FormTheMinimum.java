import java.util.Set;
import java.util.TreeSet;

public class FormTheMinimum {
    public static int minValue(int[] values) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < values.length; i++) {
            set.add(values[i]);
        } // end for
        String result = "";
        for (int c : set) {
            result += c;
        } // end for
        return Integer.parseInt(result);
    } // end minValue
}
