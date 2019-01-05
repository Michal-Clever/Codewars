public class Thirteen {
    private static final int[] seq = new int[]{1,10,9,12,3,4};

    public static long thirt(long n) {

        long v = 0, m = n;
        int p = 0;
        while (m>0) {
            v += (m%10)*seq[p++%6];
            m /= 10;
        }
        return v == n ? v : thirt(v);

    }
}
