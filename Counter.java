public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int sum = 0;
        for (Boolean i : arrayOfSheeps) {
            if (i == true) {
                sum++;
            }
        }
        return sum;
    }
}
