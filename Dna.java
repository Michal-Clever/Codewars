// Zamiana liter

public class Dna {

    public static void main(String[] args) {
        String dna = "GCAT";

        //pierwszy sposób
        String dnaReplace = dna.replace("T", "U");
        System.out.println(dnaReplace);

        //drugi sposób
        char[] arr = dna.toCharArray();
        String rna = "";
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]) == 'T') {
                arr[i] = 'U';
            }
        }
        rna = String.valueOf(arr);
        System.out.println(rna);

    }
}
