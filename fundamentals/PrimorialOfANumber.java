package fundamentals;

import java.math.BigInteger;

public class PrimorialOfANumber {
    public static boolean isPrime(int n) {

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int[] primes(int n) {
        int[] prime = new int[n];

        prime[0] = 2;
        int index = 1;

        for (int i = 3; ; i += 2) {
            if (isPrime(i)) {
                prime[index++] = i;
            }
            if (index == n) {
                return prime;
            }
        }
    }

    public static String numPrimorial(int n) {

        BigInteger result = new BigInteger("1");

        int[] prime = primes(n);

        for (int aPrime : prime) {
            result = result.multiply(BigInteger.valueOf(aPrime));
        }

        return result.toString();

    }
}

//    Definition (Primorial Of a Number)
//    Is similar to factorial of a number, In primorial, not all the natural numbers get multiplied,
//        only prime numbers are multiplied to calculate the primorial of a number. It's denoted with P#.
//
//        Task
//        Given a number N , calculate its primorial. !alt  !alt
//
//        Notes
//        Only positive numbers will be passed (N > 0) .
//        Input >> Output Examples:
//        1- numPrimorial (3) ==> return (30)
//        Explanation:
//        Since the passed number is (3) ,Then the primorial should obtained by multiplying 2 * 3 * 5 = 30 .
//
//        Mathematically written as , P3# = 30 .
//        2- numPrimorial (5) ==> return (2310)
//        Explanation:
//        Since the passed number is (5) ,Then the primorial should obtained by multiplying 2 * 3 * 5 * 7 * 11 = 2310 .
//
//        Mathematically written as , P5# = 2310 .
//        3- numPrimorial (6) ==> return (30030)
//        Explanation:
//        Since the passed number is (6) ,Then the primorial should obtained by multiplying 2 * 3 * 5 * 7 * 11 * 13 = 30030 .
//
//        Mathematically written as , P6# = 30030 .
//
