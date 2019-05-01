package fundamentals;

public class DryingPotatoes {

    public static void main(String[] args) {
        System.out.println(potatoes(82,127,80));
    }

    public static int potatoes(int p0, int w0, int p1) {
        return w0 * (100 - p0) / (100 - p1);
    }
}
