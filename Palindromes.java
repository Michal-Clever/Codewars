public class Palindromes {
    public static int longestPalindrome(final String s) {
        char[] symbols = new char[s.length() + 1];
        symbols = s.toCharArray();
        int longest = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (symbols[i] == symbols[j] && i != j && i < j) {
                    String temp = "";
                    if (j == s.length() - 1) {
                        temp = s.substring(i);
                    }
                    if (j != s.length() - 1) {
                        temp = s.substring(i, j + 1);
                    }
                    String anotherTemp = new StringBuilder(temp).reverse().toString();
                    if (temp.equals(anotherTemp) && temp.length() > longest) {
                        longest = temp.length();
                    }
                }
            }
        }
        if (s.length() == 0) {
            return 0;
        }
        return longest;
    }
}



//        Longest Palindrome
//        Find the length of the longest substring in the given string s that is the same in reverse.
//
//        As an example, if the input was “I like racecars that go fast”, the substring (racecar) length would be 7.
//
//        If the length of the input string is 0, the return value must be 0.
//
//        Example:
//        "a" -> 1
//        "aab" -> 2
//        "abcde" -> 1
//        "zzbaabcd" -> 4
//        "" -> 0
