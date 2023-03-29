package lab2.functions.trigonometric;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lab2.functions.basic.Sin;
import lab2.functions.trigonometric.Sec;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(JUnitParamsRunner.class)
public class SecTest {

    private final double eps = 0.01;
    @Mock
    private Cos cosMock;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @Parameters({"0", "-1", "1", "3.14"})
    public void calc(double x) {
        Sec sec = new Sec();
        sec.init(x);
        double delta = Math.abs(sec.calc(eps) - (1 / Math.cos(x)));
        Assert.assertTrue(delta <= eps);
    }

    @Test
    public void testWithMocks() {
        double x = Math.PI / 4;
        Mockito.when(cosMock.calc(eps)).thenReturn(0.707);

        Sec sec = new Sec();
        sec.setCos(cosMock);

        Assert.assertTrue(Math.abs(sec.calc(eps) - (1 / Math.cos(x))) <= eps);
    }
}