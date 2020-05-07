import org.testng.Assert;
import org.testng.annotations.Test;

public class MultTests extends BaseCalculatorTest {

    @Test(description = "Проверка умножения с invocationCount", invocationCount = 4)
    public void multTestWithInvocationCount () {
        int mult = calculator.sum(10,20);
        Assert.assertEquals(mult,30);
    }

    @Test(description = "Проверка умножения с invocationCount и threadPoolSize", invocationCount = 4, threadPoolSize = 2)
    public void multTestWithThreadPoolSize() throws InterruptedException {
        Thread.sleep(5000);
        int mult = calculator.sum(10,20);
        Assert.assertEquals(mult,30);
    }
}
