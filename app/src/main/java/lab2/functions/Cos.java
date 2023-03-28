package lab2.functions;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Cos {
    private double x;

    public double calc(double eps) {
        boolean neg = true;
        while (neg) {
            if (x > 2 * Math.PI) {
                x -= 2 * Math.PI;
            } else if (x < -2 * Math.PI) {
                x += 2 * Math.PI;
            } else {
                neg = false;
            }
        }
        if (Math.abs(x) >= 0 && Math.abs(x) < Math.PI / 2) {
            return Math.sqrt(1 - Math.pow(new Sin(x).calc(eps),2));
        } else if (Math.abs(x) > (double) 3 / 2 * Math.PI && Math.abs(x) <= 2* Math.PI) {
            return Math.sqrt(1 - Math.pow(new Sin(x).calc(eps),2));
        } else {
            return  - Math.sqrt(1 - Math.pow(new Sin(x).calc(eps),2));
        }
    }

    public double calc() {
        return calc(0.01);
    }
}
