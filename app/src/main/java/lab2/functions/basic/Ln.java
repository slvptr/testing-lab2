package lab2.functions.basic;

import lab2.functions.Func;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ln implements Func {
    private double x;

    public void init(double x) {
        this.x = x;
    }

    @Override
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
}
