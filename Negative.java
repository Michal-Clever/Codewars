import static java.lang.Math.abs;

public class Negative {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(-abs(x));

        System.out.println((x>0)?-x:x);
    }
}
