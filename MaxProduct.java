public class MaxProduct {

    public static void main(String[] args) {
        System.out.println(adjacentElementsProduct(new int[]{9, 5, 10, 2, 24, -1, -48}));
    }

    public static int adjacentElementsProduct(int[] array) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < array.length-1; i++)
            ans = Math.max(ans,array[i]*array[i+1]);
        return ans;
    }
}

//        Task
//        Given an array of integers , Find the maximum product obtained from multiplying 2 adjacent numbers in the array.
//
//        Notes
//        Array/list size is at least 2 .
//
//        Array/list numbers could be a mixture of positives , ngatives also zeros .
//
//        Input >> Output Examples
//        adjacentElementsProduct(new int[] {1, 2, 3}); ==> return 6
//        Explanation:
//        The maximum product obtained from multiplying 2 * 3 = 6, and they're adjacent numbers in the array.
//        adjacentElementsProduct(new int[] {9, 5, 10, 2, 24, -1, -48}); ==> return 50
//        Explanation:
//        Max product obtained from multiplying 5 * 10 = 50 .
//
//        adjacentElementsProduct(new int[] {-23, 4, -5, 99, -27, 329, -2, 7, -921}) ==> return -14
//        Explanation:
//        The maximum product obtained from multiplying -2 * 7 = -14, and they're adjacent numbers in the array.
