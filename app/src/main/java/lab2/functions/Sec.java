package lab2.functions;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Sec {
    private double x;

    public double calc(double eps) {
        return 1 / new Cos(x).calc(eps);
    }

    public double calc() {
        return calc(0.01);
    }
}
