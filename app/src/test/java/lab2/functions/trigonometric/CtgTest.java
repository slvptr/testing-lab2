package lab2.functions.trigonometric;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lab2.functions.trigonometric.Ctg;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CtgTest {

    private final double eps = 0.1;

    @Test
    @Parameters({"-1", "1", "-5", "5"})
    public void calc(double x) {
        Ctg ctg = new Ctg();
        ctg.init(x);
        double delta = Math.abs(ctg.calc(eps) - (1 / Math.tan(x)));
        Assert.assertTrue(delta <= eps);
    }
}