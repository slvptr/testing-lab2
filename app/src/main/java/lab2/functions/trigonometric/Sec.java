package lab2.functions.trigonometric;


import lab2.functions.Func;
import lab2.functions.basic.Sin;
import lab2.functions.trigonometric.Cos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Sec implements Func {
    private double x;
    private Cos cos;

    public void init(double x) {
        this.x = x;
        this.cos = new Cos();
        this.cos.init(x);
    }

    @Override
    public double calc(double eps) {
        return 1 / cos.calc(eps);
    }
}
