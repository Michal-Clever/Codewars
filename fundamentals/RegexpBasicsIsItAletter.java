package fundamentals;

public class RegexpBasicsIsItAletter {
    public static boolean isLetter(String s) {
        return s.matches("[a-zA-Z]");
    }
}

//    Implement String#letter? (Ruby), StringUtils.isLetter(String) (Java), String.prototype.isLetter() (JavaScript)
//        or letter? (Clojure),
//        which should return true if given object is a single ASCII letter (lower or upper case), false otherwise.