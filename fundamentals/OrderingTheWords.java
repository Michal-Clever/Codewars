package fundamentals;

public class OrderingTheWords {

    public String orderWord(String s) {
        //your great code here:
        if (s == null || "".equals(s)) return "Invalid String!";
        char[] a = s.toCharArray();
        java.util.Arrays.sort(a);
        return String.valueOf(a);
    }
}
//
//        Description:
//        Given a string, you need to write a method that order every letter in this string in ascending order.
//
//        Also, you should validate that the given string is not empty or null. If so, the method should return:
//
//        "Invalid String!";
//        Examples
//        ```java new Ordering().orderWord("hello world") => " dehllloorw" new Ordering().orderWord("bobby") => "bbboy"
//                new Ordering().orderWord("") => "Invalid String!" ``` ```python order_word("hello world") => " dehllloorw" order_word("bobby") => "bbboy"
//                order_word("") => "Invalid String!" ``` ```ruby order_word("hello world") => " dehllloorw" order_word("bobby") => "bbboy" order_word("")
//                => "Invalid String!" ``` ```javascript orderWord("hello world") => " dehllloorw" orderWord("bobby") => "bbboy" order_word("")
//                => "Invalid String!" ```
//        Notes
//        • the given string can be lowercase and uppercase.
//        • the string could include spaces or other special characters like '# ! or ,'
//        Good luck! Hope you enjoy it