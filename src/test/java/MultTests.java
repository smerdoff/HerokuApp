import org.testng.Assert;
import org.testng.annotations.Test;

public class MultTests extends BaseCalculatorTest {

    @Test(description = "Проверка умножения с invocationCount", invocationCount = 4)
    public void multTestWithInvocationCount () {
        int mult = calculator.mult(5,20);
        Assert.assertEquals(mult,100);
    }

    @Test(description = "Проверка умножения с invocationCount и threadPoolSize", invocationCount = 4, threadPoolSize = 2)
    public void multTestWithThreadPoolSize() throws InterruptedException {
        Thread.sleep(5000);
        int mult = calculator.mult(10,20);
        Assert.assertEquals(mult,200);
    }
}
