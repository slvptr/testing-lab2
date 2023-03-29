package lab2.functions.logariphmic;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lab2.functions.basic.Ln;
import lab2.functions.trigonometric.Cos;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class Log2Test {

    private final double eps = 0.01;

    @Mock
    private Ln lnMock;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

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

    @Test
    public void testWithMocks() {
        double x = Math.PI / 4;
        Mockito.when(lnMock.calc(eps)).thenReturn(-0.241);

        Log2 log2 = new Log2();
        log2.setLn(lnMock);

        Assert.assertTrue(Math.abs(log2.calc(eps) - Math.log(x) / Math.log(2)) <= eps);
    }
}