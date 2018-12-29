public class ExclamationMarksSeries5 {
    public static String removeBang(String str) {
        String retStr = "";
        for(String s: str.split(" ")) {
            retStr += s.replaceAll("!+$","") + " ";
        }
        return retStr.trim();
    }
}


//
//Description:
//        Remove all exclamation marks from the end of words. Words are separated by spaces in the sentence.
//
//        Examples
//        remove("Hi!") === "Hi"
//        remove("Hi!!!") === "Hi"
//        remove("!Hi") === "!Hi"
//        remove("!Hi!") === "!Hi"
//        remove("Hi! Hi!") === "Hi Hi"
//        remove("!!!Hi !!hi!!! !hi") === "!!!Hi !!hi !hi"