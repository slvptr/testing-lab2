package lab2.functions.trigonometric;


import lab2.functions.Func;
import lab2.functions.basic.Sin;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ctg implements Func {
    private double x;
    private Sin sin;
    private Cos cos;

    public void init(double x) {
        this.x = x;
        this.sin = new Sin();
        this.cos = new Cos();
        this.sin.init(x);
        this.cos.init(x);
    }

    @Override
    public double calc(double eps) {
        return cos.calc(eps) / sin.calc(eps);
    }
}
