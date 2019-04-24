package fundamentals;

import java.util.function.UnaryOperator;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class MovesInSquaredStrings {
    public static String diag1Sym(String strng) {
        String[] result = getArray(strng);
        return String.join("\n", result);
    }

    public static String rot90Clock(String strng) {
        String[] result = getArray(strng);
        for (int i = 0; i < result.length; i++) {
            result[i] = new StringBuilder(result[i]).reverse().toString();
        }
        return String.join("\n", result);
    }

    public static String selfieAndDiag1(String strng) {
        String[] main = strng.split("\n");
        String[] fromDiag = getArray(strng);
        for (int i = 0; i < main.length; i++) {
            main[i] = main[i].concat("|").concat(fromDiag[i]);
        }
        return String.join("\n", main);
    }

    public static String oper(UnaryOperator<String> operator, String s) {
        return operator.apply(s);
    }

    private static String[] getArray(String strng) {
        String[] strings = strng.split("\n");
        String[] result = new String[strings.length];
        Arrays.fill(result, "");
        for (String s : strings) {
            for (int i = 0; i < s.length(); i++) {
                result[i] = result[i] + s.charAt(i);
            }
        }
        return result;
    }
}

//    You are given a string of n lines, each substring being n characters long: For example:
//
//        s = "abcd\nefgh\nijkl\nmnop"
//
//        We will study some transformations of this square of strings.
//
//        Symmetry with respect to the main diagonal: diag_1_sym (or diag1Sym or diag-1-sym)
//        diag_1_sym(s) => "aeim\nbfjn\ncgko\ndhlp"
//        Clockwise rotation 90 degrees: rot_90_clock (or rot90Clock or rot-90-clock)
//        rot_90_clock(s) => "miea\nnjfb\nokgc\nplhd"
//        selfie_and_diag1(s) (or selfieAndDiag1 or selfie-and-diag1) It is initial string
//        + string obtained by symmetry with respect to the main diagonal.
//        s = "abcd\nefgh\nijkl\nmnop" -->
//        "abcd|aeim\nefgh|bfjn\nijkl|cgko\nmnop|dhlp"
//        or printed for the last:
//        selfie_and_diag1
//        abcd|aeim
//        efgh|bfjn
//        ijkl|cgko
//        mnop|dhlp
//        #Task:
//
//        Write these functions diag_1_sym, rot_90_clock, selfie_and_diag1
//        and
//
//        high-order function oper(fct, s) where
//
//        fct is the function of one variable f to apply to the string s (fct will be one of diag_1_sym, rot_90_clock, selfie_and_diag1)
//        #Examples:
//
//        s = "abcd\nefgh\nijkl\nmnop"
//        oper(diag_1_sym, s) => "aeim\nbfjn\ncgko\ndhlp"
//        oper(rot_90_clock, s) => "miea\nnjfb\nokgc\nplhd"
//        oper(selfie_and_diag1, s) => "abcd|aeim\nefgh|bfjn\nijkl|cgko\nmnop|dhlp"
//        Notes:
//        The form of the parameter fct in oper changes according to the language. You can see each form according to the language in
//        "Your test cases".
//        It could be easier to take these katas from number (I) to number (IV)
//        Bash Note: The ouput strings should be separated by \r instead of \n. See "Sample Tests".
//        A forthcoming kata will study other tranformations.