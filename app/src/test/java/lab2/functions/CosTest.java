package lab2.functions;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CosTest {

    private final double eps = 0.1;

    @Test
    @Parameters({"0", "-1", "1", "3.14", "-5", "5"})
    public void calc(double x) {
        double delta = Math.abs(new Cos(x).calc(eps) - Math.cos(x));
        Assert.assertTrue(delta <= eps);
    }
}