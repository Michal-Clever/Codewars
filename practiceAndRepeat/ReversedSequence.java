package practiceAndRepeat;

public class ReversedSequence {

    public static int[] reverse(int n) {
        //your code
        int[] res = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = n - i;
        return res;
    }

}
//
//    Get the number n (n>0) to return the reversed sequence from n to 1.
//
//        Example : n=5 >> [5,4,3,2,1]