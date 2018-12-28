public class IsnDivisibleBy {

        public static boolean isDivisible(int...numbers){
            int first = numbers[0];
            for (int num : numbers){
                if (num == 0 || first%num != 0)
                    return false;
            }
            return true;
        }
    }

//    Create a function isDivisible(n,...) that checks if the first agrument n is divisible by all other arguments (return true if no other arguments)
//
//        Example:
//
//        isDivisible(6,1,3)--> true because 6 is divisible by 1 and 3
//        isDivisible(12,2)--> true because 12 is divisible by 2
//        isDivisible(100,5,4,10,25,20)--> true
//        isDivisible(12,7)--> false because 12 is not divisible by 7
