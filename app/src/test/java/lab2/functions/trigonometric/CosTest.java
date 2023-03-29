package lab2.functions.trigonometric;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lab2.functions.trigonometric.Cos;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CosTest {

    private final double eps = 0.01;

    @Test
    @Parameters({"1.57", "3.14", "-5", "5"})
    public void calc(double x) {
        double val = new Cos(x).calc(eps);
        double delta = Math.abs(val - Math.cos(x));
        Assert.assertTrue(delta <= eps);
    }
}