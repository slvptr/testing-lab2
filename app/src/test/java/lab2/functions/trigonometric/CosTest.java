package lab2.functions.trigonometric;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lab2.functions.basic.Sin;
import lab2.functions.trigonometric.Cos;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(JUnitParamsRunner.class)
public class CosTest {

    private final double eps = 0.01;

    @Mock
    private Sin sinMock;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @Parameters({"1.57", "3.14", "-5", "5", "0.707"})
    public void calc(double x) {
        Cos cos = new Cos();
        cos.init(x);
        double delta = Math.abs(cos.calc(eps * eps) - Math.cos(x));
        Assert.assertTrue(delta <= eps);
    }

    @Test
    public void testWithMocks() {
        double x = Math.PI / 4;
        Mockito.when(sinMock.calc(eps)).thenReturn(0.707);

        Cos cos = new Cos();
        cos.setSin(sinMock);

        Assert.assertTrue(Math.abs(cos.calc(eps) - Math.cos(x)) <= eps);
    }

}