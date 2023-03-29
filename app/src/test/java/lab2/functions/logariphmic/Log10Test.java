package lab2.functions.logariphmic;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lab2.functions.basic.Ln;
import lab2.functions.basic.Sin;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class Log10Test {
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
            "10",
            "100",
            "420"
    })
    public void calc(double x) {
        Log10 log10 = new Log10();
        log10.init(x);
        double delta = Math.abs(log10.calc(eps * eps) - Math.log(x) / Math.log(10));
        Assert.assertTrue(delta <= eps);
    }

    @Test
    public void testWithMocks() {
        double x = Math.PI / 4;
        Mockito.when(lnMock.calc(eps)).thenReturn(-0.241);

        Log10 log10 = new Log10();
        log10.setLn(lnMock);

        Assert.assertTrue(Math.abs(log10.calc(eps) - Math.log(x) / Math.log(10)) <= eps);
    }
}