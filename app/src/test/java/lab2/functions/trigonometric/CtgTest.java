package lab2.functions.trigonometric;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lab2.functions.basic.Sin;
import lab2.functions.trigonometric.Ctg;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(JUnitParamsRunner.class)
public class CtgTest {

    private final double eps = 0.01;

    @Mock
    private Sin sinMock;
    @Mock
    private Cos cosMock;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @Parameters({"-1", "1", "-5", "5"})
    public void calc(double x) {
        Ctg ctg = new Ctg();
        ctg.init(x);
        double delta = Math.abs(ctg.calc(eps) - (1 / Math.tan(x)));
        Assert.assertTrue(delta <= eps);
    }

    @Test
    public void testWithMocks() {
        double x = Math.PI / 4;

        Mockito.when(sinMock.calc(eps)).thenReturn(0.707);
        Mockito.when(cosMock.calc(eps)).thenReturn(0.707);

        Ctg ctg = new Ctg();
        ctg.setSin(sinMock);
        ctg.setCos(cosMock);

        Assert.assertTrue(Math.abs(ctg.calc(eps) - Math.cos(x) / Math.sin(x)) <= eps);
    }
}