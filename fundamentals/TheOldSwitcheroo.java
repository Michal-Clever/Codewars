package fundamentals;

public class TheOldSwitcheroo {

    public static String vowel2Index(String s) {

        String newString = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' ||
                    s.charAt(i) == 'E' ||
                    s.charAt(i) == 'I' ||
                    s.charAt(i) == 'O' ||
                    s.charAt(i) == 'U') {
                newString += i + 1;
            } else {
                newString += s.charAt(i);
            }
        }
        return newString;
    }
}
//Write a function
//vowel2Index(String s)
//that takes in a string and replaces all the vowels [a,e,i,o,u] with their respective positions within that string.
//      E.g:
//Kata.Vowel2Index("this is my string") == "th3s 6s my str15ng"
//Kata.Vowel2Index("Codewars is the best site in the world") == "C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld"