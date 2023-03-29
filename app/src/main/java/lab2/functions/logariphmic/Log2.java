package lab2.functions.logariphmic;

import lab2.functions.Func;
import lab2.functions.basic.Ln;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Log2 implements Func {
    private double x;
    private Ln ln;

    public void init(double x) {
        this.x = x;
        this.ln = new Ln();
        this.ln.init(x);
    }

    @Override
    public double calc(double eps) {
        return new Ln(x).calc(eps) / new Ln(2).calc(eps);
    }
}
