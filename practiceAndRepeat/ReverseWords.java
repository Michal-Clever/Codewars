package practiceAndRepeat;

public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] array = original.split(" ");

        if (array.length == 0)
            return original;


        int i = 0;
        for (String string : array) {
            array[i] = new StringBuilder(string).reverse().toString();
            i++;
        }

        return String.join(" ", array);
    }
}

//    Complete the function that accepts a string parameter, and reverses each word in the string.
//        All spaces in the string should be retained.
//
//        Examples
//        "This is an example!" ==> "sihT si na !elpmaxe"
//        "double  spaces"      ==> "elbuod  secaps"
