package lab2.functions.trigonometric;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lab2.functions.trigonometric.Tg;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TgTest {

    private final double eps = 0.1;

    @Test
    @Parameters({"0", "-1", "1", "3.14"})
    public void calc(double x) {
        double delta = Math.abs(new Tg(x).calc(eps) - Math.tan(x));
        Assert.assertTrue(delta <= eps);
    }
}