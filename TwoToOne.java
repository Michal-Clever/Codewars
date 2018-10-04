public class TwoToOne {
    public static void main(String[] args) {
        //Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters,
        //
        //each taken only once - coming from s1 or s2. #Examples: ``` a = "xyaabbbccccdefww" b = "xxxxyyyyabklmopq" longest(a, b) -> "abcdefklmopqwxy"
        //a = "abcdefghijklmnopqrstuvwxyz" longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" ```
        String s1 = "xyaabbbccccdefww";
        String s2 = "xxxxyyyyabklmopq";

        // Pierwsze rozwiązanie
        StringBuilder sb = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
        System.out.println(sb);

        // Drugie rozwiązanie
        String out = "";
        String s = s1 + s2;
        for (char c = 'a'; c <= 'z'; c++)
        {
            if (s.contains(c + ""))
            {
                out += c;
            }
        }
        System.out.println(out);
    }
}
