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
public class Cos implements Func {
    private double x;
    private Sin sin;

    public void init(double x) {
        this.x = x;
        this.sin = new Sin();
        this.sin.init(x);
    }

    @Override
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
            return Math.sqrt(Math.abs(1 - Math.pow(sin.calc(eps),2)));
        } else if (Math.abs(x) > (double) 3 / 2 * Math.PI && Math.abs(x) <= 2* Math.PI) {
            return Math.sqrt(Math.abs(1 - Math.pow(sin.calc(eps),2)));
        } else {
            return -Math.sqrt(Math.abs(1 - Math.pow(sin.calc(eps),2)));
        }
    }
}
