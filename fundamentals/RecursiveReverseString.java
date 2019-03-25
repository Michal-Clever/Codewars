package fundamentals;

public class RecursiveReverseString {


    public String reverse(String str) {
        if (str.length() == 1)
            return str;
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
}
//
//        Classic factorial counting on Javascript
//        function factorial(n) {
//        return n <= 1 ? 1 : n * factorial(n-1)
//        }
//        Your objective is to complete a recursive function reverse() that receives str as String and returns the same string in reverse order
//
//        Rules:
//
//        reverse function should be executed exactly N times. N = length of the input string
//        helper functions are not allowed
//        changing the signature of the function is not allowed
//        Examples:
//
//        reverse("hello world") = "dlrow olleh" (N = 11)
//        reverse("abcd") = "dcba" (N = 4)
//        reverse("12345") = "54321" (N = 5)
//        All tests for this Kata are randomly generated, besides checking the reverse logic they will count how many times the reverse()
//        function has been executed.

