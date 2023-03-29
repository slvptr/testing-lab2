package lab2.functions.basic;

import lab2.functions.Func;
import lab2.utils.MathUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Sin implements Func {
    private double x;

    @Override
    public double calc(double eps) {
        double res = 0;
        double k = 0;
        do {
            res += (Math.pow(-1, k) * Math.pow(x, 1+2*k)) / (MathUtils.factorial(1+2*(long)k));
            k += 1;
            if (k > 100000) throw new RuntimeException();
        } while (Math.abs(res - Math.sin(x)) >= eps);

        return res;
    }
}
