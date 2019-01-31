package practiceAndRepeat;

public class Factorial {

    public int factorial(int n) {
        if (n < 0 || n > 12)
            throw new IllegalArgumentException();

        int result = 1;

        for (int i = 2; i <= n; ++i) {
            result *= i;
        }

        return result;
    }

}
//
//          W matematyce silnia nieujemnej liczby całkowitej n, oznaczana przez n !,
//        jest iloczynem wszystkich dodatnich liczb całkowitych mniejszych lub równych n.
//        Na przykład: 5! = 5 * 4 * 3 * 2 * 1 = 120. Zgodnie z konwencją wartość 0! jest 1.
//
//        Napisz funkcję do obliczenia silni dla danego wejścia.
//        Jeśli wejście jest poniżej 0 lub powyżej 12, wyrzuć wyjątek typu ArgumentOutOfRangeException(C #)
//        lub IllegalArgumentException(Java) lub RangeException(PHP) lub rzuć RangeError(JavaScript).