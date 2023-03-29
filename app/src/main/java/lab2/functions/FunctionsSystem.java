package lab2.functions;

import lab2.functions.basic.Ln;
import lab2.functions.basic.Sin;
import lab2.functions.logariphmic.Log10;
import lab2.functions.logariphmic.Log2;
import lab2.functions.trigonometric.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.checkerframework.checker.units.qual.C;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FunctionsSystem implements Func {

    private double x;
    private Cos cos;
    private Csc csc;
    private Ctg ctg;
    private Ln ln;
    private Log10 log10;
    private Log2 log2;
    private Sec sec;
    private Sin sin;
    private Tg tg;

    public void init(double x) {
        this.x = x;
        this.cos = new Cos();
        this.csc = new Csc();
        this.ctg = new Ctg();
        this.ln = new Ln();
        this.sec = new Sec();
        this.sin = new Sin();
        this.tg = new Tg();
        this.log2 = new Log2();
        this.log10 = new Log10();

        cos.init(x);
        csc.init(x);
        ctg.init(x);
        ln.init(x);
        sec.init(x);
        sin.init(x);
        tg.init(x);
        log2.init(x);
        log10.init(x);
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
