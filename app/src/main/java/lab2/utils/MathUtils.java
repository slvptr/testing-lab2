package lab2.utils;

public class MathUtils {

    public static long factorial(long x) {
        if (x < 0) throw new IllegalArgumentException("X should be greater that zero");
        if (x == 0) return 1;

        long res = 1;
        for (long i = 1; i <= x; ++i) {
            res *= i;
        }
        return res;
    }
}
