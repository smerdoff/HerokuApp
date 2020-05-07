import org.testng.Assert;
import org.testng.annotations.Test;

public class SubTests extends BaseCalculatorTest {
    int i = 1000;

    @Test(description = "Проверка вычитания с использованием приоритета", priority = 4)
    public void fourthSubtraction() {
        int sub = calculator.sub(i,250);
        Assert.assertEquals(sub, 0);
        i = sub;
    }

    @Test(description = "Проверка вычитания с использованием приоритета", priority = 1)
    public void firstSubtraction() {
        int sub = calculator.sub(i,300);
        Assert.assertEquals(sub, 700);
        i = sub;
    }

    @Test(description = "Проверка вычитания с использованием приоритета", priority = 3)
    public void thirdSubtraction() {
        int sub = calculator.sub(i,250);
        Assert.assertEquals(sub, 250);
        i = sub;
    }

    @Test(description = "Проверка вычитания с использованием приоритета", priority = 2)
    public void secondSubtraction() {
        int sub = calculator.sub(i,200);
        Assert.assertEquals(sub, 500);
        i = sub;
    }
}
