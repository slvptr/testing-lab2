package lab2.functions;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CtgTest {

    private final double eps = 0.1;

    @Test
    @Parameters({"-1", "1", "-5", "5"})
    public void calc(double x) {
        double delta = Math.abs(new Ctg(x).calc(eps) - (1 / Math.tan(x)));
        Assert.assertTrue(delta <= eps);
    }
}