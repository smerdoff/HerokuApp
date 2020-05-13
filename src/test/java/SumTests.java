import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class SumTests extends BaseCalculatorTest {

    @DataProvider(name = "Данные для проверки суммы")
    public Object[][] dataForSum() {
        return new Object[][] {
                {5,3,8},
                {4,2,6},
                {1,2,3},
                {13,21, 34}
        };
    }

    @Test(description = "Обычная проверка суммы")
    public void simpleTestSum(int a, int b) {
        int sum = calculator.sum(3,5);
        Assert.assertEquals(sum, 8, "сумммы не совпадают");
    }

    @Test(dataProvider = "Данные для проверки суммы", description = "Проверка работы суммирования через dataProvider")
    public void testSumViaDataProvider(int a, int b, int expectedSum) {
        int sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expectedSum,"сумммы не совпадают");
    }

    @Test(retryAnalyzer = Retry.class, description = "Проверка суммирования с использованием Retry Analizer")
    public void testSumWithRetryAnalizer() {
        int sum = calculator.sum(10,20);
        Assert.assertEquals(sum, 30, "Суммы не совпадают");
        if (new Random().nextBoolean()) {
            Assert.fail();
        }
    }


}
