package lab2.functions;

import lab2.functions.basic.Ln;
import lab2.functions.basic.Sin;
import lab2.functions.logariphmic.Log10;
import lab2.functions.logariphmic.Log2;
import lab2.functions.trigonometric.*;

public class FunctionsSystem implements Func {

    private double x;
    private final Cos cos;
    private final Csc csc;
    private final Ctg ctg;
    private final Ln ln;
    private final Log10 log10;
    private final Log2 log2;
    private final Sec sec;
    private final Sin sin;
    private final Tg tg;

    public FunctionsSystem() {
        cos = new Cos();
        csc = new Csc();
        ctg = new Ctg();
        ln = new Ln();
        log2 = new Log2();
        log10 = new Log10();
        sec = new Sec();
        sin = new Sin();
        tg = new Tg();
    }

    public void setX(double x) {
        this.x = x;
        cos.setX(x);
        csc.setX(x);
        ctg.setX(x);
        ln.setX(x);
        sec.setX(x);
        sin.setX(x);
        tg.setX(x);
        log2.setX(x);
        log10.setX(x);
    }

    public double getX() {
        return x;
    }

    @Override
    public double calc(double eps) {
        if (x <= 0) {
            return (((((((tg.calc(eps) * sin.calc(eps)) / sec.calc(eps)) / sec.calc(eps)) - sin.calc(eps)) *
                    ctg.calc(eps)) * ((sin.calc(eps) * ctg.calc(eps)) - (sec.calc(eps) + sec.calc(eps)))) /
                    (((sin.calc(eps) + sec.calc(eps)) / Math.pow(tg.calc(eps), 2)) / ((csc.calc(eps) *
                            (sec.calc(eps) + tg.calc(eps))) + tg.calc(eps))));
        }

        return Math.pow(Math.pow(Math.pow(((log10.calc(eps)) - log2.calc(eps)), 2) + log10.calc(eps), 2), 3);
    }
}
