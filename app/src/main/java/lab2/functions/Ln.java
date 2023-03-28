package lab2.functions;

import lab2.utils.MathUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Ln {
    private double x;

    public double calc(double eps) {
        if (x <= 0) throw new IllegalArgumentException();
        double res = 0;
        double k = 1;

        if (Math.abs(-1 + x) <= 1) {
            do {
                res -= (Math.pow(-1, k) * Math.pow(-1 + x, k)) / k;
                k += 1;
                if (k > 100000) throw new RuntimeException();
            } while (Math.abs(res - Math.log(x)) >= eps);
        }
        else {
            res = Math.log(-1 + x);
            do {
                res -= (Math.pow(-1, k) * Math.pow(-1 + x, -k)) / k;
                k += 1;
                if (k > 100000) throw new RuntimeException();
            } while (Math.abs(res - Math.log(x)) >= eps);
        }

        return res;
    }

    public double calc() {
        return calc(0.01);
    }
}
