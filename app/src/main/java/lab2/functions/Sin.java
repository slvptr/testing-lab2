package lab2.functions;

import lab2.utils.MathUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Sin {
    private double x;

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

    public double calc() {
        return calc(0.01);
    }
}
