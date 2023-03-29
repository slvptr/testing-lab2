package lab2.functions.trigonometric;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lab2.functions.FunctionsSystem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CscTest {

    private final double eps = 0.1;

    @Test
    @Parameters({"-1", "1", "-5", "5"})
    public void calc(double x) {
        FunctionsSystem functionsSystem = new FunctionsSystem();
        functionsSystem.setX(x);
        double delta = Math.abs(functionsSystem.calc(eps) - (1 / Math.sin(x)));
        Assert.assertTrue(delta <= eps);
    }
}