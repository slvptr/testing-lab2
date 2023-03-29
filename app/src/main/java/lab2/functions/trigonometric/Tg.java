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
public class Tg implements Func {
    private double x;

    @Override
    public double calc(double eps) {
        return new Sin(x).calc(eps) / new Cos(x).calc(eps);
    }
}
