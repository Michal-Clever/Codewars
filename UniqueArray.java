import java.util.ArrayList;

public class UniqueArray {
    public static int[] unique(int[] integers) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : integers) {
            if(!list.contains(i)) {list.add(i);}
        }
        int[] out = new int[list.size()];
        int count = 0;
        for(Integer i : list) {
            out[count++] = i;
        }
        return out;
    }
}
