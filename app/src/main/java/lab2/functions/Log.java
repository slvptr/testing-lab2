package lab2.functions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Log {
    private double a;
    private double b;

    public double calc(double eps) {
        return new Ln(b).calc(eps) / new Ln(a).calc(eps);
    }

    public double calc() {
        return calc(0.01);
    }
}
