package recursion;

import java.math.BigInteger;

import static java.math.BigInteger.*;

class Factorial {
    private static long returnResult(long x) {
        return x == 1 ? 1 : x * returnResult(x - 1);
    }
    private static BigInteger returnBigResult(BigInteger x) {
        return x.equals(ZERO) ? ONE : x.multiply(returnBigResult(x.subtract(ONE)));
    }
    static void printResult(int x) {
        System.out.println(x > 20 ? "Wynik: " + returnBigResult(new BigInteger(String.valueOf(x))) : "Wynik: " + returnResult(x));
    }
}
