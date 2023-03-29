package lab2.functions.trigonometric;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lab2.functions.FunctionsSystem;
import lab2.functions.basic.Sin;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(JUnitParamsRunner.class)
public class CscTest {

    private final double eps = 0.1;

    @Mock
    private Sin sinMock;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @Parameters({"-1", "1", "-5", "5"})
    public void calc(double x) {
        Csc csc = new Csc();
        csc.init(x);
        double delta = Math.abs(csc.calc(eps) - (1 / Math.sin(x)));
        Assert.assertTrue(delta <= eps);
    }

    @Test
    public void testWithMocks() {
        double x = Math.PI / 4;
        Mockito.when(sinMock.calc(eps)).thenReturn(0.707);

        Csc csc = new Csc();
        csc.setSin(sinMock);
        System.out.println(csc.calc());

        Assert.assertTrue(Math.abs(csc.calc(eps) - (1 / Math.sin(x))) <= eps);
    }
}