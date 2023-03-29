package lab2.functions.trigonometric;

import com.google.common.collect.MoreCollectors;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import lab2.functions.basic.Sin;
import lab2.functions.trigonometric.Tg;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnitParamsRunner.class)
public class TgTest {

    private final double eps = 0.1;

    @Mock
    private Sin sinMock;
    @Mock
    private Cos cosMock;

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
        double x = 1;
        Tg tg = new Tg();

        sinMock.setX(x);
        Mockito.when(sinMock.calc()).thenReturn(0.84);
        cosMock.setX(x);
        Mockito.when(cosMock.calc()).thenReturn(0.54);

    }
}