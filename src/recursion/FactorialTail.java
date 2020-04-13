package recursion;

import java.math.BigInteger;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

class FactorialTail {
    private static long returnResult(long x, long y) {
        return x == 0 ? y : returnResult(x - 1, x * y);
    }
    private static long returnResultWrapper(long n) {
        return returnResult(n, 1);
    }
    static BigInteger returnBigResult(BigInteger x, BigInteger y) {
        return x.equals(ZERO) ? y : returnBigResult(x.subtract(ONE), x.multiply(y));
    }
    private static BigInteger returnBigResultWrapper(BigInteger n) {
        return returnBigResult(n, ONE);
    }
    static void printResult(int x) {
        if (x > 20) {
            System.out.println("Wynik: " + returnBigResultWrapper(new BigInteger(String.valueOf(x))));
        } else {
            System.out.println("Wynik: " + returnResultWrapper(x));
        }
    }
}
