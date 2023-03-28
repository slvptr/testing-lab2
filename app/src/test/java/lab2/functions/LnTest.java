package lab2.functions;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
@RunWith(JUnitParamsRunner.class)

public class LnTest {
    private final double eps = 0.01;

    @Test
    @Parameters({"0.01", "1", "3.14", "5", "42", "1408"})
    public void calc(double x) {
        Ln ln = new Ln(x);
        double delta = Math.abs(ln.calc(eps) - Math.log(x));
        Assert.assertTrue(delta <= eps);
    }
}