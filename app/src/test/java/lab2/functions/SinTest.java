package lab2.functions;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class SinTest {

    private final double eps = 0.01;

    @Test
    @Parameters({"0", "-1", "1", "3.14", "-5", "5"})
    public void calc(double x) {
        Sin sin = new Sin(x);
        double delta = Math.abs(sin.calc(eps) - Math.sin(x));
        Assert.assertTrue(delta <= eps);
    }
}