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
public class Csc implements Func {
    private double x;
    private Sin sin;

    public void init(double x) {
        this.x = x;
        this.sin = new Sin();
        this.sin.init(x);
    }

    @Override
    public double calc(double eps) {
        return 1 / sin.calc(eps);
    }
}
