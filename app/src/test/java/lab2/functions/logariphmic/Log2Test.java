package lab2.functions.logariphmic;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class Log2Test {

    private final double eps = 0.01;

    @Test
    @Parameters({
            "1",
            "2",
            "4",
            "10",
            "42"
    })
    public void calc(double x) {
        Log2 log2 = new Log2();
        log2.init(x);
        double delta = Math.abs(log2.calc(eps * eps) - Math.log(x) / Math.log(2));
        Assert.assertTrue(delta <= eps);
    }
}