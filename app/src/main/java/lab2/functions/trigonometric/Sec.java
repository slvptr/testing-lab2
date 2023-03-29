package lab2.functions.trigonometric;


import lab2.functions.Func;
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

    @Override
    public double calc(double eps) {
        return 1 / new Cos(x).calc(eps);
    }
}
