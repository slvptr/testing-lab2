package lab2.functions;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Tg {
    private double x;

    public double calc(double eps) {
        return new Sin(x).calc(eps) / new Cos(x).calc(eps);
    }

    public double calc() {
        return calc(0.01);
    }
}
