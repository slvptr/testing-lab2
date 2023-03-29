package lab2.functions.trigonometric;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lab2.functions.trigonometric.Sec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class SecTest {

    private final double eps = 0.1;

    @Test
    @Parameters({"0", "-1", "1", "3.14"})
    public void calc(double x) {
        Sec sec = new Sec();
        sec.init(x);
        double delta = Math.abs(sec.calc(eps) - (1 / Math.cos(x)));
        Assert.assertTrue(delta <= eps);
    }
}