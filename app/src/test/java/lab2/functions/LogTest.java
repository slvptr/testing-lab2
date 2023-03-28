package lab2.functions;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class LogTest {

    private final double eps = 0.1;

    @Test
    @Parameters({
            "2, 4",
            "3, 9",
    })
    public void calc(int a, int b) {
        double delta = Math.abs(new Log(a, b).calc(eps) - 1);
        Assert.assertTrue(delta <= eps);
    }
}