package lab2.functions;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lab2.functions.FunctionsSystem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FunctionsSystemTest {
    private final double eps = 0.01;

    @Test
    @Parameters({
            "-0.01, -0.01",
            "-0.5, -1.409",
            "-2, -3.968",
            "-3, -0.097",
            "0.3, 0.74",
            "0.5, 0",
            "2, 0.242"
    })
    public void calc(double arg, double expected) {
        FunctionsSystem functionsSystem = new FunctionsSystem();
        functionsSystem.init(arg);
        Assert.assertTrue(Math.abs(functionsSystem.calc(eps * eps) - expected) < eps);
    }
}