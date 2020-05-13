import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivTests extends BaseCalculatorTest {

    @Parameters({"a", "b", "expectedDiv"})
    @Test (description = "Тест на деление и использованием параллельного запуска")
   public void firstDivTest(int a, int b, int expectedDiv) {
       int div = calculator.div(a,b);
       Assert.assertEquals(div, expectedDiv, "Ответы не совпадают");
    }
}
