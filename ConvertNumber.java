public class ConvertNumber {
    public static void main(String[] args) {
        int[] n = {34854};
        String numStr = String.valueOf(n);
        int digits[] = new int[numStr.length()];
        int counter = 0;
        for (int i = numStr.length() - 1; i >= 0; i--) {
            digits[i] = Integer.parseInt(Character.toString(numStr.charAt(counter++)));
        }
        System.out.println(digits);
    }
}
