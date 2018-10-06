public class StringBuilderRevers {

    public static void main(String[] args) {

//        String palindrome = "Dot saw I was Tod";
//        System.out.println("1: " + palindrome);
//        palindrome.toUpperCase();
//        System.out.println("2: " + palindrome);
//
//        StringBuilder sb = new StringBuilder(palindrome);
//
//        //   String sba = sb.reverse().toString().toUpperCase();  // reverse it
//
//        System.out.println("Revers: " + sb.reverse().toString().toUpperCase());


        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // put original string in an
        // array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] =
                    palindrome.charAt(i);

        }
        System.out.println(tempCharArray);

        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                    tempCharArray[len - 1 - j];
        }

        String reversePalindrome =
                new String(charArray);
        System.out.println(reversePalindrome);
    }

}
