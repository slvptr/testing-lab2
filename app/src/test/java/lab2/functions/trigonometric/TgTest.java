package lab2.functions.trigonometric;

import com.google.common.collect.MoreCollectors;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lab2.functions.Func;
import lab2.functions.basic.Sin;
import lab2.functions.trigonometric.Tg;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(JUnitParamsRunner.class)
public class TgTest {

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
    @Parameters({"0", "-1", "1", "3.14"})
    public void calc(double x) {
        Tg tg = new Tg();
        tg.init(x);
        double delta = Math.abs(tg.calc(eps) - Math.tan(x));
        Assert.assertTrue(delta <= eps);
    }

    @Test
    public void testWithMocks() {
        double x = Math.PI / 4;

        Mockito.when(sinMock.calc(eps)).thenReturn(0.707);
        Mockito.when(cosMock.calc(eps)).thenReturn(0.707);

        Tg tg = new Tg();
        tg.setSin(sinMock);
        tg.setCos(cosMock);

        Assert.assertTrue(Math.abs(tg.calc(eps) - Math.tan(x)) <= eps);
    }
}